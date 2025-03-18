package edu.icet.ecom.controller;


import edu.icet.ecom.dto.Customer;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
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

    @GetMapping("/search")
    public Customer search(@PathVariable Integer id ){
       return service.search(id);
    }

    @GetMapping("/getAll")
    public List<Customer>getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }





}
