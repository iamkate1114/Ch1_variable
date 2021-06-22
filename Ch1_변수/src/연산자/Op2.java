package 연산자;

public class Op2 {
	public static void main(String [] args) {
		
		int a = 2;
		int c = 1;
		c = (++a)+c;
		
		System.out.println(c);
		System.out.println(a);
		
		a++; // a = a+1
		a--; // a = a-1
	}
}
