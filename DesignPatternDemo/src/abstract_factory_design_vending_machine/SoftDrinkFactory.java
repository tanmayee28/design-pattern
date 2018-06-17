package abstract_factory_design_vending_machine;

public class SoftDrinkFactory implements vendingFactory {

	@Override
	public VendingMachine getItemFactory() {
		// TODO Auto-generated method stub
		return new SoftDrinkClass();
	}

}
