package edu.icet.ecom.service;

import edu.icet.ecom.dto.Customer;
import java.util.*;
public interface CustomerService {

    void add (Customer customer);
    void update (Customer customer);
    Customer search(Integer id);
    List<Customer> getAll();
    void delete(Integer id);
}
