package baek;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String sco = "";
		String[] ox;

		for (int j = 0; j < n; j++) {
			
			int co = 0;
			sco = s.next();
			ox = sco.split("");
			int count = 0;

			for (int i = 0; i < ox.length; i++) {

				if (ox[i].equals("O")) {
					count++;
					co = co + count;
				} else if (ox[i].equals("X")) {
					count = 0;
				}
			}

			System.out.println(co);
		}

	}
}
