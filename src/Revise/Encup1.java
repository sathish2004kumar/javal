package Revise;



class Account{
	private String name;
	private Long acnumber;

	public Account(String n ,Long a) {
		this.name=n;
		this.acnumber=a;
	}
		public String getName() {
			return name;
			}
		public Long getAcnumber() {
			return acnumber;
		}
}
		public class Encup1{
			public static void main(String[] args) {
				Account A1 = new Account("sathish",1234567L);
				Account A2 = new Account("alagu",3456787L);
				System.out.println("Account1:"+A1.getName()+"Account 1:"+A1.getAcnumber());
				System.out.println("Account2:"+A2.getName()+"Account 2:"+A2.getAcnumber());
				
			}
		}
		
	
