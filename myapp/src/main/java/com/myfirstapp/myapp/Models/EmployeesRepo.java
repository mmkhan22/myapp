package com.myfirstapp.myapp.Models;

import org.springframework.data.repository.CrudRepository;


public interface EmployeesRepo extends CrudRepository<Employees, String> {
}

