package com.example.TrionaOppg.controller;

import com.example.TrionaOppg.model.UserInput;
import com.example.TrionaOppg.repository.UserInputRepository;
import org.springframework.http.HttpStatus;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;



@RequestMapping("/userInput")
@RestController
public class UserInputController {
    private final UserInputRepository userInputRepository;

    public UserInputController(UserInputRepository userInputRepository) {
        this.userInputRepository = userInputRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addUserInput(@RequestBody UserInput userInput) {
        userInputRepository.save(userInput);
    }

    @GetMapping
    public Iterable<UserInput> getAllUserInputs() {
        return userInputRepository.findAll();
    }
}
