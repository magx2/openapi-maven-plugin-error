package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
