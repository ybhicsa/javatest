
public class Ex0525_05 {

	public static void main(String[] args) {
		
		//학생이름 : 홍길동,100,100,99 
		
		Student s = new Student("홍길동",100,100,99);
		
		System.out.println("번호 : " +s.getStu_num());
		System.out.println("이름 : " +s.getName());
		System.out.println("국어점수 : "+ s.getKor());
		s.setKor(90);
		System.out.println("수정 국어점수 : "+ s.getKor());
		//s.setStu_num(5);
		System.out.println("바꾼 번호 : " +s.getStu_num());
		
		
		
		
		
		
		
		
		
	}

}
