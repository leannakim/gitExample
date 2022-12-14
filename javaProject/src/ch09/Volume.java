package ch09;

public class Volume extends Area {
	//멤버변수
	private int height;//10,20
	public Volume() {
		
	}
	public  Volume (int height, int length, int width ) {//height =10, length=20, width=30
		super(width, height);//부모클래스의 생성자 호출 30,20
		this.height = height;
	}
	public int getVolume() {
		return getArea()*height;
	}
}
