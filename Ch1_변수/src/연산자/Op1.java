package 연산자;

// 사칙연산자 : 
// 출력문에는 3가지가 있다.
// print, println, prinf
public class Op1 {
	public static void main(String [] args) {
		int n1 = 33;
		int n2 = 20;
		int result ;
		
		result = n1+n2;
		System.out.println("n1+n2= "+(n1+n2)); // ln은 줄바꿈을 한다
		System.out.print("여기"); //줄바꿈이 안된다. 글자를 누적시켜 나갈 떄 필요하다 23시 11븐 50초 같은거 할때...
		System.out.println("저기");
		System.out.print("여기\n"); //이건 줄바꿈 하고싶을때 \n을 쓴다.
		System.out.printf("%d+%d=%d\n" ,n1,n2,result); // %d 정수, %f 실수, %c 문자, %s 문자열
		
		result = n1*n2;
		System.out.printf("%d*%d=%d\n" ,n1,n2,result);
		
		result = n1/n2;
		System.out.println("n1/n2= "+(n1/n2));
		
		// int = int/int
		float result2 = n1/(float)n2;
		System.out.println("n1/n2= "+result2);
		
		result = n1%n2;
		System.out.println("n1%n2="+result);
	}

}
