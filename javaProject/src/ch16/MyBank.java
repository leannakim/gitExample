package ch16;

public class MyBank {
	//홍길동
		public synchronized void BankPlayerA() {
			for(int i=1; i<=5; i++) {
				System.out.println("홍길동님의 통장잔고는 "+ i *10 + " 만원 입니다.");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		}
		//사임당
		public synchronized void BankPlayerB() {
			for(int i=1; i<=5; i++) {
				System.out.println("사임당님의 통장잔고는 "+ i *10 + " 만원 입니다.");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		}
		//이몽룡
		public synchronized void BankPlayerC() {
			for(int i=1; i<=5; i++) {
				System.out.println("이몽룡님의 통장잔고는 "+ i *10 + " 만원 입니다.");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		}

}
