package observer;

public class AsiaCustomer implements DecathlonObserver{
	DecathlonSubject sub;
	DecathlonDiscount dis;
	AsiaCustomer(DecathlonSubject s){
		this.sub=s;
		sub.attach(this);
	}
	public void update(DecathlonDiscount d){
		dis=d;
	}
	public void display(){
		System.out.println("the discount is "+this.dis.i);
		System.out.println("the festival is "+this.dis.dis);
		System.out.println("the start date is "+this.dis.start);
		System.out.println("the end date is "+this.dis.end);
	}

}
