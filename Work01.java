package day1110;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * <프로그램의 오작동, 비정상적 종료>
 * 1. 에러(error) : 개발자가 개발할때 일어나는 오류
 * 2. 예외(exception) : 미약한오류, 사용자에 의해서 발생할수있는 오류
 *
 * <예외 클래스>
 * : 실행시 발생할 수 있는 오류를 클래스로 정의
 * 1. Exception클래스 : 사용자의 실수와 같은 외적인 요인 ==> 예외처리 꼭 해야
 *  (모든 클래스의 부모클래스)
 *   -ClassNotFoundException : 존재하지 않는 클래스를 사용할려고 할때
 *   -DateFormateException : 입력한 데이터 형식이 잘못된 경우
 *   -FileNotFoundException : 존재하지 않는 파일의 이름을 입력한 경우
 *   -IOException : 데이터 읽기와 같은 입출력 문제가 있을때
 *   -InPutMismatchException : 입력한 데이터가 변수와 맞지 않을때
 *   ......
 *   
 *   1) 주요메소드
 *   **printStackTrace()
 *      -콘솔창에 빨간 줄 뜸 + 강제종료함
 *   **getMessage()
 *   	-발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다
 *   
 * 2. RuntimeException 클래스 : 프로그래머의 실수 ==> 강제X
 *   -ArithmeticException : 0으로 나누가와 같은 부적절한 산술연산을 수행했을때
 *   -IllegalArgumentException : 메서드에 부적절한 인수를 전달했을때
 *   -IndexOutOfBoundsException : 배열 등에서 범위를 넘어선 인덱스를 사용할때
 *   -NoSuchElementException : 요구한 원소가 없을때
 *   -NullPointerException : null값을 가진 참조 변수에 접근할때
 *   -NumberFormatException : 문자열을 숫자로 변환하려 할때
 *   .....
 *   
 *   <예외 처리>
 *   : 프로그램 실행시 발생할 수 있는 예기치 못한 예외의 발생에 대비한 코드를 작성
 *   하는 것 ==>비정상적인 종료를 막고, 정상적인 실행상태를 유지하는 것
 *   1. try~catch블록
 *   try{
 *   	//예외가 발생할 수 있는 코드
 *   }catch(Exception e){
 *   	//예외가 발생했을 경우, 이를 처리하기 위한 문장
 *   }catch(Exception e2){
 *   	....
 *   }finally{
 *   	//예외상황과 관계없이 출력 또는 실행되는 코드(선택) 
 *   }
 *   
 *   
 *  **유의사항 1. try블록안에는 변수를 선언하면 안된다
 *           2. finally는 선택사항이다.
 *           3. 부모Exception catch블럭은 다른 자식Exception블럭보다
 *           	앞에 두면 X (자식Exception블럭이 dead code로 에러발생)
 */

public class Work01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int result=0;
		
		try {
			
			System.out.println("첫번째 수를 입력하세요");
			int n1=sc.nextInt();
			
			System.out.println("두번째 수를 입력하세요");
			int n2=sc.nextInt();
			
			System.out.println("두수를 나눕니다");
			result=n1/n2;
		}catch(ArithmeticException e){
			//System.out.println("0으로 나눌수 없습니다");
			e.printStackTrace();
		}catch (InputMismatchException e) { //실수를 입력
			System.out.println("정수를 입력하세요");
		}catch (Exception e){
			System.out.println("돌발상황이 발생했어요");
		}
		finally {
			System.out.println("결과: "+result);
			System.out.println("종료합니다");
		}
		
	}//end of main

}//end of class
