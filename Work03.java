package day1110;
/*
 * <예외처리>
 * 2. throws 선언
 * : 메소드 내부에서 예외가 발생할 수 있는 부분에 try~catch로 
 *   예외를 처리하는 것이 기본이지만
 *   경우에 따라서 throws를 이용하여 메소드를 호출한 곳으로 예오를
 *   떠넘길 수도 있다.
 */

public class Work03 {

	public static void main(String[] args) {
		
		int i=10, j=0, k=0;
		try {
			k=divide(i, j);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없어요");
		}finally {
			System.out.println(k);
		}
		
		
	}//end of main
	
	static int divide(int i, int j) throws ArithmeticException{
		int k=i/j;
		return k;
	}

}//end of class
