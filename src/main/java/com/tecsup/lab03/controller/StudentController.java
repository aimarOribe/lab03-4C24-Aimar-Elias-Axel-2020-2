package com.tecsup.lab03.controller;

import com.tecsup.lab03.model.Student;

public class StudentController {
    public static void main(String[] args) {
        Student std = new Student("Generic", 56);
        std.print();
    }
}
