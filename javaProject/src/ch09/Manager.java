package ch09;

public class Manager extends Employee {
	String address;//주소
	String email;//이메일
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void input(String address, String email) {
		this.address = address;
		this.email = email;
	}
	public void print() {
		System.out.println("----------------------------------------------------");
		System.out.println("사원번호 : " + getNum());
		System.out.println("이름 : " + getName());
		System.out.println("주소 : " + getAddress());
		System.out.println("이메일 : " + getEmail());
		System.out.println("연봉 : " + getSalary());
		System.out.println("주민번호 : " + getRrn());
		System.out.println("----------------------------------------------------");
	}
	
}
