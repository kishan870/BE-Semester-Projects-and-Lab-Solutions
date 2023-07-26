package singleton;
import java.util.*;
import java.io.*;
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url,b;
		Scanner sc=new Scanner(System.in);
		History h=History.getInstance();
		
		while(true){
			System.out.println("1 for url 2 for history 3 for exit");
			int c=sc.nextInt();
			if(c==1){
				try{
				System.out.println("enter a url");
				 b=sc.next();
				h.writeHistory(b);
				}
				 catch(Exception e){
					 e.printStackTrace();
				 }
			}
			else if(c==2){
				try{
				BufferedReader br=new BufferedReader(new FileReader("hist.txt"));
				while((url=br.readLine())!=null){
					System.out.println(url);
				}
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
			else{
				break;
			}
			}
		
	}

}
