package com.assignment9;

public class InheritanceStudentUse {
	public static void main(String[] args) {
		InheritanceStudent s1 = new InheritanceStudent();
		s1.name = "Monu";
		
		InheritanceStudent s2 = new InheritanceStudent();
		s2.name = "Ajit";
		
		s1.display();
		s2.display();
	}
	
}
