package some_tests;

import java.util.Collections;
import java.util.concurrent.Semaphore;

public class Sem {
    public static void main(String[] args) {
        Semaphore gasStationSem = new Semaphore(2);

        Car[] cars = new Car[10];

        for (int i = 0; i < cars.length; i++)
            cars[i] = new Car();

        for (Car car:cars) {
            car.gasStation = gasStationSem;
        }

        for (Car c:cars)
            c.start();


/*        Car car0 = new Car();
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();
        Car car6 = new Car();
        Car car7 = new Car();
        Car car8 = new Car();
        Car car9 = new Car();

        car0.gasStation = gasStation;
        car1.gasStation = gasStation;
        car2.gasStation = gasStation;
        car3.gasStation = gasStation;
        car4.gasStation = gasStation;
        car5.gasStation = gasStation;
        car6.gasStation = gasStation;
        car7.gasStation = gasStation;
        car8.gasStation = gasStation;
        car9.gasStation = gasStation;

        car0.start();
        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car5.start();
        car6.start();
        car7.start();
        car8.start();
        car9.start();

 */

    }
}

class Car extends Thread{
    Semaphore gasStation ;

    @Override
    public void run() {
        System.out.println(this.getName() + " I am in queue");

        try {
            gasStation.acquire();
            System.out.println(this.getName() + " Getting gas");
            Thread.sleep(3000);
            System.out.println(this.getName() + " finished , went out from gas station");
            gasStation.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}