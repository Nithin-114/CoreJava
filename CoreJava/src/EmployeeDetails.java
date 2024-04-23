public class EmployeeDetails {

	EmployeeDetails(String name, String email, String address) 
	{
	}
	public static void main(String[] args) {
		//HourlyEmployee e =new HourlyEmployee ("nithin","nithinsomagani@gmail.com","Golnaka",8,200);
		SalariedEmployee s=new 	SalariedEmployee();
		s.salary=60000;
	float annualSalary=s.AnnualSalary(s.salary);
	System.out.println(annualSalary);
		
		 
	}
	
}

