package ch11;

public class Rectangle extends Shape{//자식

	@Override
	public void draw() {//추상메소드 구현(코드가 없어도)
		System.out.println("사각형 그리기 시작 x 좌표값 : "+x);
		System.out.println("사각형 그리기 시작 y 좌표값 : "+y);
	}
	
}
