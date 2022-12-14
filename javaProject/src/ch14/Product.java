package ch14;

import java.util.Scanner;

public class Product {
	private String num;
	private String name;
	private String company;
	private int price;
	private int amount;
	private int money;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("제품번호 : ");
		num = sc.next();
		System.out.print("제품명 : ");
		name = sc.next();
		System.out.print("제조사 : ");
		company = sc.next();
		System.out.print("단가 : ");
		price = sc.nextInt();
		System.out.print("수량 : ");
		amount = sc.nextInt();
		
		money = price*amount;
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getcompany() {
		return company;
	}
	public void company(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getmoney() {
		return money=price*amount;
	}
	public void setmoney(int money) {
		this.money = money;
	}
	
	public Product() {
	}
	
	public Product(String num, String name, String company, int price, int amount) {
		this.num = num;
		this.name = name;
		this.company = company;
		this.price = price;
		this.amount = amount;
	}
	
	
}
