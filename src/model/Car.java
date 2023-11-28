package model;

public class Car {

    private Integer id;
    private String brand;
    private String model;

    private Integer year;
    private String motorType;


    public Car() {

    }

    public Car(Integer id, String brand, String model, Integer year, String motorType) {

        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.motorType = motorType;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void getBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }


}
