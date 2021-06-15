package p0615;

import java.io.File;
import java.io.IOException;

public class Ex0615_05 {

	public static void main(String[] args) throws Exception {
		// work1/file 폴더생성
		// work1/f1.txt, f2.txt, f3.txt, f4.txt 파일을 만들어보세요.

		File dir1 = new File("c:/work1/file");
		File f1 = new File("c:/work1/f1.txt");
		File f2 = new File("c:/work1/f2.txt");
		File f3 = new File("c:/work1/f3.txt");
		File f4 = new File("c:/work1/f4.txt");

		if (dir1.exists() == false) {
			dir1.mkdirs();
			System.out.println("폴더를 생성합니다.");
		}

		if (f1.exists() == false) {
			f1.createNewFile();
			System.out.println("파일을 생성합니다.");
		}
		if (f2.exists() == false) {
			f2.createNewFile();
			System.out.println("파일을 생성합니다.");
		}
		if (f3.exists() == false) {
			f3.createNewFile();
			System.out.println("파일을 생성합니다.");
		}
		if (f4.exists() == false) {
			f4.createNewFile();
			System.out.println("파일을 생성합니다.");
		}

		
		File fileName = new File("c:/work1");
		File[] f_contents = fileName.listFiles();	//디렉토리에 포함된 파일과 서브디렉토리를 확인 String배열로 리턴 해준다.
		for(int i=0; i<f_contents.length;i++) {
			System.out.println("파일명 : "+ f_contents[i].getName());
		}
	
	}
}
