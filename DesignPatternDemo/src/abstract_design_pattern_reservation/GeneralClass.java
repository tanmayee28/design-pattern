package abstract_design_pattern_reservation;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class GeneralClass extends TicketClass{

	Scanner sc=new Scanner(System.in);
	int age=0;
	String getTrainName() {
		String str="";
		System.out.println("Enter Train Name:");
		try{
			str=sc.next();
		}catch(Exception e){
			System.out.println("Other trains are not available");
		}
		return str;
	}
	double getFair() {
		System.out.println("Enter no of tickets:");
		int no=sc.nextInt();
		double total=0.0;
		int age1=this.age;
		if(age1<=13)	
		{
			total=no*90;
			return total;
		}else if(age1>13 || age1<=60){
			total=no*180;
			return total;
		}else if(age1>60){
			total=no*110;
			return total;
		}
		return total;
	}
	
	@Override
	String getjourney() {
		 String source="";
		 String dest="";
		 String jrny;
		
		try{
			System.out.println("Enter Your Source :");
		     source=sc.next();
		    System.out.println("Enter Your Destination city :"); 
		      dest=sc.next();
		}catch(Exception e){}
		//System.out.println("Your journey is from :");
		jrny=source+"-"+dest;
		return jrny;
	}

	
	String getDate() {
		int  day=0,month=0,year=0;
		String date=null;
		//System.out.println("Enter your journey date:");
		try{
			System.out.println("Enter date :");
			day=sc.nextInt();
			//System.out.println("Hiii");
			if(day<=0 || day>31)
			{
				System.out.println("Date should be between 1 to 31");
				System.exit(0);
			}
			System.out.println("Enter Month:");
			month=sc.nextInt();
			//System.out.println("hiii");
			if(month<=0 || month>12)
			{
				System.out.println("Your Month should be between 1 to 12  ");
				System.exit(0);
			}
			
		}catch(Exception e){}
		System.out.println("Enter year:");
		year=sc.nextInt();
		if(year<2017)
		{
			System.out.println("Please enter year above 2017");
			System.exit(0);
		}
		 date=day+"/"+month+"/"+year;
		return date;
	}
	
	String getCustomerName() {
		System.out.println("Enter your name:");
		String name="";
		return name=sc.next();
		
	}
	@Override
	int age() {
		System.out.println("Enter your age:");
		age=sc.nextInt();
		/*int total=0;
		System.out.println("Enter no of tickets:");
		int no=sc.nextInt();
		if(age<=13)
		{
			total=no*90;
			return total;
		}else if(age>13 || age<=60){
			total=(int) (no*getFair());
			return total;
		}else if(age>60){
			total=no*110;
			return total;
		}
		System.out.println(age);
		System.out.println("Total Fair:");*/
		return age;
		
	}
	@Override
	long getPhone() {
		System.out.println("Enter your phone no:");
		long phone=sc.nextLong();
		return phone;
	}
	
	
}