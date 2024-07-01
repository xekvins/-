package com.existens.globalnetworkdemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestParam String fullName, @RequestParam int department, @RequestParam double salary) {
        return employeeService.addEmployee(fullName, department, salary);
    }

    @DeleteMapping("/remove")
    public Employee removeEmployee(@RequestParam int id) {
        return employeeService.removeEmployee(id);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam int id) {
        return employeeService.findEmployee(id);
    }
}

