
public class Es0521_05 {

	public static void main(String[] args) {
		
		String num = "";
		int count = 0;
		//S001,S002...
		
//		System.out.printf("%d \n",5);
//		System.out.printf("%07d \n",12345678 );
//		System.out.printf("%07.2f \n",78.123456);
//		System.out.printf("%7s \n","더 좋은 ");
		
		String Str_num = "S"+String.format("%03d",++count);
		
		System.out.println(Str_num);

	}

}
