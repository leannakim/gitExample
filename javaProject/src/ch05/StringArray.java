package ch05;

public class StringArray {

	public static void main(String[] args) {
		String[] str = {"java", "DB","JSP","HTML"};
		//정식문법으로 바꿔보세요~
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		//확장for문(향상된for문, for~each문)=>jdk1.5이상ㅂ터 사용가능
		//for(개별값 저장변수 : 집합변수){ }
		for(String ss : str) {
			System.out.println(ss);
			
		}
		
	}

}
