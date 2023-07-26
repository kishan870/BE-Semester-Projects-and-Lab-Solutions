package singleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
public class History {
	private static History h;
	private History(){}
	static History getInstance(){
		if(h==null){
			h=new History();
		}
		return h;
	}
	void writeHistory(String url){
		try{
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("hist.txt",true)));
		out.print(url);
		out.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
