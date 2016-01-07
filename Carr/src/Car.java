
public class Car 
{
	int cost;
	public int getcarprice(Wheels w,Engine e)
	{
	//return w.getprice(550) +e.getprice(1500);
	cost=w.getprice(550) +e.getprice(1500);
	return cost;
	}
	
	public int getcarprice2()
	{
		Parts tyre=new Wheels();
		Parts alloy=new Wheels();
		Parts piston=new Engine();
		Parts crank=new Engine();
		
		int wheelcost=tyre.getprice(500)+alloy.getprice(500);
		int enginecost=piston.getprice(1000)+alloy.getprice(1000);

	cost=enginecost+wheelcost;
	return cost;
	}
	

	public static void main(String[] args) 
	{
		Wheels w=new Wheels();
		Engine e= new Engine();
		int cost;
		Car mycar= new Car();
		int fin=mycar.getcarprice(w,e);
		System.out.println("The final cost of your car is(only one part per subsystem) $: " +fin);
		
		int fin2=mycar.getcarprice2();
		System.out.println("The final cost of your car is(mutiple parts per subsytem) : " +fin2);

	}

}
