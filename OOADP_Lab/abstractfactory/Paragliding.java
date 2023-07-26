package abstractfactory;

import java.util.ArrayList;

public class Paragliding implements OutdoorAdventurte{
	String name="paragliding disabled disabled";
	ArrayList<String> ar=new ArrayList<String>();
	Paragliding(){
		ar.add("flyer");ar.add("stick");
	}
	public String getname(){
		return name;}
	public void display(){
		System.out.println(ar);
	}
}
