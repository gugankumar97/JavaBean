package JavaBean;

public class DemoEmployee {

	public static void main(String[] args) {
		
		// object creation using parent class:
		
		   Employee emp1 = new Employee();
		
		    emp1.setId(34);
		    System.out.println(emp1.id);
            System.out.println(emp1.getId());
            
       // object creation using child class:    
            Manager emp2 = new Manager();
            
            emp2.setName("GUGAN");
            System.out.println(emp2.getName());
            
            emp2.setSalary(75000);
            System.out.println(emp2.getSalary());
            
       // object creation using child class:    
            
            Trainee emp3 =  new Trainee();
            emp3.setPosition("INTERN");
            
            System.out.println(emp3.getPosition());
            
            
      // Hierarchical Inheritence:
            
        MarketingTeam mar1 = new MarketingTeam();
        mar1.setNoOfSalesPerson(50);
        System.out.println(mar1.getNoOfSalesPerson());
        
        
  
            
            
	}

}
