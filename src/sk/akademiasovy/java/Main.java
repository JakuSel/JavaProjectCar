package sk.akademiasovy.java;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car("Skoda 120L",6.5f);
        car1.setBrand("Audi A8");
        car1.setGasConsumption(9.9f);
        car1.printInfo();
        car2.printInfo();
        car2.startEngine();
        car2.increaseSpeed();
        car2.printInfo();

        System.out.println("Naklady na cestu KE->PRG->KE:"+car1.getPrice(1600,1.33f));
        car1.startEngine();
        car1.increaseSpeed(50);
        car2.increaseSpeed(60);

        car1.printInfo();
        car2.printInfo();

        if (car1.getSpeed()>car2.getSpeed())
            System.out.println("Rychlejsie je: "+car1.getBrand());
        else if (car1.getSpeed()<car2.getSpeed())
            System.out.println("Rychlejšie je :"+car2.getBrand());
        else
            System.out.println("Idú rovnako rýchlo");


        /*car2 car3  premenna car3
        car2=car3  napojíme sa na car2
        nový car3*/
        Car car3=new Car("Tesla",6.9f,"Trencin");
    }
}
