package com.designpatterns.structural.composite;

/**
 * @author Ravi Panchal
 */
public class ITDepartment implements Department{

    private Integer id;

    private String name;

    public ITDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void departmentName() {
        System.out.println("* IT Department");
    }

}
