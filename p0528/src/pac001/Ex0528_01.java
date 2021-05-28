package pac001;

import java.util.Scanner;

public class Ex0528_01 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Process01 p = new Process01();
		Process02 p2 = new Process02();
		while (true) {

			System.out.println("[ 프로그램 ]");
			System.out.println("1. 두 수의 합");
			System.out.println("2. 두 수 사이의 합");
			System.out.println("3. 두 수의 합(배열)");
			System.out.println("4. 두 수의 합");
			System.out.println("5. 두 수 크기비교");
			
			System.out.println(" 원하는 번호를 입력하세요 :");

			int choice = scan.nextInt();

			int num[] = p2.numInput();
			
			
			switch (choice) {
			case 1:
				
				int sum = p2.add(num[0], num[1]);
				System.out.println("더한 값은 : "+sum);
				break;
			case 2:
				p2.alladd(num[0], num[1]);
//				int resl = p2.alladd(num[0], num[1]);
//				System.out.println("두 사이의 합 "+ resl);
				break;
			case 3:
				p.alladd2();
				break;

			case 4:
				p.num_input();
				p.alladd();
				break;
			case 5:
				p2.bignum(num[0], num[1]);
//				int ck = p2.bignum(num[0], num[1]);
//				System.out.println("두 숫자중 더 큰수는 "+ck);
				break;
				
				
			default:
				break;
			}

		} // while

	}// main

}// class
