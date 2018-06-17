package sigletone_pattern;

public class Student_double_Check {
	private int student_id;
	private String student_name;
	
	private static Student_double_Check student;
	private Student_double_Check(int student_id, String student_name) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
	}
	@Override
	public String toString() {
		return "\n Student_double_Check [student_id=" + student_id + ", student_name=" + student_name + "]";
	}

	public static Student_double_Check getInstance()
	{
		if(student==null){
		synchronized(Student_double_Check.class)
		{
			if(student==null)
			{
				student=new Student_double_Check(5,"Monali");
			}
		}
		}
		return student;
		
	}
		
	
}
