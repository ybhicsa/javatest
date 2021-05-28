package pac001;

import java.util.Scanner;

public class Process01 {

	static Scanner scan = new Scanner(System.in);

//	void add() {
//		// 두 수을 입력받아
//		System.out.println("첫번째 수 입력 : ");
//		int num1 = scan.nextInt();
//
//		System.out.println("첫번째 수 입력 : ");
//		int num2 = scan.nextInt();
//
//		// 더하는 계산
//		int result1 = num1 + num2;
//		System.out.println("결과값 : " + result1);
//
//	}

	private int i;
	private int j;

	Process01() {

	}

	Process01(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	Process01 num_input() {

		System.out.println("첫번째 수 입력 : ");
		int num3 = scan.nextInt();

		System.out.println("두번째 수 입력 : ");
		int num4 = scan.nextInt();

		return new Process01(num3, num4);
	}

	int add(int num1, int num2) {
		// 두 수을 입력받아
		System.out.println("첫번째 수 입력 : ");

		// 더하는 계산
		int result1 = num1 + num2;
		return result1;
		// System.out.println("결과값 : " + result1);

	}

	void alladd() {
		
		Process01 ck = num_input();
		int resule2 = 0;
		int temp = 0;

		if (ck.i > ck.j) {

			temp = ck.i;
			ck.i = ck.j;
			ck.j = temp;
		}

		// for문을 이용하여
		for (int i = ck.i; i <= ck.j; i++) {
			resule2 += i;
		}

		// 더하기 계산을 한다.
		System.out.println("결과값 : " + resule2);
	}

	static int[] add1() {

		System.out.println("첫번째 수 입력 : ");
		int se1 = scan.nextInt();

		System.out.println("첫번째 수 입력 : ");
		int se2 = scan.nextInt();

		return new int[] { se1, se2 };
	}

	int[] alladd2() {

		int sres[] = add1();

		//System.out.println(sres[0] + sres[1]);
		return sres;
	}
	
	

}
