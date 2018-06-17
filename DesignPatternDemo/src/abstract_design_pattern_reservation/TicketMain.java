package abstract_design_pattern_reservation;

import java.util.Scanner;

public class TicketMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String type="";
		TicketFactory tf=null;

		System.out.println("Enter your ticket type:(General class/Sleeper class/Ac class)");
		try{
			type=sc.next();
		}catch(Exception e){}
		if(type.equalsIgnoreCase("General"))
		{
			 tf=new GeneralFactory();
			
		}else if(type.equalsIgnoreCase("Sleeper"))
		{
			 tf=new SleeperFactory();
			
		}else if(type.equalsIgnoreCase("Ac"))
		{
			 tf=new AcFactory();
			
		}
		TicketClass ticket=TicketFactoryDesign.getTicketInstance(tf);
		System.out.println(ticket);	
	}

}
