package JavaBean;

import java.util.Arrays;

public class DemoJavaBean {

	public static void main(String[] args) {
		
     StudentBean stu1 = new StudentBean();

	
	
	Address address = new Address();
	address.setDoorNo(10);
	address.setPinCode(007);
	address.setStreetName("park view street");
	
	
	stu1.setAddress(address);
	System.out.println(stu1.getAddress());
	stu1.setGender("Male");
	System.out.println(stu1.getGender());
	}

}
