package com.rapChieuPhim.dao;
import com.rapChieuPhim.model.Employee;

public interface IEmployeeDAO {
    Employee login(String username, String password);
}
