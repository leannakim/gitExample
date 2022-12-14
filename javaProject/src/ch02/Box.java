package ch02;

public class Box {

	public static void main(String[] args) {

		double weight, height, area, perimeter;
		
		weight =  10.0;
		height = 5.0;
		area = weight * height;
		perimeter = 20*area;
		
		System.out.println("================================");
		System.out.println("사각형의 넓이는 : " + area);
		System.out.println("사각형의 둘레는 : "+ perimeter);
		System.out.println("================================");
		
		
	}

}
