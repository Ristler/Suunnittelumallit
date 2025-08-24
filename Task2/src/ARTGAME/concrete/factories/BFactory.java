package ARTGAME.concrete.factories;

import ARTGAME.Button;
import ARTGAME.Checkbox;
import ARTGAME.TextField;
import ARTGAME.UIFactory;
import ARTGAME.concrete.ButtonB;
import ARTGAME.concrete.CheckboxB;
import ARTGAME.concrete.TextFieldB;

public class BFactory extends UIFactory {
    @Override
    public Button createButton(String text) {
        return new ButtonB(text);
    }

    @Override
    public Checkbox createCheckBox(String text) {
        return new CheckboxB(text);
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldB(text);
    }
}
