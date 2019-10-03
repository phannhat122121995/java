package nhat_days_2;

import java.util.Scanner;

public class nhat_day2_caculate 
{
	public static void main(String[] agrs)
	{
		double num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first :");
        num1 = scanner.nextDouble();
        System.out.print("Enter second:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        Double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;

          
            default:
                System.out.printf("You have entered error ");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+" = "+output);
	}

}
