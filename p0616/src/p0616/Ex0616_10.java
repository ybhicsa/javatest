package p0616;

public class Ex0616_10 {

	public static void main(String[] args) {
		String[] fileName = { "file1.txt", "file2.hwp", "file3.psd", "file4.jpg", "file5.ppt", "file6.doc",
				"file7.java" };

		String[] fileName2 = { "ff1.hwp", "ff2.java", "ff3.doc" };

		String str = "file1.txt";

		for (int i = 0; i < fileName.length; i++) {

			if (fileName[i].endsWith("txt")) {
				System.out.println(fileName[i] + " : 텍스트 문서파일입니다.");
			} else {
				System.out.println(fileName[i] + " : 텍스트 문서파일이 아닙니다.");
			}

		}
		
		
		for (int i = 0; i < fileName2.length; i++) {

			if (fileName2[i].endsWith("txt")) {
				System.out.println(fileName2[i] + " : 텍스트 문서파일입니다.");
			} else {
				System.out.println(fileName2[i] + " : 텍스트 문서파일이 아닙니다.");
			}

		}

//		if(str.endsWith("txt")) {
//			System.out.println("텍스트 문서파일입니다.");
//		} else {
//			System.out.println("텍스트 문서파일이 아닙니다.");
//		}

	}

}
