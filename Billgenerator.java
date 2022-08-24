/******************************************************************************
Implement the class Bill based on the class diagram and description given below.



Method Description

Bill(String paymentMode)

Initialize the paymentMode instance variable with the value passed to the parameter. 

Generate the billId using counter. The value of billId should start from 'B9001' and the numerical part should be incremented by 1 for the subsequent values. Initialize the counter in static block.

Implement the appropriate getter and setter methods.

 

Test the functionalities using the provided Tester class. Create two or more Bill objects and validate that the billId is being generated properly.

Sample Input and Output

For constructor

Input

For first Bill object



For second Bill object



Output



Download the Java project from here to solve this exercise in Eclipse.
*******************************************************************************/

class Bill
{
    private static int counter;
    private String billId;
    private String paymentMode;
    static
    {
        counter = 9000;
    }
    Bill(String paymentMode)
    {
        this.paymentMode = paymentMode;
        this.billId = "B" + ++Bill.counter;
    }
    public void setBillId(String billId)
    {
        this.billId = billId;
    }
    public String getBillId()
    {
        return this.billId;
    }
    public void setPaymentMode(String paymentMode)
    {
        this.paymentMode = paymentMode;
    }
    public String getPaymentMode()
    {
        return this.paymentMode;
    }
}

public class Main
{
	public static void main(String[] args) 
	{

        Bill bill1 = new Bill("DebitCard");
        Bill bill2 = new Bill("PayPal");
        
        //Create more objects and add them to the bills array for testing your code
              
        Bill[] bills = { bill1, bill2 };
              
        for (Bill bill : bills)
        {
            System.out.println("Bill Details");
            System.out.println("Bill Id: " + bill.getBillId());
            System.out.println("Payment method: " + bill.getPaymentMode());
            System.out.println();
       }
	}
}

