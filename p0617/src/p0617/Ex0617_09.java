package p0617;

import java.util.HashSet;
import java.util.Iterator;

public class Ex0617_09 {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(1);
		hs.add(new Tv(1,"OLED TV"));
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(1);
		hs.add(new Tv(2,"OLED TV2"));
		hs.add(3);
		hs.add(4);
		hs.add(2);
		hs.add(new Student(1,"길동"));
		
		Iterator itr1 = hs.iterator();
		
		while(itr1.hasNext()) {
			Object o = itr1.next();
			if(o instanceof Tv) {
				System.out.println("데이터 : "+((Tv) o).name);
			} else if(o instanceof Student) {
				System.out.println("데이터 : "+((Student) o).name);
			} else {				
				System.out.println("데이터 : "+ o);
			}
			//System.out.println(itr);
		}
		System.out.println("-----------------------------------------------");
		hs.remove(3);
		hs.remove(new Tv(2,"OLED TV2"));
		
		Iterator itr2 = hs.iterator();
		while(itr2.hasNext()) {
		Object obj = itr2.next();
			if(obj instanceof Student) {
				System.out.println("데이터 : "+((Student) obj).name);
			} else if(obj instanceof Tv) {
				System.out.println("데이터 : "+((Tv) obj).name);
			} else {
				System.out.println("데이터 : " + obj);
			}
		
		}
		
		
//		for(int i=0;i<hs.size();i++) {
//			System.out.println(itr.hasNext());
//		}
		
		
	}
}
