package scanner;

import java.util.Scanner;

public class Sc2 {
	public static void main(String [] args) {
		System.out.println("두수의 값을 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int sum = num1+num2;
		System.out.println("두 수의 합은 "+sum);
		
	}
}
