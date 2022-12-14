package ch07;

public class BookStoreUse {

	public static void main(String[] args) {
		BookStore bs = new BookStore();//객체생성과 동시에 
		//데이터 입력
		bs.setBookName("java");
		bs.setAuthor("김선생");
		bs.setPrees("영진");
		bs.setYear(2022);
		bs.setAmount(10);
		bs.setPrice(30000);
		//출력용도
		bs.print();
	}

}
