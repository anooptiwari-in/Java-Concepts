public class IncrementCounterVariable
{
	static int counter=0;
	synchronized void incrementCounter()
	{
		System.out.println(++counter);
	}
}