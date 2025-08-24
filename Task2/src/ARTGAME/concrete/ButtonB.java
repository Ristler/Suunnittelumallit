package ARTGAME.concrete;

import ARTGAME.Button;

public class ButtonB extends Button {

    public ButtonB(String text) {
        this.text = text;
    }
    public void display() {
        System.out.println(
                "-----------" + "\n"+
                        "| ButtonB | "+text +
                        "\n" +
                        "-----------");
    }
}
