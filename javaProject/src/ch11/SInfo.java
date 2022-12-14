package ch11;

public class SInfo implements Student {
	String name ="홍길동";
	String email = " hong@gmail.com";
	String address = "서울 강남구";
	int kor, eng, mat, tot;
	double avg;
	
	void input(String name,String email,String address) {
		this.name = name;
		this.email = email;
		this.address = address;
	}
	void input(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		tot = kor+eng+mat;
		avg = tot/3.0;
	}
	@Override
	public void address() {
		System.out.println("================================================");
		System.out.println("이름\t주소\t이메일");
		System.out.println(name + "\t" + address + "\t" + email);
		System.out.println("-------------------------------------------------");
	}

	@Override
	public void point() {
		this.input("홍길동", 90, 85, 70);
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name +"\t"+kor+"\t"+eng +"\t"+mat+"\t"+tot+"\t"
				+String.format("%.1f",avg));
		System.out.println("=================================================");
	}

}
