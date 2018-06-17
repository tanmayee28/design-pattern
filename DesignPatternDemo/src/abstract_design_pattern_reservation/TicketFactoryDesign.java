package abstract_design_pattern_reservation;

public class TicketFactoryDesign {
	public static TicketClass getTicketInstance(TicketFactory afactory)
	{
		return afactory.getTicket();
	}

}
