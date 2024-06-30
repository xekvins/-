package com.existens.globalnetworkdemo;

public class EmployeeStorageIsFullException extends RuntimeException {
        public EmployeeStorageIsFullException() {
            super("Employee storage is full");
        }
    }
