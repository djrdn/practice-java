import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("bmw", "m3", 2022);
        Car car2 = new Car("mercedes", "amg e63", 2017);
        Car car3 = new Car("audi", "rs6", 2020);

        car1.printInfo();
        car2.printInfo();
        car3.printInfo();
    }
}