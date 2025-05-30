package atm;
import java.util.*;


public class userInterface 
{
	private static int status;
	public static void main(String[] args) 
	{
		AtmOperations op=new AtmOperations();
		Scanner sc=new Scanner(System.in);
		int atmNumber=123445;
		int atmPin=1234;
		System.out.println("WELCOME TO ATM MACHINE:");
		System.out.println("enter the Atm number:");
		int atmNum1=sc.nextInt();
		System.out.println("enter the ATM pin:");
		int atmPin1=sc.nextInt();
		if(atmNumber==atmNum1 && atmPin==atmPin1)
		{
			while(true)
			{
			System.out.println(" 1.viewBalance\n 2.Withdraw Amount\n 3.Deposit Amount\n 4.view Mini Statement\n 5.Exit");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			if(ch==1)
			{
				op.viewBalance();
			}
			else if(ch==2)
			{
				System.out.println("enter the amount to withdraw:");
				double withdrawAmount=sc.nextDouble();
				op.withdrawAmount(withdrawAmount);
			}
			else if(ch==3)
			{
				System.out.println("enter the amount to deposit:");
				double depositAmount=sc.nextDouble();
				op.depositAmount(depositAmount);
			}
			else if(ch==4)
			{
				op.viewMiniStatement();
			}
			else if(ch==5)
			{
				System.out.println("Collect your card\n Thank You");
				System.exit(status);
			}
			}
		}
		else
		{
			System.out.println("you have entered a incorrect ATM number or Atm Pin");
		}

	}

}
