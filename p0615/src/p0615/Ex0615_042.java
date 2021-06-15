package p0615;

import java.io.File;
import java.io.IOException;

public class Ex0615_042 {

	public static void main(String[] args) {

		String filePath = "c:/work/file/";
		File dir1 = new File(filePath);
		File f1 = new File("c:/work/file/file1.txt");

//		dir1.mkdir();	//-> c:/work 라는 폴더가 꼭 있어야지 에러가 나지 않음(자동 파일생성 X)
		// dir1.mkdirs(); //-> c:/work 라는 폴더가 없으면 work를 생성 후, file 폴더를 만들어줌 (자동 파일생성 O)
		if (dir1.exists() == false) {
			dir1.mkdirs();
			System.out.println("폴더가 생성 되었습니다.");
		}

		if (f1.exists() == false) {
			try {
				f1.createNewFile(); // 이 줄만 작성시에 트라이 케치문 작성하라고 오류가 뜬다
				System.out.println("파일이 생성되었습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
