package abstractfactory;

public class Disabled2 implements AbstractFactory{
	public OutdoorAdventurte createadv(){
		return new Paragliding();
	}
	public OutdoorRegular createreg(){
		return new Wheelchaircricket();
	}
}
