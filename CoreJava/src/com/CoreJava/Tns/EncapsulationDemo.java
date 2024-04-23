package com.CoreJava.Tns;

public class EncapsulationDemo {
int sno;
String name;
int age;
EncapsulationDemo(int sno, String name,int age)
{
	this.sno=sno;
	this.name=name;
	this.age=age;
}
void Show() 
{
	System.out.println("Serial Number:"+sno+"\t Name:"+name+"\t Age:"+age);
}
public static void main(String[] args) {
	EncapsulationDemo ed=new EncapsulationDemo(01,"Nikhil",20);
	/*ed.name="Nithin";
	ed.age=20;
	ed.sno=01;*/
	ed.Show();
}
}