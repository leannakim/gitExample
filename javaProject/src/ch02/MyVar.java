package ch02;

public class MyVar {

	/*public static void main(String[] args) {
		int a = 30;
		int b = 50;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a + b);*/
	
	public static int sum(int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {
		int a = 30;
		int s;
		
		s = sum(a,50);
		System.out.println(a);
		System.out.println(s);
		
		
		
	}

}
