package p0616;

public class Ex0616_08 {

	public static void main(String[] args) {
		// S001,S002,S003,S004,S005
		String[] stuNo = new String[100];
		for(int i=0;i<100;i++) {
			//stuNo[i] = String.format("S%03d", i+1);
			String temp = String.format("%03d", i+1);
			stuNo[i] = "S".concat(temp);
		}
		for(int i=0;i<100;i++) {
			System.out.println(stuNo[i]);
		}

		
		
	}

}
