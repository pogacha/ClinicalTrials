package uoa.bioinformatics.clinicalTrials.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uoa.bioinformatics.clinicalTrials.exception.ResourceNotFoundException;
import uoa.bioinformatics.clinicalTrials.model.Imp;

import uoa.bioinformatics.clinicalTrials.model.Protocol;
import uoa.bioinformatics.clinicalTrials.repository.ImpRepository;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1", produces = "application/json")
public class ImpController {
    @Autowired
    private ImpRepository impRepository;

    @GetMapping("/imps")
    public List<Imp> getAllImps() {
        return impRepository.findAll();
    }

    @GetMapping("/imps/trial/{id}")
    public ResponseEntity<Imp> getImpByTrialId(@PathVariable("id") String eudraCTNUmber)
            throws ResourceNotFoundException {
        Imp imp = impRepository.findImpByEudraCTNumber(eudraCTNUmber);
        return ResponseEntity.ok().body(imp);
    }
}