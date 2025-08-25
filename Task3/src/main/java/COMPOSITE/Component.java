package COMPOSITE;

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }
    public abstract String print();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract int getSalary();
}
