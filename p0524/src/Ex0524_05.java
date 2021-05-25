import java.util.Scanner;

public class Ex0524_05 {

	public static void main(String[] args) {
		// Triangle 객체 Point 3개를 입력받아 각각의 길이를 구하시오.

		Scanner scan = new Scanner(System.in);

		Point[] p = new Point[3];

		for (int i = 0; i < p.length; i++) {
			p[i] = new Point();
			System.out.println((i + 1) + "번째 x길이를 입력 : ");
			p[i].x = scan.nextInt();
			System.out.println((i + 1) + "번째 y길이를 입력 : ");
			p[i].y = scan.nextInt();

		}

		Point[] pp = { new Point(p[0].x, p[0].y), new Point(p[1].x, p[1].y), new Point(p[2].x, p[2].y) };

		Triangle t = new Triangle(p);

		for (int i = 0; i < pp.length; i++) {
			System.out.printf("x%d,y%d 좌표의 값은 : %d, %d  %n", (i + 1), (i + 1), t.p[i].x, t.p[i].y);
		}

		
		
//		for (int i = 0; i < pp.length; i++) {
//
//			pp[i] =Math
//					.sqrt(Math.pow((t.p[i].x - t.p[i + 1].x), 2) + Math.pow(t.p[i].y - t.p[i + 1].y, 2));
//		
//			System.out.printf("x%d,y%d 에서 x%d,y%d의 길이는 %f", (i + 1), (i + 1), (i + 2), (i + 2));
//
//		}
//		
//		 pp[0] = Math.pow((t.p[0].x-t.p[0].y), 2;

	}

}
