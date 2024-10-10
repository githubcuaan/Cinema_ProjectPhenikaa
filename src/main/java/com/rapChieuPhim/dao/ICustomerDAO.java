package com.rapChieuPhim.dao;

import com.rapChieuPhim.model.Customers;
import java.util.List;

public interface ICustomerDAO {
    List<Customers> getAllCustomers();
    Customers getCustomerById(String id);
    void addCustomer(Customers customer);
    void updateCustomer(Customers customer);
    void deleteCustomer(String id);
    Customers login(String username, String password);
    void register(Customers customer);
}