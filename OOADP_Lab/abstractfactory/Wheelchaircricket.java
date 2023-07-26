package abstractfactory;

import java.util.ArrayList;

public class Wheelchaircricket implements OutdoorRegular{
	String name="cricket disabled";
	ArrayList<String> ar=new ArrayList<String>();
	Wheelchaircricket(){
		ar.add("bat");ar.add("stick");
	}
	public String getname(){
		return name;}
	public void display(){
		System.out.println(ar);
	}
}
