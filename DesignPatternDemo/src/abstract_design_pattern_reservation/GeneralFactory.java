package abstract_design_pattern_reservation;

public class GeneralFactory extends TicketFactory{

	
	public TicketClass getTicket() {
		
		return new GeneralClass();
	}

}
