package javaconstructor;

import java.awt.Color;

public class Car {
    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailingWorking;
    
    public Car(double inputAverageMPG, 
            String inputLicensePlate, 
            Color inputPaintColor, 
            boolean inputAreTailingWorking){
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailingWorking = inputAreTailingWorking;
    }
    
    public void changePaintColor(Color newPaintColor){
        this.paintColor = newPaintColor;
    }
    
    //call by value vs call by reference
    //java uses only call by value
    public void speedingUp(double currentSpeed){
        currentSpeed += 100;
        //if the function was called by reference, then the argument passed to
        //this function would increase by 100.
        
        //if this function was called by value then the argument passed to this 
        //function would be unaffected, and this function would essentially do
        //nothing.
    }
}
