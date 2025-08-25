package COMPOSITE.composites;

import COMPOSITE.Component;
import java.util.ArrayList;
import java.util.List;

public class Organization extends Component {
    protected List<Component> children;

    public Organization(String name) {
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
        System.out.println(this.name + " organizations total salary: "+total);
        return total;
    }

    @Override
    public String print() {
        StringBuilder build = new StringBuilder("<Organization> \n" +
                " <name>"+name+"</name> \n");

        for(Component c : this.children) {
            build.append(c.print());
        }
        build.append("</Organization>");
        return build.toString();
    }
}