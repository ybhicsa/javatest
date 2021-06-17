package p0616;

public class Ex0616_06 {

	public static void main(String[] args) {

		String str = "hello";
		str.charAt(2); //

		String str2 = "789450";
		char ch = str2.charAt(0);
		// ch int로 변경하는 방법
		int num = ch - '0'; // 7->55 55 - 48 = 7
		System.out.println(ch);
		System.out.println(num);

		int num2 = 8; // -> String 방법 8+""="8"

		System.out.println("str2.substring(0,3) : " + str2.substring(0, 3));
		
		String str3 = "자바수업이 끝나가고 있습니다.";
		System.out.println("str3.substring(0,5) : " + str3.substring(0,5));
		System.out.println("str3.substring(5) : " + str3.substring(11));
		

//		char a = ' ';
//		String str = "";
//		String str2 = null;
//
//		String s1 = ""; // ->s1,s2,s3는 같은 공간을 사용
//		String s2 = "";
//		String s3 = "";
//
//		String s4 = new String(""); // ->s4,s5,s6는 다른 공간을 사용
//		String s5 = new String("");
//		String s6 = new String("");

	}

}
