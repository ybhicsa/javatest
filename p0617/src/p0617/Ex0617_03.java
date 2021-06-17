package p0617;

import java.util.Scanner;

public class Ex0617_03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String[] fileName = { "windows", "Windows", "WinDows", "Win", "Window", "wins", "winDows" };
		System.out.println("검색할 단어를 입력하세요. >>");
		String input = s.nextLine().trim();//공백 지우기 중간에 들어간 공백은 제거 안됨 
		input = input.replace(" " , ""); //중간에 들어있는 공백까지 지울수 있다.
		int count = 0;
		System.out.println("[ 단어 검색 ]");
		for (String str : fileName) {
			if (str.equals(input)) {
				count++;
				System.out.println("단어 : "+ str);
			}
		}

		System.out.println("동일한 단어 : " + count);
		
		
		
		
		
		
		
		
		
//		String[] fileName = { "windows", "Windows", "WinDows", "Win", "Window", "wins", "winDows" };
//
//		for (int i = 0; i < fileName.length; i++) {
//
//			fileName[i] = fileName[i].replace("w", "W");
//			System.out.println(fileName[i]);
//		}

		
		
		
		
		
		
		
		
		
		
		
		
//		String str = "abcdefghijklmnopqrstuvwxyz";
//		System.out.println(" 바뀌기 전 단어 : " + str);
//
//		String result = str.replace("fgh", "fff");
//
//		System.out.println(" 바뀐 단어 : " + result);

//		while(true) {
//			System.out.println("찾고자 하는 문자를 입력해 주세요 : ");
//			String input = s.next();
//			if(input.length()>4) {
//				System.out.println("3자리 이하를 입력하셔야 합니다.");
//				continue;
//			}
//			
//			
////			char input = s.next().charAt(0);
////			int index = str.indexOf(input);
////			System.out.println(input + "찾은 문자 : " + index);
//		}

	}

}
