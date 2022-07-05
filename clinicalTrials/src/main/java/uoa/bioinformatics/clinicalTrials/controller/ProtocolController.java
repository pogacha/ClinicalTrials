package uoa.bioinformatics.clinicalTrials.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import uoa.bioinformatics.clinicalTrials.exception.ResourceNotFoundException;
import uoa.bioinformatics.clinicalTrials.model.Protocol;
import uoa.bioinformatics.clinicalTrials.model.Trial;
import uoa.bioinformatics.clinicalTrials.repository.ProtocolRepository;

import javax.servlet.http.HttpServletResponse;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController @CrossOrigin
@RequestMapping(value="/api/v1", produces = "application/json")
public class ProtocolController {
    @Autowired
    private ProtocolRepository protocolRepository;

    @ResponseBody


    @GetMapping("/protocols")
    public List<Protocol> getAllProtocols() {
        return protocolRepository.findAll();
    }

    @GetMapping("/protocol/{id}")
    public ResponseEntity<Protocol> getProtocolById(@PathVariable("id") String protocolCodeNumber)
            throws ResourceNotFoundException {
        Protocol protocol = protocolRepository.findById(protocolCodeNumber)
                .orElseThrow(() -> new ResourceNotFoundException("Protocol not found for this id :: " + protocolCodeNumber));
        return ResponseEntity.ok().body(protocol);
    }
}