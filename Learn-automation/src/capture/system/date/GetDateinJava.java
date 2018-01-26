package capture.system.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDateinJava {

	public static void main(String[] args) {
		//create object of SimpleDateFormat class and decide the formaat
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		//get current date time with Date()
		Date date = new Date();
		//Now format the date
		String date1 = dateFormat.format(date);
		System.out.println(date1);
		
	}

}
