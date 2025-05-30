package atm;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class AtmOperations implements AtmInterface
{

	Atm atm=new Atm();
	Map<Double, String> miniStmt=new HashMap<>();
	public void viewBalance() 
	{
		System.out.println("Available balanace:"+atm.getBalance());
		
	}

	
	public void withdrawAmount(double withdrawAmount) 
	{
		if(withdrawAmount%500==0)
		{
			if(withdrawAmount<=atm.getBalance())
			{
				System.out.println("Collect the cash:"+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				miniStmt.put(withdrawAmount, "Withdraw successfully");
				viewBalance();
			}
			else
			{
				System.out.println("Insuffucient balanace");
			}
		
		}
		else
		{
			System.out.println("Enter the amount interms of 500 multiples ");
		}
		
	}

	
	public void depositAmount(double depositAmount) 
	{
		
		System.out.println("Deposited amount is:"+depositAmount);
		atm.setBalance(atm.getBalance()+depositAmount);
		miniStmt.put(depositAmount, "Deposited Successfully");
		viewBalance();
	}

	
	public void viewMiniStatement() 
	{
		Set<Double> set=miniStmt.keySet();
		for(Double d:set)
			
		{
			System.out.println(d+"="+miniStmt.get(d));
			
		}
		
	}

}
