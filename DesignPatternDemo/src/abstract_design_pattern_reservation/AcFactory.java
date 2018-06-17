package abstract_design_pattern_reservation;

public class AcFactory extends TicketFactory{
	
	public TicketClass getTicket() {
		
		return new AcClass();
	}

}
