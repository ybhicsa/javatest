package p0617;

import java.awt.List;
import java.util.ArrayList;

public class Ex0617_08 {

	public static void main(String[] args) {

		List list1 = null;
		ArrayList list = new ArrayList();

		list.add(1);
		list.add(new Student(1, "홍길동"));
		list.add(2);
		list.add("aaa");
		list.add(12.5);
		list.add(new Student(2, "이순신"));

		Student s1 = (Student) list.get(1);
		Student s2 = (Student) list.get(5);

		for (int i = 0; i < list.size(); i++) {
			System.out.println("list" + (i + 1) + "번째 : " + list.get(i));
		}
		System.out.println("----------------------------------------------------------");
		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list" + (i + 1) + "번째 : " + list.get(i));
		}

//			System.out.println("list 1번째 : " + list.get(0));
//		System.out.println("list 2번째 : " + ((Student) list.get(1)).name);
//		System.out.println("list 3번째 : " + list.get(2));
//		System.out.println("list 4번째 : " + list.get(3));
//		System.out.println("list 5번째 : " + list.get(4));
//		System.out.println("list 6번째 : " + s2.name);
//		System.out.println("----------------------------------------------------------");
//		list.remove(0);

//		// System.out.println("list 1번째 : "+ list.get(0));
//		System.out.println("list 1번째 : " + ((Student) list.get(0)).name);
//		System.out.println("list 2번째 : " + list.get(1));
//		System.out.println("list 3번째 : " + list.get(2));
//		System.out.println("list 4번째 : " + list.get(3));
//		System.out.println("list 5번째 : " + s2.name);

		Ex0617_08.add(1, 2);

	}

	public static void add(Object a, int b) {

	}

}
