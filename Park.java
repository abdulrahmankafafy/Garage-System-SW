package GarageSystem;

import java.time.LocalTime;

public abstract class Park {
	public BestFit bestFit;
	public FirstFit firstFit;
	public PayFees pay;
	public DisplayFees Display;
	abstract public int parkIn(Vehicle vehicle, Garage garage);
	
	abstract public void parkOut(Vehicle vehicle, Garage garage);
	
	abstract public boolean checkIfNoPlace(Vehicle vehicle,Garage garage) ;//check if there's no place
	
	abstract public LocalTime captureTime();
}
