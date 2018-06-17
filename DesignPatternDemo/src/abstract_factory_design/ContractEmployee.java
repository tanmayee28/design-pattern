package abstract_factory_design;

public class ContractEmployee extends Employee{

	@Override
	int getEmployeeId() {
		
		return 1202;
	}

	@Override
	String getEmployeeName() {
	
		return "Sunil";
	}

	@Override
	double getEmployeeSalary() {
		
		return 12000;
	}

	@Override
	int getNoHolidays() {
			return 21;
	}

}
