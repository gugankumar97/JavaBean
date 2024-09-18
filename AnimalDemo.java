package JavaBean;

public class AnimalDemo {

	public static void main(String[] args) {
		
		//Animal animal = new Animal();
			
			Animal animal = new AquaticAnimals("Carnivore","Water Animal");
			
			animal.getAnimalInfo();
			
			animal.locomotary();
			
			TerrestrialAnimals animal1 = new TerrestrialAnimals("Herbivore","Land Animal");
			
			animal1.getAnimalInfo();
			
			animal1.isMammal();
		}

	}


