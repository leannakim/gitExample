package ch04;

public class ContinueEx2 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i % 2 == 0) continue;// i를2로 나눈나머지가 0과 같다(홀수값 구하는 식)
			System.out.println("홀수 값 : "+ i);
		}
	}

}
