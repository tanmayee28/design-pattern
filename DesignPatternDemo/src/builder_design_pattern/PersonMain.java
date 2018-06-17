package builder_design_pattern;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person.PersonInnerclass("Hungry Always","DayToNight").setEntertainmaent("Dance").setWalking("Straight").build();
		System.out.println(p);
	}

}
