package ch07;
//getter,setter를 안 만들고 접근하는 기법
public class Student2 {
	
	private String name;
	private String major;//전공
	private int year;//학년
	private int num;//학번
	private double point;//평균점수
	private int money;//등록금
	private int save;//장학금	
	
	public void input(String name, String major, int year, int num, double point, int money) {
		this.name = name;//우변과 좌변의 이름이 같을 떄는 this.을 해줘야한다.
		this.major = major;
		this.year = year;
		this.num = num;
		this.point = point;
		this.money = money;
		//장학금 계산(3.5이상 100만원, 4.0이상 250만원, 4.3이상 전액장학금)
		if(point >= 4.3) {
			save = money;
		}else if (point >= 4.0) {
			save = 250;
		}else if(point >= 3.5) {
			save = 100;
		}
	
	}//개발자용 메소드
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", major=" + major + ", year=" + year + ", num=" + num + ", point=" + point
				+ ", money=" + money + ", save=" + save + "]";
	}
	public void print() {
		System.out.println("이름\t전공\t학년\t학번\t평점평균\t등록금\t장학금");
		System.out.println(name+"\t"+major+"\t"+year+"\t"+num+"\t"+point+"\t"+money+"\t"+save);
	}
}

