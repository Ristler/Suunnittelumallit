package ARTGAME.concrete;
import ARTGAME.Checkbox;


public class CheckboxB extends Checkbox {


    public CheckboxB(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println(
                "-|-|-" + "\n"+
                        "| X | "+text +
                        "\n" +
                        "-|-|-");

    }
}
