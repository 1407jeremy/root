
public class Wheels implements Parts
{
	int x=550;
	@Override
	public int setprice(int x) {
		return x;
	}

	@Override
	public int getprice(int x) {
		
		return x;
	}

	public int getsubcost(Parts w1,Parts w2)
	{
		int wheelcost=w1.getprice(500)+w2.getprice(500);
		return wheelcost;
	}
	

	public static void main(String[] args) 
	{
		Wheels w=new Wheels();
		Parts tyre=new Wheels();
		Parts alloy=new Wheels();
		w.getsubcost(alloy,tyre);
		
		

	}

}
