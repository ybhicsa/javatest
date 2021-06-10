import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] b = new int[n];
		int max = 0, min = 0;

		for (int i = 0; i < n; i++) {
			b[i] = s.nextInt();

			if (i == 0) {
				max = b[0];
				min = b[0];
				continue;
			}
				

			if (b[i] <= min) {
				min = b[i];
			}
			if (max <= b[i]) {
				max = b[i];
			}

		}
		System.out.println(max + " " + min);
	}
}
