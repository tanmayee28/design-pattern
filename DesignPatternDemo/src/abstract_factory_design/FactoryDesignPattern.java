package abstract_factory_design;

public class FactoryDesignPattern {
	
	/*public static Employee getEmployeeObject(EmpType type){
		if(type.equals(EmpType.pemp))
		{
			return new PermanentEmployee();
		}else if(type.equals(EmpType.cemp)){
			return new ContractEmployee();
			
		}
		return null;
	}
	enum EmpType{
		pemp,
		cemp
	}*/
		
		public static Employee getEmployeeObject(String type){
			if(type.equals("Permenant"))
			{
				return new PermanentEmployee();
			}else if(type.equals("Contract")){
				return new ContractEmployee();
				
			}
			return null;
		}
		
}