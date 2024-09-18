package JavaBean;

public abstract class Animal {
	
	 String habitat;
	 final String modeOfNutrition;
	
	
	//constructor
	Animal(String modeOfNutrition, String habitat){
		this.habitat = habitat;
		
		this.modeOfNutrition = modeOfNutrition;
		
	}
	
	//abstract method
	public abstract void locomotary();
	
	
	//concrete method
	public void getAnimalInfo() {

		System.out.println("Mode of Nutrition : " + modeOfNutrition);
		System.out.println("Habitat : " + habitat);
	}

}

class AquaticAnimals extends Animal{

	
	//constructor
	public  AquaticAnimals(String modeOfNutrition, String habitat) {
		//invkoing the parent class constructor
		super(modeOfNutrition, habitat);
		
	}

	@Override
	public void locomotary() {

		System.out.println("It swims");
		
	}

	
}

class TerrestrialAnimals extends Animal{

	TerrestrialAnimals(String modeOfNutrition, String habitat) {
		super(modeOfNutrition, habitat);
		
	}

	@Override
	public void locomotary() {

		System.out.println("It walks");
		
	}
	
	public boolean isMammal() {
		return true;
	}
}
