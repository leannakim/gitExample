package ch09;

public class InheritanceEx {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		//Ball c2 = new Ball();//기본생성자를 만들지 않았기 떄문에 이렇게 성정하면 안된다.
		Ball c2 = new Ball("빨강색");//객체생성과 동시에 매개변수가 있는 생성자 호출
		System.out.println("원 : ");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("공 : ");
		c2.findRadius();//Circle멤버
		c2.findColor();//Ball멤버
		c2.findArea();//Circle멤버
		c2.findVolume();//Ball멤버
		
		Circle c3 = new Circle(4);//생성자는 상속의 대상이 아니라 고유한 객체로서 사용되어 진다.
		Ball c4 = new Ball();//객체 생성겸 기본생성자 호출
	}

}
