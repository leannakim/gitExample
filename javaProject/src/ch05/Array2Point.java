package ch05;

public class Array2Point {

	public static void main(String[] args) {
		//5행5열(국어,영어,수학,총점,평균 순서의 데이터 초기화)
		//int[][] point= {{80,90,100,0,0},{70,60,95,0,0},{88,77,66,0,0}
		//,{99,89,95,0,0},{100,60,50,0,0}};//학생5명의성적을 배열처리하겠다.(국어,영어,수학,총점,평균)
		//정석으로 표현해보기
		//~
		int[][]num=new int[5][5];
		num[0][0] = 80;
		num[0][1] = 90;
		num[0][2] = 100;
		num[0][3] = 0;
		num[0][4] = 0;
		num[1][0] = 70;
		num[1][1] = 60;
		num[1][2] = 95;
		num[1][3] = 0;
		num[1][4] = 0;
		num[2][0] = 88;
		num[2][1] = 77;
		num[2][2] = 66;
		num[2][3] = 0;
		num[2][4] = 0;
		num[3][0] = 99;
		num[3][1] = 89;
		num[3][2] = 95;
		num[3][3] = 0;
		num[3][4] = 0;
		num[4][0] = 100;
		num[4][1] = 60;
		num[4][2] = 50;
		num[4][3] = 0;
		num[4][4] = 0;
		
		for(int i=0; i<5; i++) {//행
			for(int j = 0; j<5; j++) {//열
			}
		}
		
		for(int i=0; i<3; i++) {
			num[i][3]=num[i][0]+num[i][1]+num[i][2];//총점
			num[i][4]=num[i][3]/3;//평균점수처리
		}
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<3; i++) {
			System.out.println(num[i][0]+"\t"+num[i][1]+"\t"+num[i][2]+"\t"+
					num[i][3]+"\t"+num[i][4]);
		}
	}

}

