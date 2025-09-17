package memento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Memento implements IMemento {
    private int[] options;
    private boolean isSelected;
    private String timestamp;
    private String description;

    public Memento(int[] options, boolean isSelected, String description) {
        this.options = options.clone();
        this.isSelected = isSelected;
        this.description = description;
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("Memento created: " + this.description + " at " + this.timestamp);
    }

    public Memento(int[] options, boolean isSelected) {
        this(options, isSelected, "State saved");
    }

    public int[] getOptions() {
        return options;
    }

    public boolean isSelected() {
        return isSelected;
    }

    @Override
    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
