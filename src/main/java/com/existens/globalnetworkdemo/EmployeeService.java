package com.existens.globalnetworkdemo;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {
    private final Map<Integer, Employee> employeeMap = new HashMap<>();
    private static final int MAX_EMPLOYEES = 100;
    private Collection<Object> allEmployees;

    public Employee addEmployee(String fullName, int department, double salary) {
        if (employeeMap.size() >= MAX_EMPLOYEES) {
            throw new EmployeeStorageIsFullException();
        }
        Employee employee = new Employee(fullName, department, salary);
        if (employeeMap.containsValue(employee)) {
            throw new EmployeeAlreadyAddedException();
        }
        employeeMap.put(employee.getId(), employee);
        return employee;
    }

    public Employee removeEmployee(int id) {
        Employee employee = employeeMap.remove(id);
        if (employee == null) {
            throw new EmployeeNotFoundException();
        }
        return employee;
    }

    public Employee findEmployee(int id) {
        Employee employee = employeeMap.get(id);
        if (employee == null) {
            throw new EmployeeNotFoundException();
        }
        return employee;
    }


    public Collection<Object> getAllEmployees() {
        Collection<Object> allEmployees = null;
        return allEmployees;
    }

    public void setAllEmployees(Collection<Object> allEmployees) {
        this.allEmployees = allEmployees;
    }
}
