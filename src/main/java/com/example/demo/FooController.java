package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

import static com.example.demo.FooController.API_PREFIX;

/**
 * Endpoint to request the deployed applications in TomCat
 *
 *
 */
@RequestMapping(API_PREFIX)
public interface FooController {

    String API_PREFIX = "/api";
    @PostMapping(path = "/youAreAwesome-applications")
    ResponseEntity<Collection<Bar>> youAreAwesome(@RequestBody Foo foo);

    @PutMapping(path = "/error2")
     Error error2();
}
