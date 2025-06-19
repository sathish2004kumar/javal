package Week2;

public class encapsulation {

	public static void main(String[] args) {

        Student s = new Student();
        s.setName("Dhoni");
        System.out.println("Student Name:" + s.getName());

    
    }

	   static class Student{
	        private String name;
	        public void setName(String n)
	        {
	            name = n;
	        }
	        public String getName()
	        {
	            return name;

	        }
	   {

	    }
	    
	}

		// TODO Auto-generated method stub

}
