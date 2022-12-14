package ch13;
//StringBuilder
public class Append {

	public static void main(String[] args) {
		//불변형(immutable)
		String a = "hello";
		System.out.println(System.identityHashCode(a));
		a = a+"java";
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		
		
		System.out.println("=====가변형 StringBuilder======");
		//가변형(mutable)
		StringBuilder b = new StringBuilder("hello");
		System.out.println(System.identityHashCode(b));
		b.append("java");
		System.out.println(b);
		System.out.println(System.identityHashCode(b));
	}

}
