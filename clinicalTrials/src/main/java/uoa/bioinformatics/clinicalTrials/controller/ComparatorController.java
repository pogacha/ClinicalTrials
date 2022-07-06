package uoa.bioinformatics.clinicalTrials.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import uoa.bioinformatics.clinicalTrials.exception.ResourceNotFoundException;
import uoa.bioinformatics.clinicalTrials.model.Comparator;
import uoa.bioinformatics.clinicalTrials.repository.ComparatorRepository;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1", produces = "application/json")
public class ComparatorController {
    @Autowired
    private ComparatorRepository comparatorRepository;

    @ResponseBody
    @GetMapping("/comparators/trial/{id}")
    public ResponseEntity<List<Comparator>> getComparatorsByTrialId(@PathVariable("id") String eudraCTNUmber)
            throws ResourceNotFoundException {
        List<Comparator> comparators = comparatorRepository.findComparatorByEudraCTNumber(eudraCTNUmber);
        return ResponseEntity.ok().body(comparators);
    }
}