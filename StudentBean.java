package JavaBean;

public class StudentBean {
    
	String name;
	String gender;
	int rollNo;
	Address address;  //HAS A RELATIONSHIP (StudentBean HAS A Address)
	
	/**
	 * Default constructor
	 */
	
	public StudentBean() {
	//	this.name = "kumar";
	}
	
	
	
	/**
	 * @param name
	 * @param gender
	 * @param rollNo
	 * Parametrized constructor
	 */
	// using three parameter:
	public StudentBean(String name, String gender, int rollNo) {
		//this.name = name;
		this.gender = gender;
		//this.rollNo = rollNo;
	}
	
	// using two parameter:
	public StudentBean(String name, String gender) {
	//	this.name = name;
		this.gender = gender;
	}



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
	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
//	 runs every time when oject is created
	{
		this.name="giri";
		System.out.println("INITILIZATION BLOCK");
	}
	
//	 runs first time only when object is created
	static{
		System.out.println("STATIC INITILIZATION BLOCK");
	}



	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", gender=" + gender + ", rollNo=" + rollNo + "]";
	}



	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}



	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
