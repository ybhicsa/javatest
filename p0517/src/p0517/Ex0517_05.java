package p0517;


import java.util.Scanner;

public class Ex0517_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//번호, 시(0~23), 분(0~59), 초(0~59.999)를 입력 받아 출력
		//3개을 입력받아 출력
		//시간은 수정이 가능
		//1.시간추가
		//2.시간출력
		//3.시간수정
		
		
		 int[] num = new int[3];
		 int[] hour = new int[3];
		 int[] minute = new int[3];
		 double[] second = new double[3];
		 
		 while(true) {
			 System.out.println("[ 시간 프로그램 ]");
			 System.out.println("1.시간입력");
			 System.out.println("2.시간출력");
			 System.out.println("3.시간수정");
			 System.out.println("원하는 번호를 입력하세요 .>>>");
			 
			 int choice = scan.nextInt();
			 switch (choice) {
			case 1:
				for(int i=0;i<hour.length;i++) {
					num[i] = i+1;
					System.out.println("시를 입력하세요.>>>");
					hour[i] = scan.nextInt();
					System.out.println("분를 입력하세요.>>>");
					minute[i] = scan.nextInt();
					System.out.println("초를 입력하세요.>>>");
					second[i] = scan.nextDouble();
					
				}
				
				break;
			case 2:
				
				for(int i=0;i<hour.length;i++) {
					num[i] = i+1;
					System.out.print(num[i]+" : ");
					System.out.print(hour[i]+" : ");
					System.out.print(minute[i]+" : ");
					System.out.print(second[i]+" \n");
				}
				
				break;
			case 3:
				
				break;

			default:
				break;
			}
			 
		 }
		 
		 
		 
		 
		 
		 
		 
//		 int a = 0,b=0;
//		 double c=0;
//		 
//		 while(true) {
//			 
//			 System.out.println("시,분,초를 입력하세요 : ");
//			 
//			 a = scan.nextInt();
//			 b = scan.nextInt();
//			 c = scan.nextDouble();
//			 
//			 
//			 while(a>24) {
//				 a = a-24;
//			 }
//			 System.out.println("시간은 " + a+"시 입니다.");
//			 while(b>60) {
//				 b = b-24;
//			 }
//			 System.out.println("시간은 " + b+"분 입니다.");
//			 while(c>60) {
//				 c = c-60;
//			 }
//			 System.out.println("시간은 " + c+"초 입니다.");
//			 
//			 
//			 
//			 
//			 System.out.println("수정할 시간을 입력하세요 : ");
//			 
			 
		 
		 
	}

}
