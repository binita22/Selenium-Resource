package capture.system.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDateAndTime {

	public static void main(String[] args) {
		//Create object of SimpleDateFormat class and decide the format
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		//get current date time with Date()
		Date date = new Date();
		//now format the date
		String date1 = dateFormat.format(date);
		//print the Date
		System.out.println(date1);
		

	}

}
