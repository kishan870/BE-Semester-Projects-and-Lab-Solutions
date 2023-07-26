package abstractfactory;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisabledSportsEnth dis=new DisabledSportsEnth();
		SportsEquip ap;
		ap=dis.createSports("bungee-cricket");
		ap.displaySports();
		ap=dis.createSports("para-cricket");
		ap.displaySports();
	}

}
