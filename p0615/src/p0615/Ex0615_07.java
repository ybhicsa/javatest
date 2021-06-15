package p0615;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex0615_07 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		File f = new File("c:/work1/f1.txt");
		try {
			FileWriter fw = new FileWriter(f, true);
			System.out.println("원하는 글자를 입력하세요 : ");
			String str = s.nextLine();
			// fw.write("txt파일에 글자를 넣습니다. 행복한 하루 되세요 !");
			fw.write(str + "\n");
			// fw.newLine();
			fw.flush();
			fw.close();
			System.out.println("글자가 저장되었습니다.");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
