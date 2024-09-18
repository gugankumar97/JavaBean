package JavaBean;

public class Vehicle {

	int wheels;
	String colour;
	String name;
	
	
	public Vehicle() {
		
	}
	
	public Vehicle(String name, String colour) {
		System.out.println("From child class : Name ->"+name +"Colour ->"+colour);		
	}

	public void start() {
		
		System.out.println("Vehicle starts as per the procedure");
	}
	
	public void stop() {
		System.out.println("Stop the Vehicle");
	}
	
	public void inspectVehicle() {
		System.out.println("Inspect your vehicle ");
	}
	
}

// IS a Relationship:

class Bicycle extends Vehicle{        //(Bicycle is a vehicle)

	public Bicycle() {
		//super("Honda","Red");
	}
	
	public Bicycle(int wheels,String colour){
		super("Honda", "Blue");
		System.out.println("My Bicycle is "+colour+" in colour and has "+wheels+ " wheels.");
		
	}
	
	@Override
	public void start() {
		System.out.println("Pedalling required to start");
	}
	
	public void ringBell() {
		System.out.println(" Ring Bell ");
	}
	
}

class Car extends Vehicle{
	
	//default constructor
	public Car() {
		super("Hyundai","Green");
	}
	public Car(int wheels,String colour){
		super("Hyundai","Green");
		System.out.println("My Car is "+colour+" in colour and has "+wheels+ " wheels.");
	}

	public void start() {
		System.out.println("Petrol/Diesel required to start the engine");
		
	}
	
	public void soundHorn() {
		System.out.println("Sound Horn");
	}
	
	public void inspectVehicle() {	
		System.out.println("Inspect your Car ");
		super.start();
	}
	
}


class SportsCar extends Car{
	
}

