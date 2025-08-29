package WeatherStation.Observer.Concrete;
import WeatherStation.Observer.Observer;
import WeatherStation.Observable.Concrete.ConcreteWeatherStation;

public class Tempature implements Observer {
    private ConcreteWeatherStation observable;

    public Tempature(ConcreteWeatherStation observable) {
        this.observable = observable;
        observable.Attach(this);

    }

    @Override
    public void update() {
        System.out.println("Tempature has received an update. \n " +
                "Current tempature: "+ observable.GetState());
    }
}
