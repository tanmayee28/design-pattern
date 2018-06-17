package abstract_factory_design_vending_machine;

public class SodaFactory implements vendingFactory {

	@Override
	public VendingMachine getItemFactory() {
		
		return new SodaClass();
	}

}
