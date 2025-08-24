package ARTGAME;

public abstract class Button {

    protected String text;


    public abstract void display();


    public void setText(String newText) {
        this.text = newText;
    }
}
