package ch05;

public class AnonymousArray {
//무명배열 : 배열의 이름을 지정하지 않고 단순히 초기값만으로 배열을 생성
	//무명배열은 즉시 배열을 만들어 함수의 인수(매개변수)로 전달할 때 쓰며 배열이 딱 한번만 
	//필요하고 다시는 참조할 일이 없을 때 사용할 수 있다. 
	public static void main(String[] args) {
		System.out.println("숫자들의 합 : "+sum(new int[] {1,2,3,4}));//new를 생성하면서 배열의 numbers에 보내게 됨.(numbers[0]=1,numbers[1]=2,...
	}
	public static int sum(int[] numbers) {//numbers[0]=1,numbers[1]=2,numbers[2]=3,numbers[3]=4
		int total=0;
		for(int i=0; i<numbers.length; i++) {
			total =total + numbers[2];//1+2+3+4
		}
		return total;
	}
}
