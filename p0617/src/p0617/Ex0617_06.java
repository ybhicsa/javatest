package p0617;

public class Ex0617_06 {

	public static void main(String[] args) {
		
		String str = new String("aaa");
		String str2 = "aaa"; //예외
		
				
		StringBuffer str3 = new StringBuffer("aaa");
		
		System.out.println("String str객체 출력 : "+ str);
		System.out.println("String str2객체 출력 : "+ str2);
		System.out.println("StringBuffer str객체 출력 : "+ str3);
		
		str = str +"bbb";
		System.out.println("String더하기 str객체 출력 : "+ str);
		
		//str3 = str3 + "ccc";
		str3.append("ccc");
		System.out.println("StringBuffer str객체 출력 : "+ str3);
		
		str3.insert(1, "b");
		System.out.println("StringBuffer str객체 출력 : "+ str3);

		str3.delete(2, 3);
		System.out.println("StringBuffer str객체 출력 : "+ str3);

		str3.deleteCharAt(4);
		System.out.println("StringBuffer str객체 출력 : "+ str3);
		
		System.out.println("저장공간의 크기 : "+ str3.capacity());
		
	}

}
