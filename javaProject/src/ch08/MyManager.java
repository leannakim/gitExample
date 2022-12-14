package ch08;


//싱클톤기법
public class MyManager {
	private int score;//10,100
	
	private MyManager(int score) {
		this.score = score;
	}
	
	private static MyManager mgr;
	
	public static MyManager getInstance() {
		if(mgr==null) {//처음 MyManager가 객체화 될때
			mgr=new MyManager(10);
		}
		return mgr;//한번이상 객체 생성되었다면(즉, 주소값이 있으면) 그값을 리턴 처음만 주소값을 생성하고 계속사용하겠다.
	}
	public int getScore() {
		return score;
		
	}
	public void setScore(int score) {
		this.score = score;
		
	}
}
