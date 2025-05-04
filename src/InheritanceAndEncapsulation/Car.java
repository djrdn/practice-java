package InheritanceAndEncapsulation;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int id;

    public Car(String brand, String model, int year, int id){
        this.brand=brand;
        this.model=model;
        setYear(year);//для валідації року випуску
        this.id = id;
    }

    public void printInfo(){
        System.out.println("Марка авто: " + brand  + ", модель: " + model + ", рік випуску: " + year);
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if (year >= 1886 && year <= 2025) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Недійсний рік випуску: " + year);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
