package p0621;

import java.util.HashSet;
import java.util.Iterator;


public class Ex0621_03 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
	
		set.add(new Student(1, "홍길동", 100, 100, 100));
		set.add(new Student(2, "이순신", 90, 90, 91));
		set.add(new Student(3, "유관순", 99, 99, 98));
		set.add(new Student(4, "강감찬", 80, 80, 89));
		set.add(new Student(5, "김유신", 100, 100, 99));
		set.add(new Student(6, "이율곡", 70, 70, 79));
		set.add(new Student(7, "김구", 99, 99, 100));
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			
			Student s = (Student)itr.next();
			System.out.printf("학생성적 : %s, ",s.getStuNo());
			System.out.printf("%s, ",s.getName());
			System.out.printf("%s, ",s.getKor());
			System.out.printf("%s, ",s.getEng());
			System.out.printf("%s, ",s.getMath());
			System.out.printf("%s ",s.getTotal());
			System.out.println();
			
		}
		
		
		
	}

}
