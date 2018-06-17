package abstract_factory_design_vending_machine;

import java.util.Scanner;

public class VendingMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter what you want (Softdrink/Icecream/Soda):");
		String str=sc.next();
		vendingFactory  vf=null;
		if(str.equalsIgnoreCase("soda"))
		{
			vf=new SodaFactory();
		}else if(str.equalsIgnoreCase("Icecream"))
		{
			vf=new IceCreamFactory();
		}else if(str.equalsIgnoreCase("SoftDrink"))
		{
			vf=new SoftDrinkFactory();
		}
		VendingMachine vm=FactoryDesign.getInstance(vf);
		System.out.println(vm);

	}

}
