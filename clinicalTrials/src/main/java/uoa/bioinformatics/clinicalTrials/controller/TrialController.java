package uoa.bioinformatics.clinicalTrials.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import uoa.bioinformatics.clinicalTrials.exception.ResourceNotFoundException;
import uoa.bioinformatics.clinicalTrials.model.Trial;
import uoa.bioinformatics.clinicalTrials.repository.TrialRepository;

import javax.servlet.http.HttpServletResponse;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController @CrossOrigin
@RequestMapping(value="/api/v1", produces = "application/json")
public class TrialController {
    @Autowired
    private TrialRepository trialRepository;

    @ResponseBody
    @RequestMapping(method = GET, produces = "application/json")
    public String demo() {
        return "{\"hello\":\"world\"}";
    }


    @GetMapping("/trials")
    public List<Trial> getAllTrials() {
        return trialRepository.findAll();
    }

    @GetMapping("/trials/{id}")
    public ResponseEntity<Trial> getTrialById(@PathVariable("id") String eudraCTNumber)
            throws ResourceNotFoundException {
        Trial trial = trialRepository.findById(eudraCTNumber)
                .orElseThrow(() -> new ResourceNotFoundException("Trial not found for this id :: " + eudraCTNumber));
        return ResponseEntity.ok().body(trial);
    }

    @PostMapping(value = "/trials", consumes = "application/json", produces = "application/json")
    public String createTrial(@RequestBody Trial trial) {
        System.out.println("trialDetails:" + trial + " ");
        trialRepository.save(trial);
        return "true";
    }


    @PutMapping("/trials/{id}")
    public ResponseEntity<Trial> updateTrial(@PathVariable(value = "id") String eudraCTNumber,
                                                   @RequestBody Trial newTrialDetails) throws ResourceNotFoundException {
        System.out.println("trialDetails:" + newTrialDetails);
        Trial trial = trialRepository.findById(eudraCTNumber)
                .orElseThrow(() -> new ResourceNotFoundException("Trial not found for this eudraCTNumber :: " + eudraCTNumber));

        trial.setTrialStatus(newTrialDetails.getTrialStatus());
        trial.setDesignOfTheTrial(newTrialDetails.getDesignOfTheTrial());
        trial.setTrialTypePhase(newTrialDetails.getTrialTypePhase());
        trial.setScopeOfTheTrial(newTrialDetails.getScopeOfTheTrial());
        trial.setEstimatedDuration(newTrialDetails.getEstimatedDuration());
        trial.setLink(newTrialDetails.getLink());
        trial.setTherapeuticArea(newTrialDetails.getTherapeuticArea());
        trial.setNumberOfSubjects(newTrialDetails.getNumberOfSubjects());
        trial.setFirstAddedDate(newTrialDetails.getFirstAddedDate());

        final Trial updatedTrial = trialRepository.save(trial);
        return ResponseEntity.ok(updatedTrial);
    }

    @DeleteMapping("/trials/{id}")
    public Map<String, Boolean> deleteTrial(@PathVariable(value = "id") String eudraCTNumber)
            throws ResourceNotFoundException {
        Trial trial = trialRepository.findById(eudraCTNumber)
                .orElseThrow(() -> new ResourceNotFoundException("Trial not found for this id :: " + eudraCTNumber));

        trialRepository.delete(trial);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
