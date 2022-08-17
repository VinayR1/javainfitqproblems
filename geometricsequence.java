/* Implement a program to display the geometric sequence as given below for a given value n, where n is the number of elements in the sequence.

1, 2, 4, 8, 16, 32, 64, ......, 1024 */ 


import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		// Implement your code here 
		int number =1;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the no of elements in the sequence ");
		int Inputnumber = myObj.nextInt();
		while(Inputnumber !=0)
		{
		    System.out.print(number);
		    System.out.print(",");
		    number*=2;
		    Inputnumber--;
		}
		
		
	}
}
