//import InheritanceAndEncapsulation.Car;
//import InheritanceAndEncapsulation.ElectricCar;
import Abstraction.*;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      //  InheritanceAndEncapsulation.Car car1 = new InheritanceAndEncapsulation.Car("bmw", "m3", 2022);
//        InheritanceAndEncapsulation.Car car2 = new InheritanceAndEncapsulation.Car("mercedes", "amg e63", 2017);
//        InheritanceAndEncapsulation.Car car3 = new InheritanceAndEncapsulation.Car("audi", "rs6", 2020);
//        InheritanceAndEncapsulation.Car car4 = new InheritanceAndEncapsulation.ElectricCar("Tesla", "Model S", 2021, 100); // електромобіль
//        InheritanceAndEncapsulation.Car car5 = new InheritanceAndEncapsulation.ElectricCar("Nissan", "Leaf", 2019, 40);
//
//        car1.printInfo();
//        car2.printInfo();
//        car3.printInfo();
//        car4.printInfo();
//        car5.printInfo();

//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car("BMW", "M3", 2022));
//        cars.add(new Car("Mercedes", "AMG E63", 2017));
//        cars.add(new Car("Audi", "RS6", 2020));
//        cars.add(new ElectricCar("Tesla", "Model S", 2021, 100)); // електромобіль
//        cars.add(new ElectricCar("Nissan", "Leaf", 2019, 40));
//        for(Car car: cars){
//            car.printInfo();
//        }

        Car car = new Car();
        car.move();
        Bike bike = new Bike();
        bike.move();

    }
}