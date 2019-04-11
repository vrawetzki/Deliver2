package unit1b;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstWord;
		String secondWord = null;
		int Sum1 = 0;
		int Sum2 = 0;
		System.out.println("firstWord");
		firstWord = input.nextLine();

		for (int i = 0; i < firstWord.length(); i++) {
			char c = firstWord.charAt(i);
			int charvalue = (int) c;
			Sum1 = Sum1 + charvalue;
			System.out.print(charvalue + " ");

		}
		System.out.println(" ");
		System.out.println("secondWord");
		secondWord = input.nextLine();
		for (int i = 0; i < secondWord.length(); i++) {
			char c = secondWord.charAt(i);
			int charvalue = (int) c;
			Sum2 = Sum2 + charvalue;
		}

		System.out.println(Sum1 + "  " + Sum2);

		System.out.println();
		int abs = Math.abs(Sum1 - Sum2);
		System.out.println("Sum of firstWord :" + Sum1);
		System.out.println("Sum of secondWord : " + Sum2);
		System.out.println("Absolute difference is : " + abs);
		System.out.println("Absolute Value is : " + Math.abs(Sum1 + Sum2));
	}

}
