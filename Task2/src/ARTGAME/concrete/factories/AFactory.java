package ARTGAME.concrete.factories;

import ARTGAME.Button;
import ARTGAME.Checkbox;
import ARTGAME.TextField;
import ARTGAME.UIFactory;
import ARTGAME.concrete.ButtonA;
import ARTGAME.concrete.CheckboxA;
import ARTGAME.concrete.TextFieldA;

public class AFactory extends UIFactory {

    @Override
    public Button createButton(String text) {
        return new ButtonA(text);
    }

    @Override
    public Checkbox createCheckBox(String text) {
        return new CheckboxA(text);
    }
    @Override
    public TextField createTextField(String text) {
        return new TextFieldA(text);
    }
}
