package p0621;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex0621_05 {

	public static void main(String[] args) {
		
		ArrayList<Student> stu = new ArrayList<Student>();
		MapProcess mp = new MapProcess();
		stu.add(new Student(1, "홍길동", 100, 100, 100));
		stu.add(new Student(2, "이순신", 90, 90, 91));
		stu.add(new Student(3, "유관순", 99, 99, 98));
		stu.add(new Student(4, "강감찬", 80, 80, 89));
		stu.add(new Student(5, "김유신", 100, 100, 99));
		stu.add(new Student(6, "이율곡", 70, 70, 79));
		stu.add(new Student(7, "김구", 99, 99, 100));
		
		
		HashMap map = mp.selectStudent(stu);
		
		System.out.println("list의 모든이름 : "+map.get("strName"));
		System.out.println("result번호 : "+map.get("result"));
		System.out.println("result결과 : "+map.get("resultTitle"));
		System.out.println("검색결과 이름 : "+map.get("name"));
	}
}
