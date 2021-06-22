package 변수;

class 설명 {
	// 맴버변수/필드
	// 생성자 - 객체안만들어짐 - 실행을 못시킴
	// 메소드
}

// 크기순 : byte < short/char < int < long < float < double

public class Var1 {
	public static void main(String [] args) { /* 이 괄호 안에있는 애들이 매소드 앞에 main은 매소드 이름 */
		
		byte b = 127; // 64  32  16  8  4  2  1
					  //  1   1   1  0 
					  // 2바이트는 = 8비트2
		int i = 100;
		
		System.out.println("byte+int: " +(b+i));
		int sum1 = b + i; // 묵시적 형변환
		byte sum2 = (byte)(b + i);  // 강제적 형변환
		
		
	}

}
