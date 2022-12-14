package ch02;

public class MyNameUnicode {

	public static void main(String[] args) {

		String name = "김 수 경";
		char aValue = '\uAE40';
		char bValue = '\uC218';
		char cValue = '\uACBD';
		
		
		System.out.println("===========================");
		System.out.println(name);
		System.out.println("char형 (\'\\uAE40\') : " + aValue );
		System.out.println("char형 (\'\\uC218\') : " + bValue );
		System.out.println("char형 (\'\\uACBD\') : " + cValue );
		System.out.println("===========================");
		
	}

}
