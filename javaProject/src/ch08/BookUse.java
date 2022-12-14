package ch08;

public class BookUse {

	public static void main(String[] args) {
		//Book b = new Book();
		Book b = new Book("java", "홍길동", "영진", 2019, 35000, 5);
		//b.input(null, null, null, 0, 0, 0);
		b.print();
		
		Book b2 = new Book();
		b2.print();
	}

}
