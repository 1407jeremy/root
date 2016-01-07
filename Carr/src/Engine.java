
public class Engine implements Parts {
int p=1500;
@Override
	public int setprice(int p) {
		return p;
	}
@Override
	public int getprice(int p) {
		return p;
	}


public int getsubcost(Parts w1,Parts w2)
{
	int enginecost=w1.getprice(500)+w2.getprice(500);
	return enginecost;
}


	public static void main(String[] args) 
	{
		Parts piston=new Engine();
		Parts crankshaft=new Engine();
		Engine e=new Engine();

		e.getsubcost(piston,crankshaft);
	}

}
