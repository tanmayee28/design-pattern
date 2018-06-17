package abstract_factory_design_vending_machine;

public class FactoryDesign {
	public static VendingMachine getInstance(vendingFactory afactory)
	{
		return afactory.getItemFactory();
		
	}

}
