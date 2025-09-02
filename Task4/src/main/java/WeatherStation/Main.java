package WeatherStation;
import WeatherStation.Observable.Concrete.ConcreteWeatherStation;
import WeatherStation.Observer.Concrete.Temperature;

public class Main {
    public static void main(String[]args) throws InterruptedException {
        ConcreteWeatherStation station = new ConcreteWeatherStation();
        Temperature temp1 = new Temperature(station);
        Temperature temp2 = new Temperature(station);
        Temperature temp3 = new Temperature(station);
        Thread t1 = new Thread(station);
        t1.start();


        //Thread.sleep(2000);
        station.Detach(temp1);
        System.out.println("Valmis");


    }
}
