package COMPOSITE.composites;

import COMPOSITE.Component;
import java.util.ArrayList;
import java.util.List;

public class Department extends Component {
    protected List<Component> children;

    public Department(String name) {
        super(name);
        this.children = new ArrayList<>();
    }

    @Override
    public void add(Component component) {
        this.children.add(component);
    }

    @Override
    public void remove(Component component) {
        this.children.remove(component);
    }

    @Override
    public int getSalary() {
        int total = 0;

        for (Component c : this.children) {
            total += c.getSalary();
        }
        return total;
    }

    @Override
    public String print() {
        StringBuilder build = new StringBuilder("<Department> \n" +
                " <name>"+name+"</name> \n");

        for(Component c : this.children) {
            build.append(c.print());
        }
        build.append("</Department>\n");
        return build.toString();
    }
}
