package ch08;

public class Person {
//멤버변수
	
	private String name;//"홍길동","추신수","박찬호","구자욱"
	private int height;//170,190,185,175
	private int weight;//60,100,70,72
	
	
	//this()다른생성자 호출
	public Person() {//기본생성자=매개변수가 없는 생성자(default constructor)
		this("홍길동",170,60);//(String,int,int)
		
	}
	public Person(String name) {//매개변수의(()안에 들어 있는 매개변수 타입확인한다.) 개수가 맞는지 확인을 한다.
		this(name,190,100);
	}
	public Person(String name, int height) {
		this(name,height,70);
	}
	public Person(String name, int height, int weight) {//name="홍길동",height=170,weight=60
		this.name = name;//지역변수를 멤버변수롤 초기화
		this.height = height;
		this.weight = weight;//지역변수로 들어온 것을 멤버변수로 보냄
	}
	//출력용도
	public void showInfo() {
		System.out.println("===신상 정보===");
		System.out.println("이름 : "+name);
		System.out.println("이름 : "+height);
		System.out.println("이름 : "+weight);
	}
}
