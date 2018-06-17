package abstract_factory_design_vending_machine;

public class IceCreamFactory implements vendingFactory{

	@Override
	public VendingMachine getItemFactory() {
		// TODO Auto-generated method stub
		return new IceCreamClass();
	}

}
