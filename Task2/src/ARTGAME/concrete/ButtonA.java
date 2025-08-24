package ARTGAME.concrete;
import ARTGAME.Button;

public class ButtonA extends Button {

    public ButtonA(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println(
                "-----------" + "\n"+
                "| ButtonA | "+text +
                "\n" +
                "-----------");
    }
}
