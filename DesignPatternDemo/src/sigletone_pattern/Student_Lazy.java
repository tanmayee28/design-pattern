package sigletone_pattern;

 class Student_Lazy {
	private int student_id;
	private String student_name;
	
	private static Student_Lazy student=null;
	
	private Student_Lazy(int student_id, String student_name) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
	}
	@Override
	public String toString() {
		return "\n Student_Lazy [student_id=" + student_id + ", student_name=" + student_name + "]";
	}
	 public static Student_Lazy getInstance()
	 {
		if(student==null)
		{
			student = new Student_Lazy(3,"Pranjali");
		}
		return student;
	 }
	

}
