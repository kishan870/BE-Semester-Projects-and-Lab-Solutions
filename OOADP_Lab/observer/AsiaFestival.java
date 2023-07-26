package observer;

import java.util.ArrayList;

public class AsiaFestival implements DecathlonSubject{
	DecathlonDiscount dis;
	ArrayList<DecathlonObserver> obs;
	public AsiaFestival(int i,String disc,String start,String end){
		dis=new DecathlonDiscount();
		dis.setDecathlonDiscount(i,disc,start,end);
		obs=new ArrayList<DecathlonObserver>();
	}
	public void attach(DecathlonObserver ob){
		obs.add(ob);
	}
	public void notify1(){
		for(int i=0;i<obs.size();i++){
			DecathlonObserver obj=(DecathlonObserver)obs.get(i);
			obj.update(dis);
		}
		
	}
	public void changedis(int i,String dis,String start,String end){
		this.dis.setDecathlonDiscount(i,dis,start,end);
		this.notify1();
	}

}
