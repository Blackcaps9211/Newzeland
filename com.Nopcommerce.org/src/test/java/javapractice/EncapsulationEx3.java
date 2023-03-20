package javapractice;

public class EncapsulationEx3 {
	
	
	private int rollno = 514;
	private String Name = "Veeru";
	private long contact = 9000877740l;

	public static void main(String[] args) {
		EncapsulationEx3 my2 = new EncapsulationEx3();
		
		
		System.out.println(my2.getRollno());
		System.out.println(my2.getName());
		System.out.println(my2.getContact());

	//	my2.getRollno();
	//	my2.getName();
	//	my2.getContact();
	
		
		my2.setRollno(532);
		my2.setName("prem");
		my2.setContact(9000777750l);
	}

	public int getRollno() {
		return rollno;
	//	System.out.println(rollno);
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
		System.out.println(rollno);

	}

	public String getName() {
		return Name;
		//System.out.println(Name);

	}

	public void setName(String name) {
		Name = name;
		System.out.println(Name);

	}

	public long getContact() {
		return contact;
	//	System.out.println(contact);

	}

	public void setContact(long contact) {
		this.contact = contact;
		System.out.println(contact);

	}

}
