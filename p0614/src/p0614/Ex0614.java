package p0614;

public class Ex0614 {

	public static void main(String[] args) {

		Stu s1 = new Stu();
		String s = "한국직업전문학교";

//		System.out.println("stu객체 출력 : " + s1);
//		System.out.println("stu객체 출력 : " + s1.stu_num);

		System.out.printf("stu객체 출력 : %d , %d, %d , %d",s1.stu_num,s1.pw,s1.name,s1.nickName);

//		int[] arr1 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
//		String[] str1 = { "자동차", "배", "마차", "비행기" };
//
//		for (int i : arr1) {
//			System.out.printf("arr1 : %d \n", i);
//		}

//		for (int i = 0; i < arr1.length; i++) {
//			System.out.printf("arr[%d] : %d \n", i, arr1[i]);
//		}
//
//		for (String s : str1) {
//			System.out.println("str1 배열 : " + s);
//		}
	}
}
