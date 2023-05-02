package day1110;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

//1. 두개의 정수를 jop로 입력받도 나눈 몫을 출력합니다.
//  15, 5를 입력 ==> "몫: 3"을 출력 ==> "나누기를 종료합니다"출력

public class Work02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int result=0, n1=0,n2=0;
		try {
			 n1=Integer.parseInt(JOptionPane.showInputDialog("정수 입력"));
				
			 n2=Integer.parseInt(JOptionPane.showInputDialog("정수 입력"));
			
			result=n1/n2;
		}catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null,"0으로 나눌수 없습니다");
		}catch(InputMismatchException e) { //실수를 입력
			JOptionPane.showMessageDialog(null,"정수를 입력하세요");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "돌발상황 발생");
		}finally {
			JOptionPane.showMessageDialog(null, "몫:"+result);
			JOptionPane.showMessageDialog(null, "나누기를 종료합니다");
		}
	
	}//end of main

}//end of class
