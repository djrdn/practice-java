import InheritanceAndEncapsulation.Car;
import InheritanceAndEncapsulation.ElectricCar;
import Abstraction.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InheritanceAndEncapsulation.Car car1 = new InheritanceAndEncapsulation.Car("bmw", "m3", 2022,2);
        InheritanceAndEncapsulation.Car car2 = new InheritanceAndEncapsulation.Car("mercedes", "amg e63", 2017,3);
        InheritanceAndEncapsulation.Car car3 = new InheritanceAndEncapsulation.Car("audi", "rs6", 2020,3);
        InheritanceAndEncapsulation.Car car4 = new InheritanceAndEncapsulation.ElectricCar("Tesla", "Model S", 2021, 22, 100); // електромобіль
        InheritanceAndEncapsulation.Car car5 = new InheritanceAndEncapsulation.ElectricCar("Nissan", "Leaf", 2019, 4,40);

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

//        Car car = new Car();
//        car.move();
//        Bike bike = new Bike();
//        bike.move();


        //ArrayList, HashMap, HashSet
        //Створити ArrayList<String> для збереження назв автомобілів.
        ArrayList<String> namesCar = new ArrayList<>();
        namesCar.add(car1.getBrand());
        namesCar.add(car2.getBrand());
        namesCar.add(car3.getBrand());
        namesCar.add(car4.getBrand());
        namesCar.add(car5.getBrand());
        System.out.println(namesCar);

        //Використати HashMap<String, Integer> для збереження моделі авто та року випуску.
        HashMap<String, Integer> modelAndYear = new HashMap<>();
        modelAndYear.put(car1.getModel(), car1.getYear());
        modelAndYear.put(car2.getModel(), car2.getYear());
        modelAndYear.put(car3.getModel(), car3.getYear());
        modelAndYear.put(car4.getModel(), car4.getYear());
        modelAndYear.put(car5.getModel(), car5.getYear());
        System.out.println(modelAndYear);

        //Реалізувати HashSet<Integer> для унікального списку ідентифікаторів авто.
        HashSet<Integer> idCars = new HashSet<>();
        idCars.add(car1.getId());
        idCars.add(car2.getId());
        idCars.add(car3.getId());
        idCars.add(car4.getId());
        idCars.add(car5.getId());
        System.out.println(idCars); //отримуємо 4 автомобілі так як є два автомобілі айді яких співпадають(id = 3), set виводе унікальні значення

    }



}