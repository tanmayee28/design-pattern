package abstract_factory_design_vending_machine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SodaClass extends VendingMachine  {


		Scanner sc=new Scanner(System.in);
		String str="";
		{
			System.out.println("Select your item from (bluesoda-30/masalasoda-20/lemonsoada-25/orangesoda-35");
			try{
					str=sc.next();
				}catch(Exception e){}
		}
		String getItem() 
		{
			return str;
		}
	@Override
	int getNoItem() {
		System.out.println("Enter no of items:");
		int no=0;
		try{
				no=sc.nextInt();
			}catch(Exception e){}
		return no;
	}

	int getBill(String str) {
		int no,total=0;
		switch(str)
		{
		case "bluesoda":
							//System.out.println("you have ordered "+getItem());
								no=getNoItem();
							    total=no*30;
							    break;
		case "masalasoda":
							//System.out.println("you have ordered "+getItem());
								no=getNoItem();
							    total=no*20;
							    break;
		case "lemonsoda":
							//System.out.println("you have ordered "+getItem());
								no=getNoItem();
								total=no*25;
								break;
		case "orangesoda":
							//System.out.println("you have ordered "+getItem());
								no=getNoItem();
								total=no*35;
								break;
		default :
							//System.out.println("you have ordered normal soda");
								no=getNoItem();
								total=no*15;
								break;
		}
		return total;
		
		
	}
	
	
}
