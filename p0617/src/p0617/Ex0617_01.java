package p0617;

import java.io.File;
import java.util.Scanner;

public class Ex0617_01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("찾으려고 하는 폴더주소 : ");
		String dir = s.nextLine();
		System.out.println("파일의 확장자 명을 입력 : ");
		String ext = s.next();
		System.out.println("1. 포함되어 있는 형태 검색");
		System.out.println("2. 검색하는 문자열로 끝나는 형태 검색");
		int choice = s.nextInt();
		
		
		File win = new File("c:/"+dir);
		File[] wins = win.listFiles();

		int count2 = 0;

		for (int i = 0; i < wins.length; i++) {
			// System.out.println(fl[i].getName());
			if(choice == 1) {
				if (wins[i].getName().contains(ext)) {
					System.out.println(wins[i].getName());
					count2++;
				}	
			} else {				
				if (wins[i].getName().endsWith(ext)) {
					System.out.println(wins[i].getName());
					count2++;
				}
			}
		}
		System.out.println("폴더의 "+ext+" 개수 : " + count2);

		
//		// work1 폴더에 txt파일에 몇게 있는지 확인해 보세요.
//		File fi = new File("c:/work1");
//		File[] fl = fi.listFiles();
//		int count1 = 0;
//
//		for (int i = 0; i < fl.length; i++) {
//			// System.out.println(fl[i].getName());
//			if (fl[i].getName().endsWith("txt")) {
//				System.out.println(fl[i].getName());
//				count1++;
//			}
//		}
//		System.out.println("폴더의 txt 개수 : " + count1);
	}

}
