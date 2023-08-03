import java.util.*;
import java.text.SimpleDateFormat;

public class Call {
	public String name, time, phno;
	
	public Call(String ph) {
		this.phno = ph;
		this.name = "Private Caller";
		SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		this.time = df.format(date);
	}
	
	public Call(String ph, String name) {
		this.phno = ph;
		this.name = name;
		SimpleDateFormat sf = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		this.time = sf.format(date);
	}
	
	public String Display() {
		String s = "Phone number : "+this.phno + ", Name: "+this.name+", Time:"+this.time;
		return s;
	}
}
