package p0616;

import javax.swing.plaf.synth.SynthFormattedTextFieldUI;

public class Ex0616_05 {

	public static void main(String[] args) {

		Student s1 = new Student("김영빈", 50, 50, 50);
		Student s2 = new Student("안성민", 50, 50, 50);
			
		System.out.print("번호 : "+ s1.getStuNum()+"\t");
		System.out.print("이름 : "+ s1.getName()+"\t");
		System.out.print("국어 : "+ s1.getKor()+"\t");
		System.out.print("영어 : "+ s1.getEng()+"\t");
		System.out.print("수학 : "+ s1.getMath()+"\t");
		System.out.print("합계 : "+ s1.getTotal()+"\t");
		System.out.printf("평균 : %.2f", s1.getAvg());
		System.out.println();
		System.out.println(s1.toString());
		System.out.println("클레스 이름 : "+ s1.getClass().getName());
	}

}
