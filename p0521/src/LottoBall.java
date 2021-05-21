
public class LottoBall {

	static int[] ball = new int[45];
	// 초기화 블록
	static {
	}

	static {
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
	}

	static {
		int temp = 0;

		for (int i = 0; i < ball.length * 5; i++) {
			int ran = (int) (Math.random() * 45);

			temp = ball[0];
			ball[0] = ball[ran];
			ball[ran] = temp;

		}

	}

}
