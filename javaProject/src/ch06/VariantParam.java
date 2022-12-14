package ch06;

public class VariantParam {
//오버로드를 ...으로 처리해서 한번에 해보기
	public static void main(String[] args) {
		print("Java");
		print("Java","program");
		print("Java","program","jsp");
		print("Java","program","jsp","big","dats");
		
	}
	static void print(String ...n) {//n이 가변형 매개변수(배열처리의 주소값)이 됨
		for(int i=0; i<n.length; i++) {//아래보다 간략하게 처리할 때
			System.out.println(n[i]);
			
		}
	}
	
	/* static void print(String a) {
		 System.out.println(a);
	}

	 static void print(String a, String b, String c, String d, String e) {
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(d);
		 System.out.println(e);
	}

	 static void print(String a, String b, String c) {
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
	}

	 static void print(String string, String string2) {
		 
	}
*/

}
