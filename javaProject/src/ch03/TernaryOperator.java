package ch03;

public class TernaryOperator {

	public static void main(String[] args) {

		int x = 1;
		int y;
		y = (x == 1) ? 10 : 20; //true
		System.out.println(y);
		y = (x > 1) ? x++ : x+20; //false라서 x+20대입됨
		System.out.println(y);
		
		
		
		
		
		
	}

}
