package ch07;

public class BookStore {
	//멤버변수
	private String bookName;//책이름
	private String author;//저자
	private String press;//출판사
	private int year;//출판년도
	private int price;//책단가
	private int amount;//판매수량
	private int money;//판매금액(단가x판매수량)
	//getter,setter
	public BookStore() {//기본 생성자가 눈에 보이지 않게 만들어 진다.
		
	}
	public BookStore(int a) {
		
	}
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrees() {
		return press;
	}
	public void setPrees(String prees) {
		this.press = prees;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
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
	public int getMoney() {
		money = price*amount;
		return money;
	}
//	public void setMoney(int money) {
//		this.money = money;
//	}
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(bookName+"\t"+author+"\t"+press+"\t"+year+"\t"+price
				+"\t"+amount+"\t"+getMoney());
	}
	
	
	
	

}
