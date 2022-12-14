package ch02;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int weight;
		int height;
		double perimeter;
		
		
		System.out.println("==================================");
		System.out.println("직사각형의 가로 길이를 입력하세요 : ");
		weight = scan.nextInt();
		System.out.println("직사각형의 세로 길이를 입력하세요 : ");
		height = scan.nextInt();
		
		perimeter = weight * height;
		System.out.println("직사각형의 넓이는 " + perimeter + "입니다.");
		System.out.println("==================================");
		scan.close();
	}

}
