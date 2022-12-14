package ch04;

public class Matrix2 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++ ) {
				if(i==j) {
					System.out.printf("[%d,%d]",i,j);
				}else {
					System.out.printf("%5c",' ');//c는 단문자출력, 5칸씩 빈 문자열로 처리
					//s는문자열
				}
			}//안쪽for문
			System.out.println();//이 위치에 있어야 행렬처리가 된다
		}//바깥쪽 for문
		//이쪽에 있으면 옆으로 넘어간다. 출력처리가 달라짐
		
		
	}

}
