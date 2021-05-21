import java.util.Scanner;

public class HomeWork_0521_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		Student2 s = new Student2();
		
		//메뉴 와일로 들어가서 싀위치로 선택
		//성적 입력
		//타이틀
		//성적 출력
		//성적 수정
		//성적 검색 
		//순위 정의
		//프로그램 종료 
		
		while (true) {
			
			mainMaun();
			int key = scan.nextInt();
			
			
		}
		
		
		
		
		
		
	}//main
	
	//메뉴
	static void mainMaun() {
		System.out.println("[ 학생 성적 입력 프로그램 ]");
		System.out.println("-------------------------------------------------------");
		System.out.println("1.학생 정보 입력");
		System.out.println("2.학생 정보 출력");
		System.out.println("3.학생 정보 수정");
		System.out.println("4.학생 정보 검색");
		System.out.println("5.학생 등수 등록");
		System.out.println("0.프로그램 종료");
		System.out.println("-------------------------------------------------------");
		System.out.println("원하는 메뉴를 선택 : ");
		
	}
	
	
	//타이틀
	static void tiltel() {
		System.out.println();
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("-------------------------------------------------------");
	}
	
}
