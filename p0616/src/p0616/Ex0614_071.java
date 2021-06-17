package p0616;

import java.util.Scanner;

public class Ex0614_071 {

	public static void main(String[] args) {

		int[] num = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10) ;
		}

		System.out.printf("%s조%s%s%s%s%s \n", num[0], num[1], num[2], num[3], num[4], num[5]);

		int[] inputNum = new int[6];

		Scanner s = new Scanner(System.in);
		System.out.println("복권 번호를 입력하세요.(ex.1조12345) :");
		String input = s.next();

		for (int i = 0; i < inputNum.length; i++) {
			if (i == 0) {
				inputNum[i] = input.charAt(i) - '0';
			} else if (i == 1) {
				continue;
			} else {
				inputNum[i - 1] = input.charAt(i) - '0';
			}
		}//for
		
		for (int i = 0; i == inputNum.length; i++) {
			System.out.println(inputNum[i]);
		}
		
		
		int count = 0;
		for (int i = 0; i <= inputNum.length; i++) {
			if(inputNum[i] == num[i]) {
				count++;
			}
		}
		System.out.printf("%s조%s%s%s%s%s \n", inputNum[0], inputNum[1], inputNum[2], inputNum[3], inputNum[4], inputNum[5]);
		System.out.println("당첨 개수 : "+count);
		
		
		String ox = "";
		
		

	}

}
