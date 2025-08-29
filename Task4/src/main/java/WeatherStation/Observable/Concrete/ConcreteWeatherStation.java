package WeatherStation.Observable.Concrete;

import WeatherStation.Observer.Observer;
import WeatherStation.Observable.WeatherStation;
import java.util.ArrayList;
import java.util.Random;


public class ConcreteWeatherStation extends WeatherStation implements Runnable {
    Random r = new Random();

    public ConcreteWeatherStation() {
        double randomTemp = r.nextDouble(15, 28);
        this.temp =(Math.round(randomTemp * 10) / 10.0);
        this.observers = new ArrayList<>();
    }
    @Override
    public void Attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void Detach(Observer observer) {
        observers.remove(observer);

    }
    public double GetState() {
        return this.temp;

    }
    public void SetState(Double value) {
        this.temp = value;
    }

    @Override
    public void run() {

        int MAX_TEMP = 28;
        int MIN_TEMP = 15;

        while(true) {

            //0 IS SUB, 1 IS ADD.
            int addOrSub = r.nextInt(0, 2);
            int timeInterval = r.nextInt(1000, 5000);

            switch (addOrSub) {
                case 0:
                    temp++;
                    break;
                case 1:
                    temp--;
                    break;
            }

            if(temp <= MIN_TEMP) {
                temp = MIN_TEMP;
            }
            else if(temp >= MAX_TEMP) {
                temp = MAX_TEMP;
            }
            Notify();
            try {
                Thread.sleep(timeInterval);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
