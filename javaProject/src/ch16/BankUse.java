package ch16;

public class BankUse {

	public static void main(String[] args) {
		MyBank mb = new MyBank();
		
		BankPlayer hong = new BankPlayer(1, mb);
		BankPlayer saim = new BankPlayer(2, mb);
		BankPlayer lee = new BankPlayer(3, mb);
		
		hong.start();
		lee.start();
		saim.start();
	}

}
