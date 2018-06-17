package abstract_design_pattern_reservation;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class SleeperClass extends TicketClass {
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
			total=80*no;
			return total;
		}else if(age1>13 || age1<=60){
			total=no*180;
			return total;
		}else if(age1>60){
			total=no*120;
			return total;
		}
		return total;

	}

	
	String getjourney() {
		 String source="";
		 String dest="";
		 String jrny;
		
		try{
			System.out.println("Enter Your Source city:");
		     source=sc.next();
		     System.out.println("Enter Your destination city:");
		       dest=sc.next();
		}catch(Exception e){}
		//System.out.println("Your journey is from :");
		jrny=source+"-"+dest;
		return jrny;
	}

	
	String getDate() {
		int  day=0,month=0,year=0;
		String date=null;
	//	System.out.println("Enter your journey date:");
		try{
			System.out.println("Enter date :");
			day=sc.nextInt();
			if(day<=0 || day>31)
			{
				System.out.println("Date should be between 1 to 31");
				System.exit(0);
			}
			System.out.println("Enter Month:");
			month=sc.nextInt();
			if(month<=0 || month>12)
			{
				System.out.println("You Month should be between 1 to 12  ");
				System.exit(0);
			}
			/*System.out.println("Enter year:");
			year=sc.nextInt();*/
		}catch(Exception e){}
		System.out.println("Enter year:");
		year=sc.nextInt();
		if(year<2017)
		{
			System.out.println("Please enter year above 2017");
			System.exit(0);
		}
	/*	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		try{
		 date=(Date)sdf.parse("2018-day-month 9:02:12");
		
		}catch(Exception e){}*/
		 date=day+"/"+month+"/"+year;
			return date;
		
		
	}
	@Override
	String getCustomerName() {
		System.out.println("Enter your name:");
		String name="";
		name=sc.next();
		return name;
	}
	@Override
	int age() {
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		/*System.out.println("Enter no of tickets:");
		int no=sc.nextInt();
		int total=0;
		if(age<=13)
		{
			total=80*no;
			return total;
		}else if(age>13 || age<=60){
			total=(int) (no*getFair());
			return total;
		}else if(age>60){
			total=no*120;
			return total;
		}*/
		return age;

		
	}
	long getPhone() {
		System.out.println("Enter your phone no:");
		long phone=sc.nextLong();
		return phone;
	}


}
