package com.anastasiiatkachuk.springframework.spring6restmvc.services;

import com.anastasiiatkachuk.springframework.spring6restmvc.model.Beer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

public interface BeerService {
    List<Beer> listBeers();

    Beer getBeerById(UUID id);
}
