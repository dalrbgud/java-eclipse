package day1102;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import java.util.Scanner;

public class SetEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new TreeSet<>();
		
		set.add("����"); set.add("����");
		set.add("����");	set.add("�̼�");
		set.add("��ȸ"); set.add("����");
		
		//1> "������ ������ ����غ����� (��: ����(�� 6��))
			System.out.println("����(�� "+set.size()+"��)");
		//2> ���ڸ� ����Ͽ� ��� ������� ����غ�����
		//	(��: ���� ���� ���� �̼� ��ȸ ����)
			Iterator<String> it=set.iterator();
			while(it.hasNext()) {	//���� �����Ͱ� �ִ� ����
				System.out.print(it.next()+" ");
			}
			System.out.println(" ");
		//3) ������ ������� �Է¹޾Ƽ� set���� �� ������ ������
		//	 ������ ������ ������ ����غ�����
			Scanner sc=new Scanner(System.in);
			System.out.println("������ ����� �Է�");
			String delete=sc.next();
			set.remove(delete);
			System.out.println("������ ����(�� "+set.size()+"��)");
			
		//4) ���ڸ� ����Ͽ� ��� ������� ����غ�����
			it=set.iterator();
			while(it.hasNext()) {	//���� �����Ͱ� �ִ� ����
				System.out.print(it.next()+" ");
			}
	}//end of main

}//end of class
