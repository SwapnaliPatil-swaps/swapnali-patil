class employee1
{
	 String name,city;
	 int age;

	employee1(String nm, int a, String ct)
	{
		name=nm;
		city=ct;
		age=a;
	}

	public void display()
	{
		System.out.println("the name is "+name);
		System.out.println("the age is "+age);
		System.out.println("the city is "+city);
	}
}

class employeeinfo
{
	public static void main(String[] argv)
	{
		employee1 obj=new employee1("saurabh",23,"chennai");
		employee1 obj1=new employee1("satendra",25,"mumbai");

		obj.display();
		obj1.display();
	}
}