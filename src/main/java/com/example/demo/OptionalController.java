package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class OptionalController {
    @GetMapping
    public String optionalParameter(@RequestParam("optional") Optional<String> optional) {
        return optional.orElse("default");
    }
}
