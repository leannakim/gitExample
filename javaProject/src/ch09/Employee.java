package ch09;

public class Employee {
	private int num;//사원번호
	private String rrn;//주민번호
	public String name;//이름
	protected int salary;//연봉
	
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void input(int num, String rrn, String name, int salary) {
		this.num = num;
		this.rrn = rrn;
		this.name = name;
		this.salary = salary;
	}
	
	
	
	
	
	
}
