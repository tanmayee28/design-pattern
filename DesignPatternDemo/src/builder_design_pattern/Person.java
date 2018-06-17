package builder_design_pattern;

public  class Person {
	String eating,sleeping;
	String walking,entertainment,coding;
	
	
	private Person(PersonInnerclass p) {
		this.coding=p.coding;
		this.eating =p. eating;
		this.sleeping = p.sleeping;
		this.entertainment=p.entertainment;
		this.walking=p.walking;
	}
	

	@Override
	public String toString() {
		return "Person [eating=" + eating + ", sleeping=" + sleeping + ", walking=" + walking + ", entertainment="
				+ entertainment + ", coding=" + coding + "]";
	}


	public static class PersonInnerclass{
		
		String eating, sleeping;
		String walking,entertainment,coding;
		PersonInnerclass(String eating,String sleeping)
		{
			super();
			this.eating=eating;
			this.sleeping=sleeping;
		}
		public PersonInnerclass setWalking(String walking)
		{
			this.walking=walking;
			return this;
		}
		public PersonInnerclass setEntertainmaent(String entartainment)
		{
			this.entertainment=entertainment;
			return this;
			
		}
		public PersonInnerclass setCoding(String code)
		{
			this.coding=code;
			return this;
		}
		public Person build(){
			return new Person(this);
		}
	}
}
