package uoa.bioinformatics.clinicalTrials.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uoa.bioinformatics.clinicalTrials.exception.ResourceNotFoundException;
import uoa.bioinformatics.clinicalTrials.model.ActiveSubstance;
import uoa.bioinformatics.clinicalTrials.model.Imp;
import uoa.bioinformatics.clinicalTrials.repository.ActiveSubstanceRepository;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1", produces = "application/json")
public class ActiveSubstanceController {
    @Autowired
    private ActiveSubstanceRepository activeSubstanceRepository;

    @GetMapping("/activesub")
    public List<ActiveSubstance> getAllActiveSubstance() {
        return activeSubstanceRepository.findAll();
    }

    @GetMapping("/imps/activesubstance/{id}")
    public ResponseEntity<List<ActiveSubstance>> getActiveSubstanceAtImp(@PathVariable("id") String impId)
            throws ResourceNotFoundException {
        List<ActiveSubstance> as = activeSubstanceRepository.findActiveSubstanceByImpId(impId);
        return ResponseEntity.ok().body(as);
    }
}