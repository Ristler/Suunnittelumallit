package WeatherStation;
import WeatherStation.Observable.Concrete.ConcreteWeatherStation;
import WeatherStation.Observer.Concrete.Tempature;

public class Main {
    public static void main(String[]args) {
        ConcreteWeatherStation station = new ConcreteWeatherStation();
        Tempature temp1 = new Tempature(station);
        Thread t1 = new Thread(station);
        t1.start();

        //station.Detach(temp1);
    }
}
