package ch04;

public class For_Sum {
//for와 if문 함께 써보기
	public static void main(String[] args) {
		int total = 0;
		for(int i=1; i<=100; i++) {
			total = total+i;
			if(i%10 == 0) {//10의 배수
				System.out.println(" 1부터" + i + "까지의 자연수 합계는" + total);
			}//if
		}//for
	}
}
