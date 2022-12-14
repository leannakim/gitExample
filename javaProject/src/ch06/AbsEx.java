package ch06;

public class AbsEx {
	public static int abs(int num) {//num=-15
		return num>0 ? num : -num;//3한연산식(조건식? true : false)
	}
	public static void main(String[] args) {
		int a=-15;
		System.out.println(a);
		System.out.println(abs(a));
		System.out.println(Math.abs(a));//Math클래스에서 해주는 abs를 활용할 수 있다. f3을 누르면 설명이 되어 있음.
	}

}
