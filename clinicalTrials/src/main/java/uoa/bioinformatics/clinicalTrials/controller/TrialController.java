package uoa.bioinformatics.clinicalTrials.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import uoa.bioinformatics.clinicalTrials.exception.ResourceNotFoundException;
import uoa.bioinformatics.clinicalTrials.model.Trial;
import uoa.bioinformatics.clinicalTrials.repository.TrialRepository;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
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
//        return trialRepository.save(trial);
        return "Hello" + trial.getDesignOfTheTrial();
    }


    @PutMapping("/trials/{id}")
    public ResponseEntity<Trial> updateTrial(@PathVariable(value = "id") String eudraCTNumber,
                                                   @RequestBody Trial newTrialDetails) throws ResourceNotFoundException {
        System.out.println("trialDetails:" + newTrialDetails);
        Trial trial = trialRepository.findById(eudraCTNumber)
                .orElseThrow(() -> new ResourceNotFoundException("Trial not found for this eudraCTNumber :: " + eudraCTNumber));

        System.out.println("trial" + trial);
//        trial.setTrialStatus(trialDetails.getTrialStatus());
//        trial.setDesignOfTheTrial(trialDetails.getDesignOfTheTrial());
//        trial.setTrialTypePhase(trialDetails.getTrialTypePhase());
//        trial.setScopeOfTheTrial(trialDetails.getScopeOfTheTrial());
//        trial.setEstimatedDuration(trialDetails.getEstimatedDuration());
//        trial.setLink(trialDetails.getLink());
//        trial.setTherapeuticArea(trialDetails.getTherapeuticArea());
//        trial.setNumberOfSubjects(trialDetails.getNumberOfSubjects());
//        trial.setFirstAddedDate(trialDetails.getFirstAddedDate());

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
