package abstractfactory;

public class Disabled1 implements AbstractFactory{
	public OutdoorAdventurte createadv(){
		return new Bungee();
	}
	public OutdoorRegular createreg(){
		return new Wheelchaircricket();
	}

}
