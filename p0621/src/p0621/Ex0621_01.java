package p0621;

public class Ex0621_01 {

	public static void main(String[] args) {
		
		String[] str = {"홍길동","이순신","유관순","강감찬","김유신"};
		//String str1 = new String("");
		
		StringBuffer sbf = new StringBuffer("");
		
		for(int i=0;i<str.length;i++) {
			if(i==0) {
				sbf.append(str[i]);		//홍길동
			} else {
				sbf.append(", "+str[i]);		// , 이순신, 유관순, 강감찬, 김유신				
			}
		}
		String str2 = sbf.toString();
		String[] result = str2.split(", ");
				
//		System.out.println(str2);
//		System.out.println(result[2]);
		
		for(String i:result) {
			System.out.println(i);
		}
		
	}

}
