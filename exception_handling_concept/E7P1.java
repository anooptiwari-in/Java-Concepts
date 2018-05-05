public class E7P1
{
	public static void main(String[] args)
	{
		StudentDetails stu=new StudentDetails();
		stu.setName(1, "Aashish");
		stu.setName(3, "Abhay");
		stu.setName(15, "BalKishan");
		stu.setName(9, "Anoop");
		stu.setName(2, "Akshay");
		stu.setName(4, "Anudeep");
		stu.setName(5, "Jim Carrey");
		stu.setName(6, "Abin");
		stu.setName(7, "Ram Kapoor");
		stu.setName(8, "Salman Khan");
		stu.setName(0, "Govinda");
		
		stu.display(1);
		stu.display(9);
		stu.display(15);
	}

}
