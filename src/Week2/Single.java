package Week2;

//public class Single {
	class person{
		void displayperson() {
			System.out.println("I am a person");
		}
	}
	class Student extends person{
		void displayStudent() {
			System.out.println("I am a Studying");
			
		}
	}
	interface Teaching
	{
	void experience();
	}
	class Staff extends Student implements Teaching{
		public void experience() {
			System.out.println("I have 5 years of teaching experience");
		}
	}
public class Single{
	public static void main(String[] args) {
		Student s = new Student();
		Staff s1 = new Staff();
		s.displayperson();
		s.displayStudent();
		s1.experience();
		
		
	}
}

