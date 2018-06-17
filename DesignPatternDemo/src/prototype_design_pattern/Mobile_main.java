package prototype_design_pattern;

import java.util.Scanner;

public class Mobile_main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String mnm="";
		double price=0.0;
		String isbluetooth="";
		long imino=0;
		try{
			System.out.println("Enter Mobile name: ");
			mnm=sc.next();
			System.out.println("Enter Price");
			price=sc.nextDouble();
			System.out.println("IS bluetooth available(Yes/No):");
			isbluetooth=sc.next();
		}catch(Exception e){}
		Mobile name=new Mobile(mnm,price,isbluetooth,111111);
		System.out.println(name);
		Mobile m1=name.Clone();
		System.out.println(m1);
		System.out.println(name==m1);
	}

}
