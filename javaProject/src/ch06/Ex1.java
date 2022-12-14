package ch06;

import java.util.Scanner;

public class Ex1 {///보너스 문제 해보려는데 잘 안되네요 ㅠㅜ

	public static void main(String[] args) {
			int[][] score = {{99,88,77},{100,100,100},{72,69,76}};
			int sum=0;//총점
			float avg=0.0f;//평균
			String grade=" ";//등급
			
			Scanner sc = new Scanner(System.in);
			System.out.println("학생 수를 입력하세요 : " + score.length);
			System.out.println("국, 영, 수 점수를 각각 입력하세요 : ");
			for(int i=0; i<score[i].length; i++) {
				//score[i] = sc.next();
				System.out.printf(i +"번 학생의 점수 : %n%n");
				
			}
			System.out.println("------------------------------------------------------");
			System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t등급");
			System.out.println("------------------------------------------------------");
			for(int i=0; i<score.length; i++) {
			System.out.printf("%d\t",i+1);//번호출력;
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%d\t", score[i][j]);			

				if(score[i][j] > 90) {
					grade = "A";
				}else if(score[i][j] > 80){
					grade = "B";
				}else if(score[i][j] > 70) {
					grade = "C";
				}else if(score[i][j] > 60) {
					grade = "D";
				}else {
					grade = "F";
				}
			}	
			avg = sum/(float)score[i].length;//평균계산
				//총점,평균,등급 출력
			System.out.printf("%d\t%.1f\t%s\n", sum, avg, grade);
			
			}
		}
		
	}


	


