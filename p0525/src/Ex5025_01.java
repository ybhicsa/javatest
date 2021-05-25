import java.util.Scanner;

public class Ex5025_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Deck d = new Deck(); // 52장의 카드 생성후 카인드와 넘버 입력

		while (true) {
			
			d.meun_print();
			
			int key = scan.nextInt();

			if(key == 0){
				System.out.println("프로그램 종료");
				break;
			}
			
			switch (key) {
			case 1:
				System.out.println("카드 번호를 입력하세요 (0~51): ");
				int num = scan.nextInt();
				d.print_1card(num);
				break;
			case 2:
				d.print_5card();
				break;
			case 3:
				d.print_52card();
				break;
			case 4:
				d.shuffle();
				break;
			case 5:
				// 카드 7장을 내것과 컴퓨터 것을 출력 하는 메소드 작성
				d.my_card();
				d.com_card();
				
				break;


			default:
				break;
			}

		}

	}// main
}// class
