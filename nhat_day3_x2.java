package nhat_days_2;

import java.util.Scanner;

public class nhat_day3_x2 {
	public static void main(String[] agrs)
	{
		 Scanner scanner=new Scanner(System.in);
	       System.out.println("multiplication table:");
	        System.out.println("input number");
	        int i=scanner.nextInt();
	       int num=1;
	        while(num<=10){
	            System.out.printf("\n%d * "+i+" = %d",num,(num * i));
	            num++;
	        }
	}

}
