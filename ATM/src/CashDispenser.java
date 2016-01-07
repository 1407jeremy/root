
public class CashDispenser 
{

	
		public static boolean CashDispenser(double userbal,double withdrawbal) 
		{
			int count1k=7;
			int count500=50;
			int count100=100;
			int num1k,num500,num100;
			int atmbal=(count1k*1000)+(count500*500)+(count100*100);
			
			/* ***************************************************************************************************
			 * 									validate transaction											 *
			 *************************************************************************************************** */
			if(userbal<withdrawbal)
				return false;
				
			else if(atmbal<withdrawbal)
				return false;

			/* ***************************************************************************************************
			 * 											dispense cash											 *
			 *************************************************************************************************** */
			else
			{
				
				
return true;
				
			}
			
			
			
			
			
			
			
			
		}
	
		
		public static void main(String[] args) 
		{
			CashDispenser(10000,2500);
		}

}
