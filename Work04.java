package day1110;
/*
 * <강제로 예외처리를 해야하는 메소드>
 * - 꾀 많다
 * ex) Thread.sleep(long 밀리초)
 * 	 : 밀리초만큼 일시정지(os를 대기상태로 둔다)
 *   : 이메소드는 위험요소가 있기 때문에 반드시 돌발상황에 대처하야한다
 *   : 그러나 요새는 os가 워낙 좋기때문에 돌발상황 발생하지는 않지만 형식적으로 사용
 */
public class Work04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		for(int i=10;i>0;i--) {
			System.out.println(i+"초");
			//예외처리방법1
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
