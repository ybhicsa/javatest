package pac001;

import java.util.Scanner;

public class Process02 {
	static Scanner scan = new Scanner(System.in); // 클래스 변수

	// numInput메소드
	int[] numInput() {
		int[] num = new int[2]; // num1,num2담는 배열

		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + "번째 수를 입력하세요.>>");
			num[i] = scan.nextInt();
		}
		return num;
	}

	// 더하기 메소드
	int add(int num1, int num2) { // 인스턴스 메소드
		int result = num1 + num2;
		return result;
	}

	void alladd(int num1, int num2) {

		int resule2 = 0;
		int temp = 0;

		if (num1 > num2) {

			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		// for문을 이용하여
		for (int i = num1; i <= num2; i++) {
			resule2 += i;
		}

		// 더하기 계산을 한다.
		 System.out.println("결과값 : " + resule2);
		//return resule2;
	}

	void bignum(int num1, int num2) {
		int ck = 0;
		if (num1 > num2) {
			System.out.println(num1 + "이 더 큰수 입니다.");
		} else if(num1 < num2){
			System.out.println(num2 + "이 더 큰수 입니다.");
		} else {
			System.out.println("두 수가 같습니다.");
		}

	}
	
//	int bignum(int num1, int num2) {
//		int ck = 0;
//		if (num1 > num2) {
//			ck = num1;
//		} else {
//			ck = num2;
//		}
//		return ck;
//	}
}
