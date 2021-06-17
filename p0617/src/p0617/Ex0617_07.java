package p0617;

import java.util.Scanner;

public class Ex0617_07 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while (true) {

			System.out.println("세 수를 입력하세요 : ");
			int input1 = s.nextInt();
			int input2 = s.nextInt();
			int input3 = s.nextInt();

			int result1 = Math.max(Math.max(input1, input2), input3);
			int result2 = Math.max(Math.min(input1, input2), input3);
			int result3 = Math.min(Math.min(input1, input2), input3);

			
			
			
			
			
			
			
			
			
			
//			int result1 = Math.max(input1, input2);
//			result1 = Math.max(result1, input3);
//			int result2 = Math.min(input1, input2);
//			result2 = Math.min(result2, input3);
//
//			System.out.println("큰 수 : "+ result1);
//			System.out.println("작은 수 : "+ result2);
//			System.out.println("중간 수 : "+ result2);

		}

	}
}
