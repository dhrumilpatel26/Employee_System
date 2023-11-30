package Admin;

public class EmployeeCreation {
	private static int initid=1000;
	
	public static Employee create(String name,double salary,double exp)
	{
		return new Employee( initid++, name, salary, exp);
	}

}
