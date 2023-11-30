package Admin;

public class Employee {
	private final int emp_id;
	private String emp_name;
	private double salary;
	private double exp;
	public Employee(int emp_id, String emp_name, double salary, double exp) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
		this.exp = exp;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}	

}
