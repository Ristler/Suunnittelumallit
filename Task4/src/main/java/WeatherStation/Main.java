package WeatherStation;
import WeatherStation.Observable.Concrete.ConcreteWeatherStation;
import WeatherStation.Observer.Concrete.Temperature;

public class Main {
    public static void main(String[]args) {
        ConcreteWeatherStation station = new ConcreteWeatherStation();
        Temperature temp1 = new Temperature(station);
        Thread t1 = new Thread(station);
        t1.start();

        //station.Detach(temp1);
    }
}
