package com.anastasiiatkachuk.springframework.spring6restmvc.services;

import com.anastasiiatkachuk.springframework.spring6restmvc.model.Beer;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID id);
}
