package uoa.bioinformatics.clinicalTrials.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import uoa.bioinformatics.clinicalTrials.exception.ResourceNotFoundException;
import uoa.bioinformatics.clinicalTrials.model.Trial;
import uoa.bioinformatics.clinicalTrials.model.User;
import uoa.bioinformatics.clinicalTrials.repository.UserRepository;

import javax.servlet.http.HttpServletResponse;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController @CrossOrigin
@RequestMapping(value="/api/v1", produces = "application/json")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") String userId)
            throws ResourceNotFoundException {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("Trial not found for this id :: " + userId));
        return ResponseEntity.ok().body(user);
    }

    @PostMapping(value = "/login", consumes = "application/json", produces = "application/json")
    public User loginUser(@RequestBody Map<String, String> credentials) throws ResourceNotFoundException {
        User user = userRepository.findById(credentials.get("userId"))
                .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + credentials.get("userId")));
        if (credentials.get("pass").equals(user.getPass())) {
            return user;
        } else {
            return null;
        }
    }



}
