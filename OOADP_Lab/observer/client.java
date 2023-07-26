package observer;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stuba
		AsiaFestival af=new AsiaFestival(22,"abc","2","5");
		AsiaCustomer india=new AsiaCustomer(af);
		AsiaCustomer srilanka=new AsiaCustomer(af);
		af.notify1();
		System.out.println("indias taxes");
		india.display();
		System.out.println("sri lankas taxes");
		srilanka.display();
		af.changedis(34, "def", "10", "14");
		System.out.println("indias taxes");
		india.display();
		System.out.println("sri lankas taxes");
		srilanka.display();

	}

}





