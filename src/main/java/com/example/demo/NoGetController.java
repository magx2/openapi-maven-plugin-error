package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@RestController
public class NoGetController {
    @GetMapping("/noget")
    public ResponseEntity<NoGetInterface> noGet(Foo foo) {
        return ResponseEntity.of(Optional.empty());
    }
}
