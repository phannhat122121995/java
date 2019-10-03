package nhat_days_2;

public class days2_1 {
	public static void main(String[] args)
	{
		int num =10;
		
		
		for (int r = 1; r <= num; r++) {
			for (int sp = num - r; sp > 0; sp--) {
				System.out.print(" ");
			}
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			for (int k = 2; k <= r; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
