package factory_design_pattern_vending_machine;

import java.util.Scanner;

import factory_design_pattern_vending_machine.VendingFactory.MachineType;

public class VendingMain {

	public static void main(String[] args) {
		String type;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Type (Tea/Coffie):");
	type=sc.next();
	if(type.equalsIgnoreCase("coffie"))
	{
		VendingMachine m1=VendingFactory.getInstance(MachineType.cclass);
		if(m1 instanceof ClassCoffie)
		{
			ClassCoffie coffie=(ClassCoffie)m1;
			m1.getName();
			System.out.println(m1.getSugerFreePrice());
			System.out.println(m1.getSugerPrice());

		}
	}
	else if(type.equalsIgnoreCase("tea"))
	{
		VendingMachine m2=VendingFactory.getInstance(MachineType.tclass);
		if(m2 instanceof ClassTea)
		{
			ClassTea tea=(ClassTea)m2;
			m2.getName();
			System.out.println(m2.getSugerFreePrice());
			System.out.println(m2.getSugerPrice());
		}
	}
	/*VendingMachine m1=VendingFactory.getInstance(MachineType.cclass);
	VendingMachine m2=VendingFactory.getInstance(MachineType.tclass);
	
	if(m1 instanceof ClassCoffie)
	{
		ClassCoffie coffie=(ClassCoffie)m1;
	}else if(m2 instanceof ClassTea)
	{
		ClassTea tea=(ClassTea)m2;
	}
	System.out.println(m1.getName());
	System.out.println(m1.getSugerFreePrice());
	System.out.println(m1.getSugerPrice());
	
	System.out.println(m2.getName());
	System.out.println(m2.getSugerFreePrice());
	System.out.println(m2.getSugerPrice());
	*/}
}