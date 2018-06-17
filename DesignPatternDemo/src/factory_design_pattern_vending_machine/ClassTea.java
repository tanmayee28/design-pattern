package factory_design_pattern_vending_machine;

import java.util.Scanner;

public class ClassTea extends VendingMachine {

	//Scanner sc=new Scanner(System.in);
	double getSugerPrice() {
		System.out.println("Your Normal Tea Price is RS:");
		return 90;
	}

	@Override
	double getSugerFreePrice() {
		System.out.println("Your Suger free Tea is at RS:");
		return 100;
	}

	@Override
	public void getName() {
	/*	System.out.println("Your Tea is :");
		return "Green Tea";
	}
	public void typeTea()
	{*/
		Scanner sc=new Scanner(System.in);
		//String type="";
		System.out.println("Enter Your tea type:(Greentea/Flavouredtea/Gingertea)");
		String type=sc.next();
		//System.out.println("type"+type);
		switch(type)
		{
			case "Greentea":
							System.out.println("You have Ordered Green Tea");
								break;
			case "Flavouredtea": 
							System.out.println("You have Ordered Flavoured Tea");
								break;
			case "Gingertea":
							System.out.println("You have Ordered Ginger Tea");
								break;
			default:
							System.out.println("Your tea is normal one");
						
		}
	}

}
