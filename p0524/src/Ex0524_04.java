import java.util.Scanner;

public class Ex0524_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		System.out.println("1번째 x좌표를 입력하세요 : ");
//		int x1 = scan.nextInt();
//		System.out.println("1번째 y좌표를 입력하세요 : ");
//		int y1 = scan.nextInt();
//		System.out.println("2번째 x좌표를 입력하세요 : ");
//		int x2 = scan.nextInt();
//		System.out.println("2번째 y좌표를 입력하세요 : ");
//		int y2 = scan.nextInt();
//		System.out.println("3번째 x좌표를 입력하세요 : ");
//		int x3 = scan.nextInt();
//		System.out.println("3번째 y좌표를 입력하세요 : ");
//		int y3 = scan.nextInt();

		Point[] in_point = new Point[3];

//		int[] x = new int[3];
//		int[] y = new int[3];

		for (int i = 0; i < in_point.length; i++) {
			in_point[i] = new Point();// Point 객체생성
			System.out.println((i + 1) + "번째 x,y좌표를 입력하세요 : ");
			//0,0 10,0 10,10
			String input = scan.next();//0,0
			String[] str = input.split(",");
			in_point[i].x = Integer.parseInt(str[0]);//String -> int 변환  0+""->String
			in_point[i].y = Integer.parseInt(str[1]);
			 
			
			
			//in_point[i].x = scan.nextInt();
//			System.out.println((i + 1) + "번째 y좌표를 입력하세요 : ");
//			in_point[i].y = scan.nextInt();
		}

//		Point[] p = { new Point(in_point[0].x, in_point[0].y), new Point(in_point[1].x, in_point[1].y),
//				new Point(in_point[2].x, in_point[2].y) };

		Point[] p = {in_point[0],in_point[1],in_point[2]};
		Triangle t1 = new Triangle(p);

		//좌표줄력
		t1.point_point();
		
		//길이출력
		t1.point_length();
		//넓이 출력
		t1.triangle_area();
		
//		double[] point_length = new double[3];
//		for (int i = 0; i < p.length; i++) {
//
//			System.out.printf("x%d,y%d 좌표 : %d, %d %n", (i + 1), (i + 1), t1.p[i].x, t1.p[i].y);
//
////			System.out.println("x1,y1 좌표 : " + t1.p[0].x + "," + t1.p[0].y);
////			System.out.println("x2,y2 좌표 : " + t1.p[1].x + "," + t1.p[1].y);
////			System.out.println("x3,y3 좌표 : " + t1.p[2].x + "," + t1.p[2].y);
////			double xx1 = Math.pow((t1.p[0].x - t1.p[1].x), 2);
////			double yy1 = Math.pow(t1.p[0].y - t1.p[1].y, 2);
//
//		}

//		for (int i = 0; i < p.length; i++) {
//
//			if (i < 2) {
//				point_length[i] = Math
//						.sqrt(Math.pow((t1.p[i].x - t1.p[i + 1].x), 2) + Math.pow(t1.p[i].y - t1.p[i + 1].y, 2));
//			} else {
//				point_length[i] = Math
//						.sqrt(Math.pow((t1.p[i].x - t1.p[i - 2].x), 2) + Math.pow(t1.p[i].y - t1.p[i - 2].y, 2));
//			}
//
//			System.out.printf("%d 번째 길이 : %f  %n", (i + 1), point_length[i]);
//		}

//		double xx2 = Math.pow((t1.p[1].x - t1.p[2].x), 2);
//		double yy2 = Math.pow(t1.p[1].y - t1.p[2].y, 2);
//
//		double xx3 = Math.pow((t1.p[2].x - t1.p[0].x), 2);
//		double yy3 = Math.pow(t1.p[2].y - t1.p[0].y, 2);

		// x1,y1 에서 x2,y2까지의 길이
//		double length1 = Math.sqrt(xx1 + yy1);
//		System.out.println(length1);
//
//		double length2 = Math.sqrt(xx2 + yy2);
//		System.out.println(length2);
//
//		double length3 = Math.sqrt(xx3 + yy3);
//		System.out.println(length3);

	}
}
