package ch16;

public class MusicBox {//공유객체
	//가요 음악
	//메소드이름 앞에 synchronized 붙이면 해당메소드는 객체 사용권(Monitoring Lock)을 얻는다.
	
	public synchronized void playMusicA() {
		for(int i=0; i<10; i++) {
			System.out.println("가요음악!!!");//1초 이하로 쉬면서 10번 반복
			try {
				Thread.sleep((int)(Math.random()*1000));//1초 단위로 10번 박복하게 함.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}//playMusicA()
	
	//팝송음악
	public void playMusicB() {
		for(int i=0; i<10; i++) {
			System.out.println("팝송 음악!!!");//1초 이하로 쉬면서 10번 반복
			try {
				Thread.sleep((int)(Math.random()*1000));//1초 단위로 10번 박복하게 함.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}//playMusicB()
	
	//클래식음악
	public void playMusicC() {
		for(int i=0; i<10; i++) {
			System.out.println("클래식음악!!!");//1초 이하로 쉬면서 10번 반복
			try {
				Thread.sleep((int)(Math.random()*1000));//1초 단위로 10번 박복하게 함.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}//playMusicC()

}
