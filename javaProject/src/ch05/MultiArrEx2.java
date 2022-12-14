package ch05;

import java.util.Scanner;

public class MultiArrEx2 {

	public static void main(String[] args) {
		String[][] words = {{"chair","의자"}//words[0][0],words[0][1]
		,{"computer","컴퓨터"}//words[1][0],words[1][1]
		,{"intrger","정수"}};//words[2][0],words[2][1]
		int n=0;
		Scanner sc = new Scanner(System.in);
		outer:
		while(true) {
			
		for(int i=0; i<words.length; i++) {
			System.out.printf("문제%d) %s의 뜻은>? ", i+1, words[i][0]);
			String tmp=sc.next();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.(종료:-1 )%n%n");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.(종료:-1)%n%n" , words[i][1]);
			}
		}
		if(n != -1) {
			n = sc.nextInt();
			System.out.println("프로그램을 종료합니다.");
		}
		}
		
	}

}
