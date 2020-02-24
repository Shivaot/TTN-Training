package com.tothenew;

interface iEmployee {
    public Employee employee(String name,int age,String city);
}

class Employee {
    private String name;
    private int age;
    private String city;

    public Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Employee() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

public class Ans4 {
    public static void main(String[] args) {
        iEmployee iEmployee = Employee::new;
        Employee employee = iEmployee.employee("Shiva",22,"Ghaziabad");
        System.out.println(employee);


    }
}
