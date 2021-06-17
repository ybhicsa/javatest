package p0617;

public class Ex0617_04 {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "반갑습니다.";
		System.out.println(str1);
		System.out.println(str1.toString());
		str1.toString(); // 메소드

		int a = 5;
		String s = a + "";
		int aa = Integer.parseInt(s);

		double d = 5.0;
		String ss = d + "";
		String sss = String.valueOf(d);
		double s1 = Double.parseDouble(sss);
		

	}

	@Override
	public String toString() { // 오브젝트
		// TODO Auto-generated method stub
		return super.toString();
	};

}
