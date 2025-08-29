package WeatherStation.Observable.Concrete;

import WeatherStation.Observer.Observer;
import WeatherStation.Observable.WeatherStation;
import java.util.ArrayList;
import java.util.Random;

public class ConcreteWeatherStation extends WeatherStation implements Runnable {
    private final Random r = new Random();
    private static final int MAX_TEMP = 28;
    private static final int MIN_TEMP = 15;

    public ConcreteWeatherStation() {
        this.temp = r.nextDouble(MIN_TEMP, MAX_TEMP);
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
        while(true) {
            
            //0 IS ADD, 1 IS SUB.
            int addOrSub = r.nextInt(0, 2);
            //Randomized value to add or sub
            double change = Math.round(r.nextDouble(0.1, 1.0) * 10) / 10.0;
            //Random time interval
            int timeInterval = r.nextInt(1000, 5000);

            switch (addOrSub) {
                case 0:
                    temp += change;
                    
                    break;
                case 1:
                    temp -= change;
                    break;
            }

            temp = Math.max(MIN_TEMP, Math.min(MAX_TEMP, temp));
            Notify();
            try {
                Thread.sleep(timeInterval);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
