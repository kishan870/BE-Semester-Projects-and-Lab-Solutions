package abstractfactory;

public class DisabledSportsEnth extends SportsEnth{
	AbstractFactory af1=new Disabled1();
	AbstractFactory af2=new Disabled2();
	
	public SportsEquip createSports(String s){
		if(s.equals("bungee-cricket")){
			return new DisabledSportsEquip(af1);
		}
		else if(s.equals("para-cricket")){
			return new DisabledSportsEquip(af2);
		}
		else{
			return null;
		}
	}

}
