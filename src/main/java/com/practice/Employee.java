package com.practice;

public class Employee {
        private int id;
        private String name;
        private String department;
        private int age;
        private String gender;
        private String doj; // Date of Joining as String (or use LocalDate)
        private double salary;


        public void setId(int id) {
                this.id = id;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setDepartment(String department) {
                this.department = department;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public void setDoj(String doj) {
                this.doj = doj;
        }

        public void setSalary(double salary) {
                this.salary = salary;
        }

        public int getId() {
                return id;
        }

        public String getName() {
                return name;
        }

        public String getDepartment() {
                return department;
        }

        public int getAge() {
                return age;
        }

        public String getGender() {
                return gender;
        }

        public String getDoj() {
                return doj;
        }

        public double getSalary() {
                return salary;
        }

        public Employee(int id, String name, String department, int age, String gender, String doj, double salary) {
                this.id = id;
                this.name = name;
                this.department = department;
                this.age = age;
                this.gender = gender;
                this.doj = doj;
                this.salary = salary;
        }
}
