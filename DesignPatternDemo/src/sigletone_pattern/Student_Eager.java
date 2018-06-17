package sigletone_pattern;

  class Student_Eager {
	private int student_id;
	private String student_name;
	
	private static final Student_Eager studenteager =new  Student_Eager(1,"Tanmayee");
	
	private Student_Eager(int student_id, String student_name) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
	}
	
	@Override
	public String toString() {
		return "\n Student_Eager [student_id=" + student_id + ", student_name=" + student_name + "]";
	}

	public static Student_Eager getInstance()
	{
		return studenteager;
	}
	

}
