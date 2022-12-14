package ch04;

public class Matrix {
//중첩for문은 행렬 처리에 용이
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {//행
			for(int j=1; j<=5; j++) {//열
				System.out.printf("[%d,%d]",i,j);
			}
			System.out.println();
		}
		
		
	}

}
