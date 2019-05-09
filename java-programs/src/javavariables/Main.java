package javavariables;

import java.awt.Color;

public class Main {
    public static void main(String[] args){
        Car myCar = new Car(25.50, 
                "1BC32E", 
                Color.BLUE, 
                true);
        
        Car sallyCar = new Car(43.30,
                "1CBD3F",
                Color.BLACK,
                false);
        
        System.out.println("my car's license plate: " + myCar.licensePlate);
        System.out.println("sally's car's license plate: " + sallyCar.licensePlate);
        
        System.out.println("New paint color: " + myCar.paintColor);
        myCar.changePaintColor(Color.red);
        System.out.println("New paint color: " + myCar.paintColor);
    }
}