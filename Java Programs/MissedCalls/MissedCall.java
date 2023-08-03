import java.util.*;

public class MissedCall {
	ArrayList<Call> missed = new ArrayList<>(10);
	
	public void add(Call c) {
		
		if(missed.size() == 10) {
			missed.remove(0);
		}
		missed.add(c);
		System.out.println("Call record added successfully");
	}
	
	public void delete(String phno) {
		for(Call c: missed) {
			if(c.phno.equals(phno)) {
				missed.remove(c);
				return;
			}
		}
		System.out.println("Number noe exist in directory");
	}
	
	public void Display() {
		for(Call c: missed)
			c.Display();
	}
	
	public void Operate() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<missed.size(); i++) {
			Call c = missed.get(i);
			System.out.println("Missed call from: " + c.phno + "\nActions:");
			System.out.println("1)Next Call\n2)Delete\n3.Display Details\n4.Delete Specific\n5)Exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				break;
			case 2:
				missed.remove(c);
				System.out.println("Deleted " + c.Display());
				break;
			case 3:
				System.out.println("Details " + c.Display());
				break;
			case 4:
				System.out.println("Enter number to delete:");
				String pn = sc.nextLine();
				delete(pn);
				System.out.println("Deleted calls from " + pn);
				break;
			case 5:
				return;
			default:
				System.out.println("Wrong Choice. Enter again");
			}
		}
	}
	
	public static void main(String[] args) {
		String[] names = {"John","Joe","Harry","Potter","William","Gates","Ben","Bob","Margret","Mary"};
		Random r = new Random();
		MissedCall mc = new MissedCall();
		for(int i=0; i<12; i++) {
			int phno = r.nextInt(99999);
			String phoneNumber = "" + phno;
			if(r.nextInt()%2 == 0) 
				mc.add(new Call(phoneNumber));
			else
				mc.add(new Call(phoneNumber, names[r.nextInt(10)]));
		}
		
		mc.Operate();
		System.out.println("Showing Call Log:");
		mc.Display();
	}
}
