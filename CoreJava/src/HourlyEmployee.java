
public class HourlyEmployee  extends Employee{
float no_of_hours,pay_per_hour;
public void setNoOfHours(float a)
{
	no_of_hours=a;
}
public float getNoOfHours()
{
	return no_of_hours;
}
public void setPayPerHour(float a)
{
	pay_per_hour=a;
}
public float getPayPerHour()
{
	return pay_per_hour;
}
public HourlyEmployee(String name,String email,String address,float a,float b)
{   super(name,email,address);
	no_of_hours=a;
	pay_per_hour=b;
}
public float CalculateSalary(float no_of_hours,float pay_per_hour)
{
	return no_of_hours*pay_per_hour;
}
}
