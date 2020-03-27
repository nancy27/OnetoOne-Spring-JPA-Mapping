package com.example.JpaMapping;

import com.example.JpaMapping.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findByEmployeeId(Integer employeeId);

    Employee findByEmployeeName(String employeeName);
}
