
package 연산자;

public class Op4 {

	public static void main(String [] args) {
						// 16  8  4  2  1 = 이건 5비트
						
		int n1 = 10;    //  0  1  0  1  0  = 10의 이진수
		int n2 = 5;     //  0  0  1  0  1  = 5의 이진수
		
		// --------------------------------------------
		// &(AND)       //  0  0  0  0  0   &는 모든게 참참참일대 참이다.
		System.out.println(n1&n2);
		
		// --------------------------------------------
		// |(OR)        //  0  1  1  1  1
		System.out.println(n1|n2);
	}
}
