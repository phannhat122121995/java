package nhat_days_2;


import java.util.ArrayList;
import java.util.List;

public class day3_example_array {
	public static void main(String[] args) {
        List<String> itemList = new ArrayList<String>();
        itemList.add("apple");
        itemList.add("orange");
        
        String[] itemArray = new String[itemList.size()];
        itemArray = itemList.toArray(itemArray);
        
        for(String s : itemArray)
        {
        	System.out.println(s);
        }
        System.out.println(itemArray[0]);
	}
}
