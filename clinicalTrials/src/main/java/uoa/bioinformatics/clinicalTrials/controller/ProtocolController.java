package uoa.bioinformatics.clinicalTrials.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import uoa.bioinformatics.clinicalTrials.exception.ResourceNotFoundException;
import uoa.bioinformatics.clinicalTrials.model.Protocol;
import uoa.bioinformatics.clinicalTrials.model.Trial;
import uoa.bioinformatics.clinicalTrials.repository.ProtocolRepository;

import javax.servlet.http.HttpServletResponse;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1", produces = "application/json")
public class ProtocolController {
    @Autowired
    private ProtocolRepository protocolRepository;

    @ResponseBody

    @GetMapping("/protocols")
    public List<Protocol> getAllProtocols() {
        return protocolRepository.findAll();
    }

    @GetMapping("/protocol/trial/{id}")
    public ResponseEntity<Protocol> getProtocolByTrialId(@PathVariable("id") String eudraCTNUmber)
            throws ResourceNotFoundException {
        Protocol protocol = (Protocol) protocolRepository.findProtocolByEudraCTNumber(eudraCTNUmber);
        return ResponseEntity.ok().body(protocol);
    }
}