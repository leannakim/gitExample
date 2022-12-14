package ch10;

public class StaticVarUse {

	public static void main(String[] args) {
		//다른 클래스의 Static 변수로 접근할때는
		//(불러오려는해당)클래스이름.Static member
		System.out.println(StaticVar.a);
	}

}
