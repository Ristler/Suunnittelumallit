package WeatherStation.Observable;
import WeatherStation.Observer.Observer;

import java.util.ArrayList;
import java.util.List;
import WeatherStation.Observer.Concrete.Temperature;

public abstract class WeatherStation {

    protected List<Observer> observers = new ArrayList<>();
    protected double temp;
    protected Temperature observer;

    public abstract void Attach(Observer observer);
    public abstract void Detach(Observer observer);

    public void Notify() {
        for(Observer obs : observers) {
            obs.update();
        }
    }
}
