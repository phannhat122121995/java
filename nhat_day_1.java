package nhat_days_2;

import java.util.Scanner;

public class nhat_day_1 {
	public static void main(String[] args)
	{
		
		int product1 =100;
		int product2=200;
		int produc3=300;
		String price1 = "coke";
		String price2 = "sup";
		String price3 = "milk";
		String choosemore = "";
		String insertmoney = "";
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("money");
		int inputmoney = scan1.nextInt();
		if(inputmoney > 99)
		{
			if(inputmoney>= product1)
			{
				System.out.println("choce product");
				String select_product = scan2.nextLine();
				if(select_product.equals(price1))
				{
					System.out.println("you need " + product1 +  " here");
					inputmoney = inputmoney - product1;
					System.out.println("======>"+ inputmoney);
					if(inputmoney < 99)
					{
						System.out.println("do you want add money? nhan 1");
						inputmoney = scan1.nextInt() + inputmoney ;
						System.out.println("tong sau khi nhap la :" + inputmoney);
					}
					
					
				}
			}
			System.out.println("tong so la"+ inputmoney);
			
			if(inputmoney>= product2)
			{
				
				System.out.println("choce product");
				String select_product = scan2.nextLine();
				if(select_product.equals(price1))
				{
					System.out.println("you need" +product2+  "here");
					inputmoney = inputmoney - product2;
					System.out.println("i can"+ inputmoney);
					
				}
			}
		}
		else 
		{
			System.out.println("add money");
		}
		
		
	}

}
