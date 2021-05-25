
public class Triangle extends Shape {

	Point[] p;
	double[] point_len = new double[3];

	Triangle() {
	}

	Triangle(Point[] p) {
		this.p = p;
	}

	Triangle(Point p1, Point p2, Point p3) {
		p = new Point[] { p1, p2, p3 };
	}
	

	void point_point() {		
		for(int i = 0;i<p.length;i++){
			System.out.printf("x%d,y%d 좌표의 값은 : %d, %d  %n", (i + 1), (i + 1), p[i].x, p[i].y);
		}
	}
	
	void point_length() {
		for (int i = 0; i < p.length; i++) {

			if (i < 2) {
				point_len[i] = Math
						.sqrt(Math.pow((p[i].x - p[i + 1].x), 2) + Math.pow(p[i].y - p[i + 1].y, 2));
			} else {
				point_len[i] = Math
						.sqrt(Math.pow((p[i].x - p[i - 2].x), 2) + Math.pow(p[i].y - p[i - 2].y, 2));
			}

			System.out.printf("%d 번째 길이 : %.2f  %n", (i + 1), point_len[i]);
		}
	}
	
	void triangle_area() { 
		//반둘레 구하는 공식 s = 0.5*(length1 + length2 + length3)
		double s = 0.5*(point_len[0]+point_len[1]+point_len[2]);
		
		double triangle_area = Math.sqrt(s*(s-point_len[0])*(s-point_len[1])*(s-point_len[2]));
		
		System.out.println("삼각셩의 넓이 : "+ triangle_area);
	}

}
