package ch09;

public class Member {
	private String name;
	private String id;
	private int price;
	private String grade;
	
	
	public Member() {
		this("홍길동","hong",120000,"gold");
		
	}
	public Member(String name) {
		this(name,"lee",90000,"");
		
	}
	public Member(String name, String id) {
		this(name, id, 120000,"");
		
	}
	public Member(String name, String id, int price) {
		this(name, id, price,"");
		
	}


	public Member(String name, String id, int price, String grade) {
		this.name = name;
		this.id = id;
		this.price = price;
		this.grade = grade;
	
	}
	public int getPrice() {
		if(price >= 100000) {
			grade = "gold";
		}else {
			grade = "silver";
		}
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public void print() {
		System.out.println("-----------------------------------");
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println("-----------------------------------");
		System.out.println(name+"\t"+id+"\t"+getPrice()+"\t"+grade);
	}
	
}
