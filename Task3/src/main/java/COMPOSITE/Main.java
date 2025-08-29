package COMPOSITE;

import COMPOSITE.composites.Department;
import COMPOSITE.composites.Organization;
import COMPOSITE.leafs.Employee;

public class Main {
    public static void main(String[]args) {

        Organization org = new Organization("Apple");
        Department leadDepartment = new Department("Lead Department");
        Department programming = new Department("Programming");

        Employee employee1 = new Employee("Steve Wozniak", 2500000);
        Employee employee2 = new Employee("Steve Jobs", 2500000);

        Employee programmer1 = new Employee("John", 100000);
        Employee programmer2 = new Employee("Carl", 100000);

        programming.add(programmer1);
        programming.add(programmer2);

        leadDepartment.add(employee1);
        leadDepartment.add(employee2);

        org.add(leadDepartment);
        org.add(programming);

        org.getSalary();

        System.out.println(org.print());
    }
}
