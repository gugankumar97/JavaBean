package JavaBean;

public class DemoVehicle {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.start();
				
		Bicycle bicycle = new Bicycle(2,"Red");
		bicycle.start();
		bicycle.stop();
		bicycle.ringBell(); 
		
		
		Car car = new Car();
		car.start();
		car.inspectVehicle();

		Vehicle carObject = new Car(4,"Blue");
		carObject.start();
		
		if(carObject instanceof Car) {
			Car carObject1 = (Car)carObject;
		    carObject1.soundHorn();
		}
		
	
		carObject.inspectVehicle();
		
		Car sportsCar = new SportsCar();
		
		sportsCar.soundHorn();
		sportsCar.stop();

	}

}
