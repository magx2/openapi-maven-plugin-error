package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@RestController
public class FooControllerImpl implements FooController {
    @GetMapping
    public ResponseEntity<Bar> getBar() {
        return ResponseEntity.of(Optional.empty());
    }

    @Override
    public ResponseEntity<Collection<Bar>> youAreAwesome(Foo foo) {
        return ResponseEntity.of(Optional.of(new ArrayList<>()));
    }
}
