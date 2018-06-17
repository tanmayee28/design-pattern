package abstract_design_pattern_reservation;

public class SleeperFactory extends TicketFactory{

	@Override
	public TicketClass getTicket() {
		
		return new SleeperClass();
	}

}
