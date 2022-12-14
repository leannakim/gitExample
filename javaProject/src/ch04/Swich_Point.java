package ch04;

public class Swich_Point {

	public static void main(String[] args) {
		int kor = 85;
		int mat = 90;
		int eng = 70;
		int tot = kor + mat + eng;//총점
		double avg = tot/3.0;//평균
		String grade = "";//등급
		switch((int)(avg / 10)) {//double을 int로 변환(강제 형변환)
			case 10:
			case 9: grade = "수"; break;//한 줄로 정렬 가능
			case 8: grade = "우"; break;
			case 7: grade = "미"; break;
			case 6: grade = "양"; break;
			default : grade = "가";
		}
    //결과출력
		System.out.println("국어\t수학\t영어\t총점\t평균\t등급");
		System.out.printf("%d\t%d\t%d\t%d\t%3.1f\t%s",kor,mat,eng,tot,avg,grade);
	}
}