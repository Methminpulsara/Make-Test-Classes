package edu.icet.ecom.service.impl;


import edu.icet.ecom.dto.Customer;
import edu.icet.ecom.entity.CustomerEntity;
import edu.icet.ecom.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceImplTest {

    @Mock
    private CustomerRepository repository;

    @Mock
    private ModelMapper mapper;

    @InjectMocks
    private CustomerServiceImpl service;

    private Customer customer;
    private CustomerEntity customerEntity;



    @BeforeEach
    void setUp() {
        // Sample test data
        customer = new Customer();
        customer.setId(1);
        customer.setName("John Doe");

        customerEntity = new CustomerEntity();
        customerEntity.setId(1);
        customerEntity.setName("John Doe");
    }

    @Test
    void testAddCustomer() {
        when(mapper.map(customer, CustomerEntity.class)).thenReturn(customerEntity);
        service.add(customer);
        verify(repository, times(1)).save(customerEntity);
    }


}
