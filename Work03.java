package day1110;
/*
 * <����ó��>
 * 2. throws ����
 * : �޼ҵ� ���ο��� ���ܰ� �߻��� �� �ִ� �κп� try~catch�� 
 *   ���ܸ� ó���ϴ� ���� �⺻������
 *   ��쿡 ���� throws�� �̿��Ͽ� �޼ҵ带 ȣ���� ������ ������
 *   ���ѱ� ���� �ִ�.
 */

public class Work03 {

	public static void main(String[] args) {
		
		int i=10, j=0, k=0;
		try {
			k=divide(i, j);
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ �����");
		}finally {
			System.out.println(k);
		}
		
		
	}//end of main
	
	static int divide(int i, int j) throws ArithmeticException{
		int k=i/j;
		return k;
	}

}//end of class
