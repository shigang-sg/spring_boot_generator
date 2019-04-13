package main.java.com.dao;

import main.java.com.po.Employee;

public interface EmployeeMapper {
    int insert(Employee record);

    int insertSelective(Employee record);
}