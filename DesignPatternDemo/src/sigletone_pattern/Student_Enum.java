package sigletone_pattern;

 class Student_Enum {
	
	 private int student_id;
	 private String student_name;
	 
	private Student_Enum(int student_id, String student_name) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
	}

	enum student_enum{
		obj;
	}
}
