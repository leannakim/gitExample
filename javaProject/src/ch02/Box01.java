package ch02;

import java.util.Scanner;

public class Box01 {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double x, y;
		double area;
		double perimeter;
		
		x = 10.0;
		y = 5.0;
		area = (x*y);
		perimeter = 20*area;
		
		System.out.println("사각형의 넓이 : ");
		scan.hasNext();
		System.out.println("사각형의 둘레 : ");
		scan.hasNext();
		scan.close();
		
		
		
		
		
		
		
		
		
	}
}
