package com.Test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements CustomerServiceIn{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers(){
        List<Customer> customer= new ArrayList<>();
        customerRepository.findAll().forEach(customer::add);
        return customer;
    }
    @Override
    public void addCustomer(Customer customer){
        customerRepository.save(customer);
    }
    @Override
    public void updateCustomer(String Id, Customer customer){
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
customerRepository.delete(customer);
    }
}
