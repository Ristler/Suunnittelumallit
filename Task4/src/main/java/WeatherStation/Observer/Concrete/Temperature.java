package WeatherStation.Observer.Concrete;
import WeatherStation.Observer.Observer;
import WeatherStation.Observable.Concrete.ConcreteWeatherStation;

public class Temperature implements Observer {
    private ConcreteWeatherStation observable;

    public Temperature(ConcreteWeatherStation observable) {
        this.observable = observable;
        observable.Attach(this);

    }
    @Override
    public void update() {
        System.out.println("Tempature has received an update. \n " +
                "Current tempature: "+ (Math.round(observable.GetState() * 10) / 10.0));
    }
}
