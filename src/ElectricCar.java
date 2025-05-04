public class ElectricCar extends Car{
    private int batteryCapacity;

    public ElectricCar(String brand, String model, int year, int batteryCapacity){
        super(brand, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void printInfo(){
        System.out.println("Марка авто: " + getBrand()  + ", модель: " + getModel() + ", рік випуску: " + getYear() + ", батарея: " + batteryCapacity);
    }

}
