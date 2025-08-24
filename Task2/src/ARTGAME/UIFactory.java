package ARTGAME;

public abstract class UIFactory {
    public abstract Button createButton(String text);
    public abstract Checkbox createCheckBox(String text);
    public abstract TextField createTextField(String text);


}
