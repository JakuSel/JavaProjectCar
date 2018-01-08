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
    }
}
