package p0616;

import java.awt.Taskbar.State;
import java.util.Random;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterIsAcceptingJobs;
import javax.swing.plaf.basic.BasicPasswordFieldUI;

public class Ex0616_07 {

	public static void main(String[] args) {
		// 복권 1조 12345 -> 0-9
		// 마지막 자리 -> 1천원
		// 마지막 2자리 -> 1만원
		// 마지막 3자리 -> 10만원
		// 마지막 4자리 -> 100만원
		// 다 맞으면 -> 1000만원

		// 1번째 랜덤으로 숫자를 생성해서 1조12345 복권번호를 생성 해보세요.

		Scanner s = new Scanner(System.in);

		String Lottery = "";
		int jo = 0;
		int count = 0;
		String[] ok = new String[7];
//		System.out.println("복권 번호를 입력해주세요: ");

		String[] num = new String[7];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10) + "";
		}
		num[1] = "조";

		System.out.printf("%s%s %s%s%s%s%s \n", num[0], num[1], num[2], num[3], num[4], num[5], num[6]);

		System.out.println("복권 숫자를 입력해 주세요 : ");

		String[] mee = new String[7];
		String my = "";
		String[] arrmy;

		my = s.next();

		arrmy = my.split("");

		char[] ox = new char[7];

		for (int i = 0; i < 7; i++) {
			if (arrmy[i].equals(num[i])) {

				count++;
				ok[i] = arrmy[i];

			}
		}
		for (int i = 0; i < 7; i++) {
			if (arrmy[i].equals(num[i])) {
				ox[i] = 'O';
			} else {
				ox[i] = 'X';
			}
		}
		
		

		System.out.println("맞은 숫자 : " + count);
		System.out.printf("%s%s %s%s%s%s%s \n", ok[0], ok[1], ok[2], ok[3], ok[4], ok[5], ok[6]);
		System.out.printf("%s조 %s%s%s%s%s \n", ox[0], ox[2], ox[3], ox[4], ox[5], ox[6]);
		for (int i = 0; i < count; i++) {
			if (i == 1)
				continue;
			System.out.println("맞은 번호 : " + ok[i]);

		}

//		for (int i = 0; i < me.length; i++) {
//			if (me[i] == num[i]) {
//				count++;
//				ok[i] = me[i];
//			}
//		}
//
//		System.out.println("맞은 숫자 : " + count);
//		for (int i = 0; i < count; i++) {
//			System.out.println("맞은 번호 : " + ok[i]);
//
//		}

//		for (int i = 0; i < 6; i++) {
//			int ran = (int) (Math.random() * 10);
//			jo = ran;
//
//		}
//		for (int i = 0; i < 5; i++) {
//			int ran = (int) (Math.random() * 10);
//			Lottery = Lottery + ran;
//
//		}
//
//		System.out.println(jo + "조" + Lottery);

//		String toString() {
//			String lo = jo + "조" + Lottery;
//			return lo;
//		}

	}

}
