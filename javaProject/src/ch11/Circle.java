package ch11;

public class Circle extends Shape {//자식

	@Override
	public void draw() {
		System.out.println("원 그리기 중심 x 좌표값 : "+x);
		System.out.println("원 그리기 중심 y 좌표값 : "+y);
	}

}
