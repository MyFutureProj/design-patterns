package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ravi Panchal
 */
public class DepartmentHead {

    List<Department> departmentList;

    private Integer id;

    private String name;

    public DepartmentHead(Integer id, String name){
        this.id = id;
        this.name = name;
        this.departmentList = new ArrayList<>();
    }

    public void addDepartment(Department department){
        departmentList.add(department);
    }

    public void removeDepartment(Department department){
        departmentList.remove(department);
    }

    public void showHierarchy(){
        System.out.println(name+ " is Head of following department");
        departmentList.forEach(d -> d.departmentName());
    }
}
