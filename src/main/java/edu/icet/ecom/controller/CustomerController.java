package edu.icet.ecom.controller;


import edu.icet.ecom.dto.Customer;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
@Configuration
@RequiredArgsConstructor

public class CustomerController {

    final CustomerService service;

    @PostMapping("/add")
    public void add(@RequestBody Customer customer){
        service.add(customer);
    }

    @PutMapping("/update")
    public void update(@RequestBody Customer customer){
        service.add(customer);
    }



}
