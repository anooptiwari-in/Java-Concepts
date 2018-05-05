public class StudentDetails
{
	String[] name=new String[10];
	
	public void setName(int rollNo, String n)
	{
		try
		{
			name[rollNo]=n;
			System.out.println("Name has been set successfully!");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("We can't accomodate these many students. Sorry Try again later.");
		}
	}
	
	public void display(int rollNo)
	{
		try
		{
			System.out.println("Name: "+name[rollNo]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Entered Roll Number is not registered with us!");
		}
	}
}
