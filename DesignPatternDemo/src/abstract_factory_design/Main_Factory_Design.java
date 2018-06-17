package abstract_factory_design;

//import abstract_factory_design.FactoryDesignPattern.EmpType;//

public class Main_Factory_Design {

	public static void main(String[] args) {
		//Employee e1=FactoryDesignPattern.getEmployeeObject(EmpType.pemp);
		Employee e1=FactoryDesignPattern.getEmployeeObject("Permenant");
		System.out.println("Information about Permanent Employee");
		System.out.println(e1.getEmployeeId());
		System.out.println(e1.getEmployeeName());
		System.out.println(e1.getEmployeeSalary());
		System.out.println(e1.getNoHolidays());
		
		System.out.println("--------------------------------------");
		//Employee e2=FactoryDesignPattern.getEmployeeObject(EmpType.cemp);
		Employee e2=FactoryDesignPattern.getEmployeeObject("Contract");
		System.out.println("Information about Contract Basis Employee");
		System.out.println(e2.getEmployeeId());
		System.out.println(e2.getEmployeeName());
		System.out.println(e2.getEmployeeSalary());
		System.out.println(e2.getNoHolidays());
		
		System.out.println("Checking reference Equality:"+"\n");
		System.out.println(e1==e2);
		
		System.out.println("Checking Instance of Employee1:");
		System.out.println(e1 instanceof PermanentEmployee);
		System.out.println(e1 instanceof ContractEmployee);
		System.out.println("Checking Instance of Employee2:");
		System.out.println(e2 instanceof PermanentEmployee);
		System.out.println(e2 instanceof ContractEmployee);
	}

}
