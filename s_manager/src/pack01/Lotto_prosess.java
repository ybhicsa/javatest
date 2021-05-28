package pack01;

public class Lotto_prosess {

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
		
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
	}//lotto_me
	
	void lotto_com(int[] ball) {

		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
	}//lotto_com

}
