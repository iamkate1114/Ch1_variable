package scanner;

import java.util.Scanner;

public class Sc3 {
	public static void main(String [] agrs) {
		//자기소개하기
		System.out.println("이름과 나이,몸무게,재산을 입력해주세요");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int age = scanner.nextInt();
		int weight = scanner.nextInt();
		int money = scanner.nextInt();
		
	
		System.out.println(name+"의 나이는 " + age + "살, 몸무게는 " + weight + "kg이고, 재산은 "+ money+"보유" );
		 
	}
}
