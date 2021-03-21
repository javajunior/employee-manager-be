package dev.javajunior.employeemanager.repository;

import dev.javajunior.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findEmployeeById(Long id);
    void deleteEmployeeById(Long id);
}
