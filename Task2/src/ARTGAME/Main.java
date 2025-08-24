package ARTGAME;
import ARTGAME.concrete.factories.AFactory;
import ARTGAME.concrete.factories.BFactory;


public class Main {
    public static void main(String[]args) {

        UIFactory factoryA = new AFactory();
        UIFactory factoryB = new BFactory();

        System.out.println("Factory A");
        Button buttonA = factoryA.createButton("Hello!");
        Checkbox checkboxA = factoryA.createCheckBox("Hey");
        TextField textfieldA = factoryA.createTextField("Hi");

        System.out.println("");
        buttonA.display();
        checkboxA.display();
        textfieldA.display();

        buttonA.setText("Text changed.");
        buttonA.display();

        checkboxA.setText("Text changed.");
        checkboxA.display();

        textfieldA.setText("Text Changed");
        textfieldA.display();

        System.out.println("");


        System.out.println("Factory B");

        Button buttonB = factoryB.createButton("Hello!");
        Checkbox checkboxB = factoryB.createCheckBox("Hey");
        TextField textfieldB = factoryB.createTextField("Hi");

        System.out.println("");
        buttonB.display();
        checkboxB.display();
        textfieldB.display();

        buttonB.setText("Text changed.");
        buttonB.display();

        checkboxB.setText("Text changed.");
        checkboxB.display();

        textfieldB.setText("T");
        textfieldB.display();
    }
}
