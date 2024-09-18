package JavaBean;

public class Employee {
 // Here Employee is a Parent Class:  
	
	 String name;
     int id;
     String gender;
	
     
    


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
     
     
}

// Here Manager is a child class of Employee:

class Manager extends Employee{
	int salary;
	String project;
	
	
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * @return the project
	 */
	public String getProject() {
		return project;
	}
	/**
	 * @param project the project to set
	 */
	public void setProject(String project) {
		this.project = project;
	}
	
	
}
// Here Trainee is a child class of Manager:

class Trainee extends Manager{
	
	String position;

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	
	
}

class MarketingTeam extends Employee{
	int NoOfSalesPerson;

	
	/**
	 * @return the noOfSalesPerson
	 */
	public int getNoOfSalesPerson() {
		return NoOfSalesPerson;
	}

	/**
	 * @param noOfSalesPerson the noOfSalesPerson to set
	 */
	public void setNoOfSalesPerson(int noOfSalesPerson) {
		NoOfSalesPerson = noOfSalesPerson;
	}
	
	
}
