package p0614;

import java.util.ArrayList;

public class Ex0614_03 {

	public static void main(String[] args) {
		// 향상 for문 - 배열, ArrayList

		ArrayList<Stu> list = new ArrayList<Stu>();

		Stu s1 = new Stu();
		s1.stu_num = 1;
		s1.pw = "111";
		s1.name = "홍길동";
		s1.nickName = "길동스";
		Stu s2 = new Stu(2, "222", "이순신", "순신스");
		Stu s3 = new Stu(3, "333", "유관순", "관순스");
		Stu s4 = new Stu(4, "444", "강감찬", "감찬스");
		Stu s5 = new Stu(5, "555", "김구", "구스");
		

//		System.out.println("s1객체 : " + s1);
//		System.out.println("s1객체 번호 : " + s1.stu_num);
//		System.out.println("s1객체 비밀번호 : " + s1.pw);
//		System.out.println("s1객체 이름 : " + s1.name);
//		System.out.println("s1객체 닉네임 : " + s1.nickName);
//		System.out.println();
//		System.out.println("s2객체 : " + s2);
//		System.out.println("s2객체 번호 : " + s2.stu_num);
//		System.out.println("s2객체 비밀번호 : " + s2.pw);
//		System.out.println("s2객체 이름 : " + s2.name);
//		System.out.println("s2객체 닉네임 : " + s2.nickName);
//		
		
		
		list.add(s1);
		list.add(s2);

		for(Stu s: list) {
			System.out.println(s);
		}
		
		for(int i=0;i<list.size();i++) {
			Stu s = (Stu)list.get(i);//형변환 
			System.out.println(s.stu_num);
			System.out.println(s.pw);
			System.out.println(s.name);
			System.out.println(s.nickName);
			System.out.println();
			
		}
		
		
//		int[] arr1 = {1,2,3,4,5};
//		
//		for(int num:arr1) {
//			System.out.println("int배열 : "+ num);
//		}
//		
//		char[] ch = {'a','b','c'};
//		for(char a:ch) {
//			System.out.println("ch배열 : "+ a);
//		}

	}

}
