package p0616;

public class Ex0616_09 {

	public static void main(String[] args) {

		String[] hobby1 = { "game", "movie", "reading", "golf" };
		String[] hobby2 = { "movie" };
		String[] hobby3 = { "game", "reading" };

		String hobby = "";
		
		for(int i=0;i<hobby1.length;i++) {
			if(i==0) {
				hobby += hobby1[i];
			}else { 
				hobby += ","+hobby1[i];				
			}
			
		}
		
		System.out.println(hobby);
		
		if(hobby.contains("game")) {
			System.out.println();
		}else {
			System.out.println();
		}
	}

}
