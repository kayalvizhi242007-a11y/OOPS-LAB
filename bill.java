import java.util.Scanner;
{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Units;
		double Amount,  Total_Amount;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Units that you Consumed  : ");
		Units = sc.nextInt();
		
		if (Units <=100)
	  	{
	  		Amount = Units * 2.50;
	  	} 
	  	else if (Units <= 500)
	  	{
	  		Amount = Units * 6.50;
	  	} 
	  	else if (Units <= 200)
	  	{
	  		Amount = Units * 5.00;
	  	} 
	  	else
	  	{
		   
		}
		System.out.println("\n Electricity Bill  =  " + Total_Amount);
	}
}
