package ch09;

class Animal{
	public Animal(String s) {//매개변수가 있는 생성자를 호출할 때 기본생성자 없으면 에러가 난다. 꼭 기본생성자도 생성해야함.
		System.out.println("동물 : " + s);
	}
}
class Mammal extends Animal{
	public Mammal() {//기본생성자
		super("원숭이");//부모 클래스 생성자 호출
		System.out.println("포유류 : 원숭이");
	}
	public Mammal (String s) {//매개변수가 있는 생성자
		super(s);//부모클래스 생성자 호출
		System.out.println("포유류 : "+s);
	}
}
public class AnimalDemo {

	public static void main(String[] args) {
		Mammal ape = new Mammal();//객체생성 겸 기본생성자 호출
		Mammal lion = new Mammal("사자");//객체생성 겸 매개변수가 있는 생성자 호출
	}

}


