package uoa.bioinformatics.clinicalTrials.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import uoa.bioinformatics.clinicalTrials.exception.ResourceNotFoundException;
import uoa.bioinformatics.clinicalTrials.model.Sponsor;
import uoa.bioinformatics.clinicalTrials.repository.SponsorRepository;



@RestController @CrossOrigin
@RequestMapping(value="/api/v1", produces = "application/json")
public class SponsorController {
    @Autowired
    private SponsorRepository sponsorRepository;


    @GetMapping("/sponsors")
    public List<Sponsor> getAllSponsors() {
        return sponsorRepository.findAll();
    }

    @GetMapping("/sponsors/{id}")
    public ResponseEntity<Sponsor> getSponsorById(@PathVariable("id") String sponsorId)
        throws ResourceNotFoundException {
            Sponsor sponsor = sponsorRepository.findById(sponsorId)
                .orElseThrow(() -> new ResourceNotFoundException("Trial not found for this id :: " + sponsorId));
        return ResponseEntity.ok().body(sponsor);
    }

}
