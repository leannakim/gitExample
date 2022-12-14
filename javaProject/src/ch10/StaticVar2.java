package ch10;

public class StaticVar2 {
	static int total;//Static메모리영역에 바로 로딩1누적2누적3 마지막3이 출력
	String model;//heap영역에 생성됨(nonstatic, new),(100번지=쏘나타),(200번지=모닝)(300번지=아반떼)
	public StaticVar2(String model) {
		this.model = model;
		total++;
	}
}
