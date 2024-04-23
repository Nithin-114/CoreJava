
public class Employee {
private String name,email_id,address;
public Employee()
{
	
}
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
public void setEmail_id(String email)
{
	this.email_id=email;
}
public String getEmail_id()
{
	return email_id;
}
public void setAddress(String address)
{
	this.address=address;
}
public String getAddress()
{
	return address;
}
Employee(String name,String email,String address)
{
	this.name=name;
	this.email_id=email;
	this.address=address;
	
}

}
