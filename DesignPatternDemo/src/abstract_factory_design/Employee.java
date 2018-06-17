package abstract_factory_design;

public abstract class Employee {
	private int eid;
	private String enm;
	double esalary;
	abstract int getEmployeeId();
	abstract String getEmployeeName();
	abstract double getEmployeeSalary();
	abstract int getNoHolidays();
}
