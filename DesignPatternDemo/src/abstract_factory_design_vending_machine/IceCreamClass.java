package abstract_factory_design_vending_machine;

import java.util.Scanner;

public class IceCreamClass extends VendingMachine {
	Scanner sc=new Scanner(System.in);
	String str="";
	{
		System.out.println("Select your item from (chocobar-20 /mango-35/pista-15/butterscotch-50):");
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
	{//chocobar/mango/pista/butterscotch
	case "chocobar":
					//	System.out.println("you have ordered "+getItem());
							no=getNoItem();
						    total=no*20;
						    break;
	case "mango":
					//	System.out.println("you have ordered "+getItem());
							no=getNoItem();
						    total=no*35;
						    break;
	case "pista":
						//System.out.println("you have ordered "+getItem());
							no=getNoItem();
							total=no*15;
							break;
	case "butterscotch":
						//System.out.println("you have ordered "+getItem());
							no=getNoItem();
							total=no*50;
							break;
	default :
					//	System.out.println("you have ordered vannila");
							no=getNoItem();
							total=no*10;
							break;
	}
	return total;
	
	
}


}
