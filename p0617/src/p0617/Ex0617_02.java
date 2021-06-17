package p0617;

import java.util.Scanner;

public class Ex0617_02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String[] fileName = { "windows", "Windows", "WinDows", "Win", "Window","wins","winDows" };

		// windows -> 대소문자 구분없이 검색해서 검색된 단어 출력, 개수 출력
		// win 포함되아있는 단어를 검색 출력, 개수 출력 
		// s로 끝나는 단어를 검색출력, 개수 출력 
		
		System.out.println("검색할 단어를 입력하세요 : ");
		String win = s.nextLine().toLowerCase();
		int count = 0;
		System.out.println("단어검색");
		System.out.println("1. 대소문자 구분없이 검색한부분 출력");
		System.out.println("2. 검색한부분 출력");
		System.out.println("3. s로 끝나는부분 출력");
		int key = s.nextInt();
		for(String str : fileName) {
			
			switch (key) {
			case 1:
				if (str.equalsIgnoreCase(win)) {
					count++;
					System.out.println("단어  : " + str);
				}
				
				break;
			case 2:
				if (str.contains(win)) {
					count++;
					System.out.println("단어  : " + str);
				}
				
				break;
			case 3:
				if (str.endsWith(win)) {
					count++;
					System.out.println("단어  : " + str);
				}
				
				break;

			default:
				break;
			}
			
		}
		System.out.println("동일한 단어 : " + count);
		
		
		
		
		
//		System.out.println("검색할 단어를 입력하세요. >>");
//		String input = s.nextLine().toUpperCase();
//		int count = 0;
//		System.out.println("[ 단어 검색 ]");
//		for (String str : fileName) {
//			if (str.equalsIgnoreCase(input)) {
//				count++;
//				System.out.println("단어 : "+ str);
//			}
//		}
//
//		System.out.println("동일한 단어 : " + count);

	}

}
