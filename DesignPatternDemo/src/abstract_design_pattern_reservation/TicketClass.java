package abstract_design_pattern_reservation;

import java.sql.Date;


public abstract class TicketClass {
	abstract String getCustomerName();
	abstract int age();
	abstract long getPhone();
	abstract String getTrainName();
	abstract double getFair();
	abstract String getjourney();
	abstract String getDate();
	
	public String toString() {
		return "\n"+ "Train Name=" + getTrainName() + "\n"+ "journey="
				+ getjourney() +"\n"+ "Date=" + getDate()+"\n"+ "Customer Name:"+getCustomerName()+"\n"+"Your No:"+getPhone()+"\n"+"Cusomer Age:"+age()+"\n"+"Fair=" +"RS "+ getFair();
	}
	

}
/*

Train Name=mahalaxmi
Fair=RS110.0/per person
journey=kolhapure-mumbai
Date=23/5/2018 Customer Name:Tanamyee
Cusomer Age:220
*/