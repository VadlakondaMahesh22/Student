package com.practice;

import com.practice.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewPractice {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "John Smith", "IT", 29, "Male", "2020-05-10", 75000));
        employees.add(new Employee(2, "Alice Brown", "HR", 35, "Female", "2018-03-22", 68000));
        employees.add(new Employee(3, "Bob Johnson", "Finance", 41, "Male", "2015-11-01", 88000));
        employees.add(new Employee(4, "Maria Davis", "IT", 27, "Female", "2021-07-15", 72000));
        employees.add(new Employee(5, "Kevin White", "Marketing", 33, "Male", "2019-09-30", 65000));
        employees.add(new Employee(6, "Linda Moore", "Operations", 38, "Female", "2016-01-10", 70000));
        employees.add(new Employee(7, "James Taylor", "Finance", 45, "Male", "2014-12-05", 91000));
        employees.add(new Employee(8, "Emma Wilson", "HR", 30, "Female", "2020-08-19", 69000));
        employees.add(new Employee(9, "Ryan Clark", "IT", 26, "Male", "2022-02-01", 71000));
        employees.add(new Employee(10, "Sophia Hall", "Marketing", 32, "Female", "2017-06-25", 66000));

        Map<String, Long> result = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        result.forEach((k, v) -> System.out.println(" key :" + k + " value :" + v));

        employees.stream().map(e -> e.getDepartment()).distinct().forEach(System.out::println);

        employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge))).forEach((k, v) -> System.out.println(k + "-" + v));

        Optional<String> s = employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).map(e-> e.getName()+" - "+ e.getSalary());
        System.out.println(s.get());

      //  employees.stream().filter(e-> e.getDoj().getYear())
    }
}
