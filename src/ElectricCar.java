public class ElectricCar extends Car{
    private int batteryCapacity;

    public ElectricCar(String brand, String model, int year, int batteryCapacity){
        super(brand, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void printInfo(){
        System.out.println("Марка авто: " + brand  + ", модель: " + model + ", рік випуску: " + year + ", батарея: " + batteryCapacity);
    }

}
