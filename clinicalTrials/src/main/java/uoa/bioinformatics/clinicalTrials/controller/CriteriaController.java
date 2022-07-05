package uoa.bioinformatics.clinicalTrials.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import uoa.bioinformatics.clinicalTrials.exception.ResourceNotFoundException;
import uoa.bioinformatics.clinicalTrials.model.Criteria;
import uoa.bioinformatics.clinicalTrials.repository.CriteriaRepository;
import uoa.bioinformatics.clinicalTrials.repository.ProtocolRepository;


@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1", produces = "application/json")
public class CriteriaController {
    @Autowired
    private CriteriaRepository criteriaRepository;

    @ResponseBody


    @GetMapping("/criteria/trial/{id}")
    public ResponseEntity<Criteria> getProtocolByTrialId(@PathVariable("id") String eudraCTNUmber)
            throws ResourceNotFoundException {
        Criteria criteria = criteriaRepository.findCriteriaByEudraCTNumber(eudraCTNUmber);
        return ResponseEntity.ok().body(criteria);
    }
}