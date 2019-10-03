package nhat_days_2;

import java.util.ArrayList;

public class nhat_day1_arraylist {
	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		ArrayList<String> cars = new ArrayList();
		cars.add("BMW");
		cars.add("ford");
		for(int i = 0 ;i < cars.size(); i++)
		{
			System.out.println(cars.get(i));
		}
	}
}
