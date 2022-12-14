package ch09;

public class MemberUse {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.print();
		
		Member m2 = new Member("이순신");
		m2.print();
		
		Member m3 = new Member("사임당","saim");
		m3.print();
	
		Member m4 = new Member("율곡이이","lee2",85000);
		m4.print();
	}
	

}
