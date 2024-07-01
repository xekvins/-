package com.existens.globalnetworkdemo;

public class EmployeeAlreadyAddedException extends RuntimeException {
        public EmployeeAlreadyAddedException() {
            super("Employee already added");
        }
}
