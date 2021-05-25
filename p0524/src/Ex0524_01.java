
public class Ex0524_01 {

	public static void main(String[] args) {
		// 3개의 점을 만듭니다. (0,0,0), (10,5,3), (5,40,20)
		Point3D[] p = new Point3D[3];
		p[0] = new Point3D();
		p[0].x = 0;
		p[0].y = 0;
		p[0].z = 0;
		p[1] = new Point3D();
		p[1].x = 10;
		p[1].y = 5;
		p[1].z = 3;
		p[2] = new Point3D();
		p[2].x = 5;
		p[2].y = 40;
		p[2].z = 20;

		Point3D p3d_1 = new Point3D();
		//Point p11 = new Point();
		p3d_1.p2d.x = 0;
		p3d_1.p2d.y = 0;
		p3d_1.z = 5;

		Point3D p3d_2 = new Point3D();
		//Point p22 = new Point();
		p3d_2.p2d.x = 10;
		p3d_2.p2d.y = 5;
		p3d_2.z = 40;

		Point3D p3d_3 = new Point3D();
		//Point p33 = new Point();
		p3d_3.p2d.x = 5;
		p3d_3.p2d.y = 40;
		p3d_3.z = 20;

//		Point3D p1 = new Point3D();
//		p1.x = 0;
//		p1.y = 0;
//		p1.z = 0;
//		Point3D p2 = new Point3D();
//		p1.x = 10;
//		p1.y = 5;
//		p1.z = 3;
//		Point3D p3 = new Point3D();
//		p1.x = 5;
//		p1.y = 40;
//		p1.z = 20;

		// 3개의 점을 만듭니다. (0,0), (10,5), (5,40)

//		Point p11 = new Point();
//		p11.x = 0;
//		p11.y = 0;
//		Point p22 = new Point();
//		p22.x = 10;
//		p22.y = 5;
//		Point p33 = new Point();
//		p33.x = 5;
//		p33.y = 40;

	}
}
