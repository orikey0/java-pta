
package easy;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int k = inScanner.nextInt();
		k*=100;
		int foot = k/3048;
		int inch = ((k % 3048)*12)/3048;
		System.out.println(foot+" "+inch);
//		System.out.println(inch);
//		while (inScanner.hasNext()) {
//			Double a=inScanner.nextInt();
//			int b = inScanner.nextInt();
//			System.out.println(a+b);
//			
//		}
//		System.out.println("bye");
	}
}
