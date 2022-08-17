/* Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.

A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate. Apart from the cost per plate of food, customers are also charged for home delivery based on the distance in kms from the restaurant to the delivery point. The delivery charges are as mentioned below:



Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point, implement a program to calculate the final bill amount to be paid by a customer.

The below information must be used to check the validity of the data provided by the customer: 

Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.

Distance in kms must be greater than 0.

Quantity ordered should be minimum 1.

If any of the input is invalid, the bill amount should be displayed as -1.

 

* /


import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
	    int noOfKms = -1;
	    int noOfQuantity = -1;
		Scanner newObj = new Scanner(System.in);
        int totalBill = -1;
        int DeliveryCharge = 0;
	    int costperPlate = 0;
		System.out.println("Enter the Type of Food for veg enter V and for non veg enter N ");
		String typeOfFood = newObj.nextLine();
		if(( typeOfFood.equals("N") || typeOfFood.equals("V")) )
		{
		    	System.out.println("Enter the distance");
	         	noOfKms = newObj.nextInt();
	         	if(noOfKms >=0)
	         	{
	         	    System.out.println("Enter the quantity needed minimum should be one");
		            noOfQuantity = newObj.nextInt();
	         	}
	         	else
	         	{
	         	     System.out.println(" OOps You have entered wrong food type it should be either V or N ");
	         	}
		}
		else
		{
		    System.out.println(" OOps You have entered wrong food type it should be either V or N ");
		}
		
		if(( typeOfFood.equals("N") || typeOfFood.equals("V")) && (noOfKms >=0) && (noOfQuantity >=1) )
		{
		    if(noOfKms >3 && noOfKms <=6)
		    {
		         DeliveryCharge = (noOfKms-3)*1;
		    }
		   
		    if(noOfKms> 6)
		    {
		        DeliveryCharge = 3 + (noOfKms-6)*2;
		    }
		    if(typeOfFood.equals("N"))
		    {
		        costperPlate = 15;
		    }
		    if(typeOfFood.equals("V"))
		    {
		        costperPlate = 12;
		    }
		    
		    totalBill = (costperPlate*noOfQuantity) + DeliveryCharge;
		    System.out.println(totalBill);
		}
		else
		{
		  System.out.println("Invalid selection and total bill is"+ totalBill);   
		}
		
		
	}
}
