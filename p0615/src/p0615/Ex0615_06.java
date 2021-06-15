package p0615;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex0615_06 {

	public static void main(String[] args) {

		File windows = new File("c:/Windows");
		File[] win = windows.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for (int i = 0; i < win.length; i++) {
			// 파일이름
			System.out.print(win[i].getName() + "\t");
			// 파일 날짜
			System.out.print(sdf.format(win[i].lastModified()) + "\t");
			// 파일 크기
			System.out.print(win[i].length() + "KB \t");
			// 파일 유형
			if (win[i].isDirectory()) {
				System.out.print("<폴더> \t");
			} else {
				System.out.print("<파일> \t");
			}
			System.out.println();
		}

	}

}
