package abstract_factory_design_vending_machine;

public abstract class VendingMachine {
	abstract String getItem();
	abstract int getNoItem();
	abstract int getBill(String str);
	@Override
	public String toString() {
		return "Your Bill Summery"+"\n Your Ordered Item =" + getItem() + "\n"+"Your total Amount:"+getBill(getItem());
	}
	
	
}
