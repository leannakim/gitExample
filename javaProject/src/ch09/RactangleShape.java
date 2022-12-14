package ch09;

public class RactangleShape extends Shape{
	private int width;
	private int heigth;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	public RactangleShape(int width, int heigth) {
		super("Ractangle");
		this.width = width;
		this.heigth = heigth;
	}
	@Override
	public double calcolsteArea() {
		return width * (double)heigth;
	}
	@Override
	public void draw() {
		System.out.println("가로가" + width + ", 세로가"+ heigth + "인 사각형");
		super.draw();
	}
}
