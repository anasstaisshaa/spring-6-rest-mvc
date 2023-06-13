package com.anastasiiatkachuk.springframework.spring6restmvc.controller;

import com.anastasiiatkachuk.springframework.spring6restmvc.model.Beer;
import com.anastasiiatkachuk.springframework.spring6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@AllArgsConstructor
@Slf4j
@Controller
public class BeerController {

    private final BeerService beerService;

    public Beer getBeerById(UUID id){

        log.debug("Get Beer by Id - in controller");

        return beerService.getBeerById(id);
    }
}