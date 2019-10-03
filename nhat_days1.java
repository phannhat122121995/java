package nhat_days_2;

import java.util.ArrayList;
import java.util.Scanner;

public class nhat_days1
{
	public static void main(String[] args) {
		int inputMoney = 0;
		int productPrice1 = 200;
		int productPrice2 = 400;
		int productPrice3 = 600;
		String product1 = "beer";
		String product2 = "vodca";
		String product3 = "soju";
		String selectProduct = "";
		String chooseMore = "";
		String insertMoreMoney = "";
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		Scanner scan4 = new Scanner(System.in);
		Scanner scan5 = new Scanner(System.in);
		ArrayList<String> arrayproduct = new ArrayList<>();
		ArrayList<Integer> arrayint = new ArrayList<>();	
		int sum =0;
		while (true) {
			if (!chooseMore.equals("y") && !insertMoreMoney.equals("y")) {
				System.out.println("insert Money");
				inputMoney += scan.nextInt();
			}
			if (inputMoney >= productPrice1 || inputMoney >= productPrice2 || inputMoney >= productPrice3) {
				while (inputMoney >= productPrice1 || inputMoney >= productPrice2 || inputMoney >= productPrice3) {
					System.out.println("choose a product");
					selectProduct = scan2.nextLine();
					if (selectProduct.equals(product1)) {
						arrayint.add(productPrice1);
						arrayproduct.add(product1);
						if (inputMoney >= productPrice1) {
							
							inputMoney = inputMoney - productPrice1;
							System.out.println("your change :" + inputMoney);
							
						} else {
							System.out.println("Want to more insert Money?  y/n");
							insertMoreMoney = scan4.nextLine();
							if (insertMoreMoney.equals("y")) {
								System.out.println("insert Money");
								inputMoney += scan5.nextInt();
							} else if (insertMoreMoney.equals("n")) {
								System.out.println("your change = " + inputMoney);
								System.out.println("Good bye !!");
								for(int a : arrayint)
								{
									sum += a;
								}
								System.out.println("product    ||     price");
								System.out.println("========================================");
								for(int i =0; i <arrayproduct.size();i++ ) {
									
									System.out.println("-"+arrayproduct.get(i)+"      ||      "+arrayint.get(i)+" WON"+"\n");
									System.out.println("----------------------------------------");
								}
								System.out.println("total       =      "+sum+" WON");
								System.out.println("........................................");
								System.out.print("residual :         "+inputMoney+" WON");
								System.out.println("\n========================================");
								return;
							}
						}
					}
					if (selectProduct.equals(product2)) {
						if (inputMoney >= productPrice2) {
							arrayint.add(productPrice2);
							arrayproduct.add(product2);
							inputMoney = inputMoney - productPrice2;
							System.out.println("your change :" + inputMoney);
						} else {
							System.out.println("Want to more insert Money?  y/n");
							insertMoreMoney = scan4.nextLine();
							if (insertMoreMoney.equals("y")) {
								System.out.println("insert Money");
								inputMoney += scan5.nextInt();
							} else if (insertMoreMoney.equals("n")) {
								System.out.println("your change = " + inputMoney);
								System.out.println("Good bye !!");
								for(double a : arrayint)
								{
									sum += a;
								} 
								System.out.println("product    ||     price");
								System.out.println("========================================");
								for(int i =0; i <arrayproduct.size();i++ ) {
									
									System.out.println("-"+arrayproduct.get(i)+"      ||      "+arrayint.get(i)+" WON"+"\n");
									System.out.println("----------------------------------------");
								}
								System.out.println("total       =      "+sum+" WON");
								System.out.println("........................................");
								System.out.print("residual :         "+inputMoney+" WON");
								System.out.println("\n========================================");
								return;
							}
						}
					}
					if (selectProduct.equals(product3)) {
						if (inputMoney >= productPrice3) {
							arrayint.add(productPrice3);
							arrayproduct.add(product3);
							inputMoney = inputMoney - productPrice3;
							System.out.println("your change :" + inputMoney);
						} else {
							System.out.println("Want to more insert Money?  y/n");
							insertMoreMoney = scan4.nextLine();
							if (insertMoreMoney.equals("y")) {
								System.out.println("insert Money");
								inputMoney += scan5.nextInt();
							} else if (insertMoreMoney.equals("n")) {
								System.out.println("your change = " + inputMoney);
								System.out.println("Good bye !!");
								for(double a : arrayint)
								{
									sum += a;
								}
								System.out.println("product    ||     price");
								System.out.println("========================================");
								for(int i =0; i <arrayproduct.size();i++ ) {
									
									System.out.println("-"+arrayproduct.get(i)+"      ||      "+arrayint.get(i)+" WON"+"\n");
									System.out.println("----------------------------------------");
								}
								System.out.println("total       =      "+sum+" WON");
								System.out.println("........................................");
								System.out.print("residual :         "+inputMoney+" WON");
								System.out.println("\n========================================");
								return;
							}
						}
					}
					System.out.println("choose More?  y/n");
					chooseMore = scan3.nextLine();
					if (chooseMore.equals("n")) {
						System.out.println("your change =" + inputMoney);
						System.out.println("Good bye !!");
						for(double a : arrayint)
						{
							sum += a;
						}
						System.out.println("product    ||     price");
						System.out.println("========================================");
						for(int i =0; i <arrayproduct.size();i++ ) {
							
							System.out.println("-"+arrayproduct.get(i)+"      ||      "+arrayint.get(i)+" WON"+"\n");
							System.out.println("----------------------------------------");
						}
						System.out.println("total       =      "+sum+" WON");
						System.out.println("........................................");
						System.out.print("residual :         "+inputMoney+" WON");
						System.out.println("\n========================================");
						break;
					}
				}
			} else {
				System.out.println("Want to more insert Money?  y/n");
				insertMoreMoney = scan4.nextLine();
				if (insertMoreMoney.equals("y")) {
					System.out.println("insert Money");
					inputMoney += scan5.nextInt();
				} else if (insertMoreMoney.equals("n")) {
					System.out.println("your change = " + inputMoney);
					System.out.println("Good bye !!");
					for(double a : arrayint)
					{
						sum += a;
					}
					System.out.println("product    ||     price");
					System.out.println("========================================");
					for(int i =0; i <arrayproduct.size();i++ ) {
						
						System.out.println("-"+arrayproduct.get(i)+"      ||      "+arrayint.get(i)+" WON"+"\n");
						System.out.println("----------------------------------------");
					}
					System.out.println("total       =      "+sum+" WON");
					System.out.println("........................................");
					System.out.print("residual :         "+inputMoney+" WON");
					System.out.println("\n========================================");
					break;
				}
			}
		}
	}
}
