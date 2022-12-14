package ch02;

public class Light {

	public static void main(String[] args) {
		//long 타입은 8바이트(64바이트) 정수를 저장.
		
		long lightspeed;
		long distance;	
		
		//int lightspeed;
		//int  distance; 데이터 타입에 따라서 담기는 량이 다르다.(정확한 데이터의 량을 넣어주지 않으면 에러가 뜸)
		
		lightspeed = 300000;//L,l은 생략가능
		distance = lightspeed *365L * 24 * 60 * 60;
		//빛이 1년동안 가는 거리 = 빛의속도 * 365일 * 24시 * 60분 * 60초
		System.out.println("빛이 1년동안 가는 거리 : " + distance + "km");
		
	}

}
