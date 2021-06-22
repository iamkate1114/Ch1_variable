package scanner;

import java.util.Scanner;

public class Sc1 {
	
	public static void main(String [] args) {
		
		//스캐너 : 콘솔창으로 데이터를 입력받게 해주는 프로그램이다.
		
		//1.안내문구
		System.out.println("당신의 이름과 나이를 입력해 주세요>>");
		//2.스캐너를 가져온다.
		Scanner sc = new Scanner(System.in); //new 만들어라
		String name = sc.next(); // 기본으로 문자읽어오고 , 뒤에 int나 실수 등 붙으면 그걸가져옴 name이라는 방에 문자를 가져올꺼다
		int age = sc.nextInt(); // 정수를 읽는 
		
		System.out.println("당신의 이름은 "+name+"이고, 나이는 "+ age + "입니다.");
	}
}
