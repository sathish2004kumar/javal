package Revise;


class institue{
	private String name ="sathish";
	private String Dept = "java";
}

class Company{
	private String name ="alagu";
	private String Dept ="IT Dept";


public String getName() {
	return name;
}
public String getDept() {
	return Dept;
}}


class Bank{
	Company c;
	Bank(){
		Company c = new Company();
	}

public void Details(){
	System.out.println("Company name:"+c.getName());
	System.out.println("Company name:"+c.getDept());
	
}
}
public class Bankk5 {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.Details();

	}

}
