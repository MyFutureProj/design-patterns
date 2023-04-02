package com.designpatterns.structural.composite;

/**
 * @author Ravi Panchal
 */
public class FinanceDepartment implements Department{

    private Integer id;

    private String name;

    public FinanceDepartment(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public void departmentName() {
        System.out.println("* Finance Department");
    }
}
