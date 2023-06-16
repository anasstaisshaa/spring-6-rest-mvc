package com.anastasiiatkachuk.springframework.spring6restmvc.controller;

import com.anastasiiatkachuk.springframework.spring6restmvc.model.Beer;
import com.anastasiiatkachuk.springframework.spring6restmvc.model.Customer;
import com.anastasiiatkachuk.springframework.spring6restmvc.services.BeerService;
import com.anastasiiatkachuk.springframework.spring6restmvc.services.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Slf4j
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    @PatchMapping("{customerId}")
    public ResponseEntity updateCustomer(@PathVariable UUID customerId, @RequestBody Customer customer){

        customerService.patchBeerById(customerId, customer);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("{customerId}")
    public ResponseEntity deleteById(@PathVariable UUID customerId){

        customerService.deleteById(customerId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("{customerId}")
    public ResponseEntity updateById(@PathVariable UUID customerId, @RequestBody Customer customer){

        customerService.updateById(customerId, customer);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity handlePost(@RequestBody Customer customer){
        Customer customerSaved = customerService.saveNewCustomer(customer);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "/api/v1/customer" + customerSaved.getId().toString());

        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> listBeers(){
        return customerService.listCustomers();
    }

    @RequestMapping(value = "{customerId}", method = RequestMethod.GET)
    public Customer getBeerById(@PathVariable("customerId") UUID customerId){

        log.debug("Get Beer by Id - in controller");

        return customerService.getCustomerById(customerId);
    }
}
