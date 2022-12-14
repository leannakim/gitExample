package ch07;

public class PersonUse {

	public static void main(String[] args) {
		//특정클래스를 사용하기 위해서는 메모리에 올려야함.
		Person p1 = new Person();//객체생성,인스턴스화=>메모리에 올리는 작업
		p1.setName("김철수");//선언할때는 set으로
		p1.setAge(20);
		p1.setHeight(180.0);
		//p1.print(); 이렇게 출력도 가능함.
		System.out.println("이름 : "+ p1.getName());//출력할떄는 get으로
		System.out.println("나이 : " +p1.getAge());
		System.out.println("키 : "+ p1.getHeight());
		
	}

}
