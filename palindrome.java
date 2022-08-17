import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = myObj.nextInt();
		int temp = number;
		int sum =0;
		int remainder = 0;
		while(temp!=0)
		{
		    remainder = temp %10;
		    sum = (sum*10) + remainder;
		    temp = temp/10;
		}
		if(sum == number)
		{
		    System.out.println("It's a palindrome");
		}
		else
		{
		    System.out.println("Not a palindrome");
		}
	}
}
