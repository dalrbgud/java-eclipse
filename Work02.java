package day1110;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

//1. �ΰ��� ������ jop�� �Է¹޵� ���� ���� ����մϴ�.
//  15, 5�� �Է� ==> "��: 3"�� ��� ==> "�����⸦ �����մϴ�"���

public class Work02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int result=0, n1=0,n2=0;
		try {
			 n1=Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
				
			 n2=Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
			
			result=n1/n2;
		}catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null,"0���� ������ �����ϴ�");
		}catch(InputMismatchException e) { //�Ǽ��� �Է�
			JOptionPane.showMessageDialog(null,"������ �Է��ϼ���");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "���߻�Ȳ �߻�");
		}finally {
			JOptionPane.showMessageDialog(null, "��:"+result);
			JOptionPane.showMessageDialog(null, "�����⸦ �����մϴ�");
		}
	
	}//end of main

}//end of class
