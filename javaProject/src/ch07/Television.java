package ch07;

public class Television {
//멤버 변수(전역변수, 필드변수)
		int channel;//채널Test3=> 채널7 | 채널9
		int volume;//볼륨Test3=> 채널9 | 채널12
		boolean onOff;//전원상태Test3=> 채널 true | 채널 false
		void print() {
			System.out.println("채널은"+ channel + "이고 볼륨은" + volume+"입니다.");
		}
		int getChannel() {//public이 생략되면 디폴트라 디폴트라 쓰면 안됨
			return channel;
		}
		void setChannel(int ch) {//설정하려는 값
			channel = ch;
		}
		
	}


