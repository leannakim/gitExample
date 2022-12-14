package ch13;

public class StrBuilderEx {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder();
		str1.append("I am a ");
		str1.append(" Java Programmer");
		System.out.println(str1.toString());
		
		StringBuilder str2 = new StringBuilder();
		str2.append("I am a ");
		str2.append(" Java Programmer");
		
		str2.replace(7, 12, "jsp");
		System.out.println(str2.toString());
		
		String str3 = str2.substring(7);
		System.out.println(str3);
	}

}
