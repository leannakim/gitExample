package ch12;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//
public class InnerExam extends Frame {
	public InnerExam() {//기본생성자
		super("내부 클래스 테스트");//부모생성자호출겸 제목처리
		setSize(600, 800);//프레임의 기본 가로,세로 초기사이즈 설정
		setVisible(true);//프레임을 화면에 표시
	}
	public static void main(String[] args) {
		InnerExam e = new InnerExam();
		e.addWindowListener(new WindowListener() {//무명내부클래스//new win + ctrl + space를 누르면
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			//윈도우창이 닫힐 때 자동호출([x]버튼을 누를 때
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//프로그램 종료
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});//end 무명내무클래스
	}
}
