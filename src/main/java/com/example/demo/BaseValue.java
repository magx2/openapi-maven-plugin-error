package com.example.demo;

import java.util.Optional;

public interface BaseValue <T, VAL>{
    VAL getValue();

    Optional<T> getUnit();
}
