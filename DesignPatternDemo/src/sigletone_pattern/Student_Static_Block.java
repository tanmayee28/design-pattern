package sigletone_pattern;

public class Student_Static_Block {
	private int student_id;
	private String student_name;
	private static final Student_Static_Block studentObj;
	static
	{
		studentObj=new Student_Static_Block(2,"Snehal");
	}
	private Student_Static_Block(int student_id, String student_name) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
	}
	@Override
	public String toString() {
		return "\n Student_Static_Block [student_id=" + student_id + ", student_name=" + student_name + "]";
	}
	public  static Student_Static_Block getInstance()
	{
		return  studentObj;
	}
	
}
