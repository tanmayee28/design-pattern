package abstract_factory_design_vending_machine;

import java.util.Scanner;

public class SoftDrinkClass extends VendingMachine {
	
	Scanner sc=new Scanner(System.in);
	String str="";
	{
		System.out.println("Select your item from (mirrinda/maza/pepsi/sprite):");
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
	{//mirinda/maza/pepsi/sprite
	case "mirinda":
						//System.out.println("you have ordered "+getItem());
							no=getNoItem();
						    total=no*40;
						    break;
	case "maza":
						//System.out.println("you have ordered "+getItem());
							no=getNoItem();
						    total=no*35;
						    break;
	case "pepsi":
						//System.out.println("you have ordered "+getItem());
							no=getNoItem();
							total=no*25;
							break;
	case "sprite":
						//System.out.println("you have ordered "+getItem());
							no=getNoItem();
							total=no*30;
							break;
	default :
					//	System.out.println("you have ordered thums up ");
							no=getNoItem();
							total=no*25;
							break;
	}
	return total;
	
	
}


}
