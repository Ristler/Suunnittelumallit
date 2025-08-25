package COMPOSITE.leafs;

import COMPOSITE.Component;

public class Employee extends Component {
    protected int salary;

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("Not supported in leaf.");

    }

    @Override
    public int getSalary() {
        return this.salary;
    }

    @Override
    public String print() {
        return "<Employee> \n" +
                " <name>"+name+"</name>\n" +
                " <salary>"+salary+"</salary>\n" +
                "</Employee>\n";
    }
}
