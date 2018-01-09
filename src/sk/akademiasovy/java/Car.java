package sk.akademiasovy.java;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Car {
    private String brand;
    private int speed;
    private boolean engine;
    private float gasConsumption;

    public Car(){
        speed=0;
        engine=false;
        gasConsumption=7.9f;
        brand=null;
    }

    public Car(String brand, float gasConsumption){
        speed=0;
        engine=false;
        this.brand=brand;
        this.gasConsumption=gasConsumption;
    }

    public void setBrand(String value){
        brand=value;
    }

    public void setGasConsumption(float gasConsumption){
        this.gasConsumption=gasConsumption;
    }

    public void printInfo(){
        System.out.println("Brand:"+this.brand+" "+"Spotreba:"+gasConsumption+" "+"Speed:"+speed);
    }

    public void startEngine(){
        engine=true;
    }

    public void stopEngine(){
        engine=false;
    }

    public void increaseSpeed(){
        if(engine==true)
        speed=speed+10;
    }

    public void decreaseSpeed(){
        speed=speed-10;
        if (speed==0)
        speed=0;
    }

    public void stop(){
        speed=0;
    }

    public float getPrice(int distance, float costPerLiter){
        float price;
        price= distance*gasConsumption*costPerLiter/100;
        return price;
    }

    public void increaseSpeed(int speed){
        if(engine==true && speed>0)
            this.speed=speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getBrand() {
        return brand;
    }
}
