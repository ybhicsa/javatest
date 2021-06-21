package p0621;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex0621_06 {

	public static void main(String[] args) {
		// 검색할 데이터 이름 입력받아 -> 그 데이터를 MapPro클레스의 메소드 매게변수로 넘겨밭아
		// 데이터를 검색한 다음 
		// main으로 전체이름 데이터를 넘겨 출력
		// 검색결과 -> 전체이름데이터, "이름이 검색되었습니다.","아름이 검색되지 않았습니다."
		// 검색코드 -> "success","fail"

		ArrayList<Student> stu = new ArrayList<Student>();
		MapPro mp = new MapPro();
		stu.add(new Student(1, "홍길동", 100, 100, 100));
		stu.add(new Student(2, "이순신", 90, 90, 91));
		stu.add(new Student(3, "유관순", 99, 99, 98));
		stu.add(new Student(4, "강감찬", 80, 80, 89));
		stu.add(new Student(5, "김유신", 100, 100, 99));
		stu.add(new Student(6, "이율곡", 70, 70, 79));
		stu.add(new Student(7, "김구", 99, 99, 100));
		
		
		HashMap map = mp.selectStudent(stu);
		
		System.out.println("list의 모든이름 : "+map.get("strName"));
		System.out.println("검색결과 : "+map.get("Result"));
		System.out.println("검색결과 이름 : "+map.get("cod"));
		System.out.println("이름 : "+map.get("name"));
		
	}
	

}
