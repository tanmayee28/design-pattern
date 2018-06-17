package factory_design_pattern_vending_machine;

import java.util.Scanner;

public class ClassCoffie extends VendingMachine{
	
	public double getSugerPrice() {
		System.out.println("Coffiee with Suger at a rate:");
		return 200;
	}

	@Override
	double getSugerFreePrice() {
		System.out.println("Suger Free coffie at the rate :");	
		return 250;
	}

	@Override
	public void  getName() {
	/*	System.out.println("Your coffiee name is :");
				return "Coffee Mocha";
	}*/
		Scanner sc=new Scanner(System.in);
		String type="";
		System.out.println("Enter Your coffie type:(Thickcoffie/Coldcoffie/Coffiemocha)");
		type=sc.next();
		switch(type)
		{
			case "Thickcoffie":
							System.out.println("You have Ordered Thick coffie");
									break;
			case "Coldcoffie":
							System.out.println("You have Ordered cold coffie");
									break;
			case "Coffiemocha":
							System.out.println("You have Ordered coffie mocha");
									break;
			default:System.out.println("Your Coffie is normal one");
									
		}

}
}
