package com.Test;

import java.util.List;

public interface CustomerServiceIn {

     List<Customer> getAllCustomers();
     void addCustomer(Customer customer);
     void updateCustomer(String Id, Customer customer);
     void deleteCustomer(Customer customer);
}
