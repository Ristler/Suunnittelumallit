package ARTGAME.concrete;
import ARTGAME.TextField;

public class TextFieldB extends TextField {

    public TextFieldB(String text) {
        this.text = text;
    }
    public void display() {

        int textLength = text.length();
        StringBuilder x = new StringBuilder("----");
        x.append("-".repeat(textLength));
        System.out.println(
                        x + "\n"+
                        "| "+ text +" |"+
                        "\n" + x);
    }
}
