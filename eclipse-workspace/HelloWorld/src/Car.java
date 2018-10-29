import java.awt.*;
public class Car {
	
	double averageMilesPerGallon;
	String licensePlate;
	Color paintColor;
	boolean areTailingWorking;
	
	public Car(double inputAverageMPG,
			String licensePlate,
			Color paintColor,
			boolean areTailingWorking) {
		this.averageMilesPerGallon = inputAverageMPG;
		this.licensePlate = licensePlate;
		this.paintColor = paintColor;
		this.areTailingWorking = areTailingWorking;
	}
	
}
