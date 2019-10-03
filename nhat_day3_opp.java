package nhat_days_2;

public class nhat_day3_opp {
	int id;
	String name;
	void insertRecord(int id, String name)
	{
		this.id = id;
		this.name = name;
		
	}
	void displayinformations()
	{
		System.out.println(id + " "+name);
	}
	public static void main(String[] agrs)
	{
		nhat_day3_opp s1 = new nhat_day3_opp();
		nhat_day3_opp s2 = new nhat_day3_opp();
		
		s1.insertRecord(1, "phan nhat");
		s2.insertRecord(2, "nhat");
		
		s1.displayinformations();
		s2.displayinformations();
		
	}
	

}
