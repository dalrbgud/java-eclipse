package day1110;
/*
 * <������ ����ó���� �ؾ��ϴ� �޼ҵ�>
 * - �� ����
 * ex) Thread.sleep(long �и���)
 * 	 : �и��ʸ�ŭ �Ͻ�����(os�� �����·� �д�)
 *   : �̸޼ҵ�� �����Ұ� �ֱ� ������ �ݵ�� ���߻�Ȳ�� ��ó�Ͼ��Ѵ�
 *   : �׷��� ����� os�� ���� ���⶧���� ���߻�Ȳ �߻������� ������ ���������� ���
 */
public class Work04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		for(int i=10;i>0;i--) {
			System.out.println(i+"��");
			//����ó�����1
//			try {
//				Thread.sleep(1000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}catch (Exception e){
//				e.printStackTrace();
//			}
			
			Thread.sleep(1000);
			
		}

	}//end of main

}//end of class
