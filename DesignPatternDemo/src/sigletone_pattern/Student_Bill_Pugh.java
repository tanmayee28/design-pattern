package sigletone_pattern;

public class Student_Bill_Pugh {
	private int student_id;
	private String student_name;

	private Student_Bill_Pugh(int student_id, String student_name) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
	}
	
	private static final class Student_Bill_InnerClass {
		private static final Student_Bill_Pugh student_Bill=new Student_Bill_Pugh(6,"Shraddha");
	}
	
	@Override
	public String toString() {
		return "\n Student_Bill_Pugh [student_id=" + student_id + ", student_name=" + student_name + "]";
	}

	public static Student_Bill_Pugh getInstance(){
		return Student_Bill_InnerClass.student_Bill;
	}

}
