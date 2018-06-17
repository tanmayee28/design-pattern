package sigletone_pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import sigletone_pattern.Student_Enum.student_enum;

public class StudentMainClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Student_Eager student=Student_Eager.getInstance();
		System.out.println(student);
		
		Student_Eager student1=Student_Eager.getInstance();
		System.out.println(student1);
		if(student==student1)
		{
			System.out.println("Eager Initialization done");
		}
		else{
			System.out.println("Eager Initialization not done");
		}
		Student_Static_Block student_static=Student_Static_Block.getInstance();
		System.out.println(student_static);
		
		Student_Static_Block student_static1=Student_Static_Block.getInstance();
		System.out.println(student_static1);
		
		if(student_static==student_static1)
		{
			System.out.println("Static block Initialization done");
		}
		else{
			System.out.println("Static block  Initialization not done");
		}
		
		Student_Lazy student_lazy=Student_Lazy.getInstance();
		System.out.println(student_lazy);
		Student_Lazy student_lazy1=Student_Lazy.getInstance();
		System.out.println(student_lazy1);
		if(student_lazy==student_lazy1)
		{
			System.out.println("Lazy Initialization done");
		}
		else
		{
			System.out.println("Lazy  Initialization not done");
		}
		
		Student_ThreadSafe student_thread=Student_ThreadSafe.getInstance();
		System.out.println(student_thread);
		
		Student_ThreadSafe student_thread1=Student_ThreadSafe.getInstance();
		System.out.println(student_thread1);
		if(student_thread==student_thread1)
		{
			System.out.println("Thread safe Initialization done");
		}
		else
		{
			System.out.println("Thread safe  Initialization not done");
		}
		
		Student_double_Check student_double=Student_double_Check.getInstance();
		System.out.println(student_double);
		
		Student_double_Check student_double1=Student_double_Check.getInstance();
		System.out.println(student_double1);
		if(student_double==student_double1)
		{
			System.out.println("Double Check Initialization is done");
		}
		else
		{
			System.out.println("Double Check Initialization is not done");
		}
		
		Student_Bill_Pugh studentBill=Student_Bill_Pugh.getInstance();
		System.out.println(studentBill);
		
		Student_Bill_Pugh studentBill_1=Student_Bill_Pugh.getInstance();
		System.out.println(studentBill_1);
		
		if(studentBill==studentBill_1)
		{
			System.out.println("Bill Pugh Initialization is done");
		}
		else
		{
			System.out.println("Bill Pugh Initialization is not done");
		}
		//Student_Enum student_enum1=Student_Enum.student_enum;
		student_enum obj1, obj2;
		obj1=student_enum.obj;
		obj2=student_enum.obj;
		
		if(obj1==obj2)
		{
			System.out.println("Enum Initialization is done");
		}
		else
		{
			System.out.println("Enum Initialization is not done");
		}
		
		System.out.println("------Reflection Mechanism---------");
		Student_Bill_Pugh obj=null;
		Student_Bill_Pugh s1=Student_Bill_Pugh.getInstance();
		Constructor[]con=Student_Bill_Pugh.class.getConstructors();
		for(Constructor c:con)
		{
			c.setAccessible(true);
			 obj=(Student_Bill_Pugh)c.newInstance();
			
		}
		System.out.println(s1==obj);
		
		
		
		
		
	}
	

}
