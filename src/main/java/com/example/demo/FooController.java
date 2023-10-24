package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FooController {
    @GetMapping
    public Bar getBar() {
        return new BarImpl();
    }
}
