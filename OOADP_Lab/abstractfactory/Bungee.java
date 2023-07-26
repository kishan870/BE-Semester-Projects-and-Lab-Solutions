package abstractfactory;

import java.util.ArrayList;

public class Bungee implements OutdoorAdventurte{
	String name="bungee jumping disabled";
	ArrayList<String> ar=new ArrayList<String>();
	Bungee(){
		ar.add("rope");ar.add("stick");
	}
	public String getname(){
		return name;}
	public void display(){
		System.out.println(ar);
	}

}
