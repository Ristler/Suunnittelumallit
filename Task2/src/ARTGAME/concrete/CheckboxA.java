package ARTGAME.concrete;

import ARTGAME.Checkbox;

public class CheckboxA extends Checkbox {

    public CheckboxA(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println(
                        "-----" + "\n"+
                        "| X | "+text +
                        "\n" +
                        "-----");

    }
}
