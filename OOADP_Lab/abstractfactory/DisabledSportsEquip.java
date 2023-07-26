package abstractfactory;

public class DisabledSportsEquip extends SportsEquip{
	OutdoorAdventurte out;
	OutdoorRegular reg;
	AbstractFactory af;
	DisabledSportsEquip(AbstractFactory af){
		this.af=af;
	}
	public void displaySports(){
		out=af.createadv();
		out.display();
		reg=af.createreg();
		reg.display();
	}

}
