
public class Demo1 
{
	

	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		int bal=5000;
		int wbal=1050;
		int count1k=7;
		int count500=50;
		int count100=100;
		int count50=200;
		int num1k,num500,num100,num50;
		
		if(bal<wbal)
			System.out.println("your balance " +bal + " is insufficient to carry out this transaction of: " +wbal);
		
		
		else
		{
			while(wbal>0)
			{
				if(wbal>1000 && count1k>0)
				{
					if(wbal/1000>count1k)	{	num1k=count1k;	}
					else	{	num1k=count1k-(wbal/1000);	}
					
					wbal=wbal-(num1k*1000);
					count1k=count1k-num1k;
					System.out.println("you got : "+num1k +" 1000 rupee note(s)");
					
				}
				
				else if(wbal>500 && count500>0)
				{
					if(wbal/500>count1k)	{	num500=count500;	}
					else	{	num500=count500-(wbal/500);	}
					
					wbal=wbal-(num500*500);
					count500=count500-num500;
					System.out.println("you got : "+num500 +" 500 rupee note(s)");
					
				}
					
				
			}
			
			
		}

	}

}
