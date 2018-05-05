public class E10P3
{
	public static void main(String[] args)
	{
		IncrementCounterVariable incrementor=new IncrementCounterVariable();
		
		CreateThread t1=new CreateThread(incrementor);
		CreateThread t2=new CreateThread(incrementor);
		CreateThread t3=new CreateThread(incrementor);
		CreateThread t4=new CreateThread(incrementor);
		CreateThread t5=new CreateThread(incrementor);
		CreateThread t6=new CreateThread(incrementor);
		CreateThread t7=new CreateThread(incrementor);
		CreateThread t8=new CreateThread(incrementor);
		CreateThread t9=new CreateThread(incrementor);
		CreateThread t10=new CreateThread(incrementor);
		
		try
		{
			t1.t.join();
			t2.t.join();
			t3.t.join();
			t4.t.join();
			t5.t.join();
			t6.t.join();
			t7.t.join();
			t8.t.join();
			t9.t.join();
			t10.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}	
	}
}
