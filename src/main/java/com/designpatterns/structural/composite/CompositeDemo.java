package com.designpatterns.structural.composite;

/**
 Composite:
 Allows objects to be treated as a single unit.
 It is used to compose objects into tree
 structures, and to create complex objects
 from simpler ones.

 • Hierarchical representations of objects
 are needed.
 • Objects and compositions of objects
 should be treated uniformly.

 */
public class CompositeDemo {
    public static void main(String[] args) {
        DepartmentHead departmentHead = new DepartmentHead(1, "Elon Musk");
        departmentHead.addDepartment(new FinanceDepartment(2, "Mahesh"));
        departmentHead.addDepartment(new ITDepartment(3, "Suresh"));
        departmentHead.showHierarchy();
    }
}
