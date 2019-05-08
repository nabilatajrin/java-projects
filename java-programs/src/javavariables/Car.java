package javavariables;

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
}
