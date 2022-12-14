package ch10;

public class StaticExam {
	//개별적인 값을 사용할때 =>nonstatic ex)학생들
	//공통적인 값을 사용할 때 => static ex) 학점4.0이상 3.5이상등
	public static void main(String[] args) {
	int a =40, b=30, result;
	//대표적으로 자주사용하고 고정된 값등, Math클래스 등은 static, final을 거의 사용한다.
	result = Math.max(a, b);//둘 중 큰값 
	System.out.println(result);
	
	result = Math.min(a, b);//둘 중 작은 값
	System.out.println(result);
	System.out.println(Math.sqrt(100));
	
	double r=15.3;
	System.out.println("원의 둘레 : "+2*Math.PI*r);
	System.out.println("원의 둘레 : "+Math.PI*r*r);
}
}
