package abstract_factory_design;

public class PermanentEmployee extends Employee {

	
	@Override
	int getEmployeeId() {
		
		return 1204601;
	}

	@Override
	String getEmployeeName() {
		// TODO Auto-generated method stub
		return "Vyankatesh";
	}

	@Override
	double getEmployeeSalary() {
		return 50000;
	}

	@Override
	int getNoHolidays() {
		
		return 31;
	}
	

}
