package net.javaguides.springboot.bean;

public class Car {
    private int id;
    private String model;
    private int year;

    public int getId(){
        return id;
    }

    public Car() {
        // Optionally, initialize default values here
    }

    public void setId(int id){
        this.id = id;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public Car(int id, String model, int year){
        this.id = id;
        this.model = model;
        this.year = year;
    }
}
