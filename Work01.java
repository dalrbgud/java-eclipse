package day1110;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * <���α׷��� ���۵�, �������� ����>
 * 1. ����(error) : �����ڰ� �����Ҷ� �Ͼ�� ����
 * 2. ����(exception) : �̾��ѿ���, ����ڿ� ���ؼ� �߻��Ҽ��ִ� ����
 *
 * <���� Ŭ����>
 * : ����� �߻��� �� �ִ� ������ Ŭ������ ����
 * 1. ExceptionŬ���� : ������� �Ǽ��� ���� ������ ���� ==> ����ó�� �� �ؾ�
 *  (��� Ŭ������ �θ�Ŭ����)
 *   -ClassNotFoundException : �������� �ʴ� Ŭ������ ����ҷ��� �Ҷ�
 *   -DateFormateException : �Է��� ������ ������ �߸��� ���
 *   -FileNotFoundException : �������� �ʴ� ������ �̸��� �Է��� ���
 *   -IOException : ������ �б�� ���� ����� ������ ������
 *   -InPutMismatchException : �Է��� �����Ͱ� ������ ���� ������
 *   ......
 *   
 *   1) �ֿ�޼ҵ�
 *   **printStackTrace()
 *      -�ܼ�â�� ���� �� �� + ����������
 *   **getMessage()
 *   	-�߻��� ����Ŭ������ �ν��Ͻ��� ����� �޽����� ���� �� �ִ�
 *   
 * 2. RuntimeException Ŭ���� : ���α׷����� �Ǽ� ==> ����X
 *   -ArithmeticException : 0���� �������� ���� �������� ��������� ����������
 *   -IllegalArgumentException : �޼��忡 �������� �μ��� ����������
 *   -IndexOutOfBoundsException : �迭 ��� ������ �Ѿ �ε����� ����Ҷ�
 *   -NoSuchElementException : �䱸�� ���Ұ� ������
 *   -NullPointerException : null���� ���� ���� ������ �����Ҷ�
 *   -NumberFormatException : ���ڿ��� ���ڷ� ��ȯ�Ϸ� �Ҷ�
 *   .....
 *   
 *   <���� ó��>
 *   : ���α׷� ����� �߻��� �� �ִ� ����ġ ���� ������ �߻��� ����� �ڵ带 �ۼ�
 *   �ϴ� �� ==>���������� ���Ḧ ����, �������� ������¸� �����ϴ� ��
 *   1. try~catch���
 *   try{
 *   	//���ܰ� �߻��� �� �ִ� �ڵ�
 *   }catch(Exception e){
 *   	//���ܰ� �߻����� ���, �̸� ó���ϱ� ���� ����
 *   }catch(Exception e2){
 *   	....
 *   }finally{
 *   	//���ܻ�Ȳ�� ������� ��� �Ǵ� ����Ǵ� �ڵ�(����) 
 *   }
 *   
 *   
 *  **���ǻ��� 1. try��Ͼȿ��� ������ �����ϸ� �ȵȴ�
 *           2. finally�� ���û����̴�.
 *           3. �θ�Exception catch���� �ٸ� �ڽ�Exception������
 *           	�տ� �θ� X (�ڽ�Exception���� dead code�� �����߻�)
 */

public class Work01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int result=0;
		
		try {
			
			System.out.println("ù��° ���� �Է��ϼ���");
			int n1=sc.nextInt();
			
			System.out.println("�ι�° ���� �Է��ϼ���");
			int n2=sc.nextInt();
			
			System.out.println("�μ��� �����ϴ�");
			result=n1/n2;
		}catch(ArithmeticException e){
			//System.out.println("0���� ������ �����ϴ�");
			e.printStackTrace();
		}catch (InputMismatchException e) { //�Ǽ��� �Է�
			System.out.println("������ �Է��ϼ���");
		}catch (Exception e){
			System.out.println("���߻�Ȳ�� �߻��߾��");
		}
		finally {
			System.out.println("���: "+result);
			System.out.println("�����մϴ�");
		}
		
	}//end of main

}//end of class
