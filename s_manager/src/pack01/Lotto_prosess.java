package pack01;

import java.util.Scanner;

public class Lotto_prosess {

	static Scanner scan = new Scanner(System.in);

	void lotto_insert(int[] ball) {

		for (int i = 0; i < ball.length; i++) {
			ball[i] = (i + 1);
		}
	}// lotto_insert

	void lotto_r(int[] ball) {
		int temp = 0;
		for (int i = 0; i < ball.length * 10; i++) {
			int r = (int) (Math.random() * 45);
			temp = ball[0];
			ball[0] = ball[r];
			ball[r] = temp;
		} // for 섞기부분

	}// lotto_r

	void lotto_me(int[] ball) {
		
		int[] me = new int[6];
		int[] ck = new int[6];
		
		for(int i=0;i<6;i++) {
			System.out.println("로또 번호를 입력해 주세요 : ");
			me[i] = scan.nextInt();
		}
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				
				if(me[i] == ball[j] ) {
					ck[i] = me[i]; 
				}
			}
		}
		
		System.out.println("맞은 로또 번호는 ?");
		for(int i=0;i<me.length;i++) {
			if(ck[i] != 0) {		
				System.out.print(ck[i] + " ");
			}
		}
		
		System.out.println();
	}// lotto_me

	void lotto_com(int[] ball) {

		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println();
	}// lotto_com

}
