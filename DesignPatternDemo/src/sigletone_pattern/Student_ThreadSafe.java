package sigletone_pattern;

public class Student_ThreadSafe {
	private int student_id;
	private String student_name;
	
	private static Student_ThreadSafe student_thread;
	private Student_ThreadSafe(int student_id, String student_name) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
	}

	@Override
	public String toString() {
		return "\n Student_ThreadSafe [student_id=" + student_id + ", student_name=" + student_name + "]";
	}

	public static synchronized Student_ThreadSafe getInstance()	
	{
		if(student_thread==null)
		{
			student_thread=new Student_ThreadSafe(4,"Soundarya");
		}
		return student_thread;
		
	}
	

}
