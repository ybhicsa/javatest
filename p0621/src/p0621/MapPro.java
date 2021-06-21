package p0621;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MapPro {
	
	public HashMap selectStudent(ArrayList<Student> list) {
		
		Scanner scan = new Scanner(System.in);
		HashMap map = new HashMap();
		
		StringBuffer sbf = new StringBuffer("");
		String cod = "fail";
		String Result = "이름이 검색되지 않았습니다.";
		String name = "";
		
		System.out.println("찾을 이름을 검색해 주세요 : ");
		String nack = scan.next();
		
		
		
		for(Student s: list) {
			sbf.append(s.getName()+" ");
			if(s.getName().contains(nack)) {
				
				Result = "이름이 검색되었습니다.";
				cod = "success";
				name = name + " " + s.getName();
			}

		}
		
		String strName = sbf.toString();
		map.put("strName", strName);
		map.put("Result", Result);
		map.put("cod", cod);
		map.put("name", name);
		
		return map; 
		
	}
	
}
