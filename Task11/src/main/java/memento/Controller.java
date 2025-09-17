package memento;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history;
    private List<IMemento> redoList;

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.redoList = new ArrayList<>();

        IMemento initial = model.createMemento();
        if (initial != null) {
            history.add(initial);
        }
    }

    public void setOption(int optionNumber, int choice) {
        model.setOption(optionNumber, choice);
        saveToHistory();
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        model.setIsSelected(isSelected);
        saveToHistory();
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (history.size() > 1) {
            IMemento current = history.remove(history.size() - 1);
            redoList.add(current);

            IMemento previous = history.get(history.size() - 1);
            model.restoreState(previous);
            gui.updateGui();
        }
    }

    public void redo() {
        if (!redoList.isEmpty()) {
            IMemento redoState = redoList.remove(redoList.size() - 1);
            history.add(redoState);
            model.restoreState(redoState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        if (currentState != null) {
            history.add(currentState);
            redoList.clear();
        }
    }

    public void restoreFromMemento(IMemento memento) {
        if (memento != null) {
            model.restoreState(memento);
            gui.updateGui();
            history.add(memento);
            redoList.clear();
        }
    }

    public List<IMemento> getHistory() {
        return new ArrayList<>(history);
    }
}

