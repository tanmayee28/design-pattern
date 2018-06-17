package abstract_design_pattern_reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter day");
		int day = sc.nextInt();
		System.out.println("Enter month");
		int month = sc.nextInt();
		System.out.println("Enter Year");
		int year = sc.nextInt();
		
		String userDate = ""+year+"-"+month+"-"+day;
		//String userDate = "2018-06-23";//+year+month+day;
		SimpleDateFormat dateFormate = new SimpleDateFormat("yyyy-mon-dd");
		Date date = dateFormate.parse(userDate);
		
		System.out.println("Your date is -- " +date);
		sc.close();
	}
}
