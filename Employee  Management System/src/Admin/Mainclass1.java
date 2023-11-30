package Admin;

import Repository.EmployeeDB;

public class Mainclass1 {
	public static void main(String[] args) {
		EmployeeDB edb=new EmployeeDB(3);
		Employee e1=EmployeeCreation.create("Ramesh", 23300.00,1.2);
		Employee e2=EmployeeCreation.create("Mahesh", 33300.00, 2.6);
		Employee e3=EmployeeCreation.create("suresh", 33300.00, 2.6);
		Employee e4=EmployeeCreation.create("jayesh", 33300.00, 2.6);

		
		edb.addEmployee(e1);
		edb.addEmployee(e2);
		edb.addEmployee(e3);
		edb.addEmployee(e4);

		edb.viewEmployeeRecords();
		
		Employee e =edb.getEmployee(1005);
		System.out.println(e.getEmp_name());
	}

}
