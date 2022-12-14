package ch07;

//한개의 파일에 2개이상의 class 파일을 작성시에는 public class의 클래스이름으로 저장, public처리,
	//나머지는 클래스는 default처리

class Phone{
	String model;
	int value;
	void print() {
		System.out.println(value + "만원짜리"+ model+"스마트폰");
	}
}



public class PhoneDemo {

	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.model = "갤럭시 22";
		myPhone.value = 100;
		myPhone.print();
		
		
		Phone yourPhone = new Phone();
		yourPhone.model = "iPhone";
		yourPhone.value = 150;
		yourPhone.print();
		
	}

}
