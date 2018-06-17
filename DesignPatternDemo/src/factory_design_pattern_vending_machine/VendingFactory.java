package factory_design_pattern_vending_machine;

public class VendingFactory {
	public static VendingMachine getInstance(MachineType type)
	{
		if(type.equals(MachineType.cclass)){
			return new ClassCoffie();
		}else if(type.equals(MachineType.tclass))
		{
			return new ClassTea();
		}
		return null;
	}
	enum MachineType{
		cclass,
		tclass;
	}
}
