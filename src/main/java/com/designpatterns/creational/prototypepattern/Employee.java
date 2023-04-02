package com.designpatterns.creational.prototypepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ravi Panchal
 */
public class Employee implements Cloneable{

    private List<String> empList;

    public Employee(){
        empList = new ArrayList<>();
    }

    public Employee(List<String> employeeList){
        this.empList = employeeList;
    }

    public List<String> setEmpList(){
        empList.add("Ravi");
        empList.add("Vivek");
        empList.add("Rohit");
        empList.add("Krunal");
        return empList;
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> empTempList = new ArrayList<>();
        empList.forEach(emp -> empTempList.add(emp));
        return new Employee(empTempList);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empList=" + empList +
                '}';
    }
}

