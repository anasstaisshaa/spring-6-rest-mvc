package com.anastasiiatkachuk.springframework.spring6restmvc.mappers;

import com.anastasiiatkachuk.springframework.spring6restmvc.entities.Customer;
import com.anastasiiatkachuk.springframework.spring6restmvc.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}
