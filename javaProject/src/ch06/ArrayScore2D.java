package ch06;

public class ArrayScore2D {

	public static void main(String[] args) {
		int[][] score = {{100,100,100},{89,76,92},{88,69,72},{45,60,59},{96,92,89}};
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<score.length; i++) {
			int sum=0;//총점
			float avg=0.0f;//평균
			String grade=" ";//등급
			
			
			System.out.printf("%d\t",i+1);//번호출력
			for(int j=0; j<score[i].length; j++) {//국,영,수 배열값출력
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


