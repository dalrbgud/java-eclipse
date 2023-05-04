package day1102;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Ȩ������ �Խ��� �����غ���

class Board{
	String title;	//����
	String content;	//����
	String writer;	//����
	
	public Board(String title, String writer, String content) {
		super();
		this.title = title;
		this.writer = writer;
		this.content = content;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title+" / "+writer+" / "+content;
	}
	
}//end of Board
public class BoardEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list=new ArrayList<>();
		
		list.add(new Board("����� ���� ��� �ȳ���","���ǻ�","�����ϼ���"));
		list.add(new Board("4�� ����� �ȳ���","����ĺ�","������մϴ�"));
		list.add(new Board("���� ���� ����","�л���","�����մϴ�"));
		list.add(new Board("10�� �޽�ǥ","������","���̵弼��"));
		list.add(new Board("3�г� �����ٹ��� ����","3�г��","��������"));
		list.add(new Board("10�� ���Ǽҽ���","���ǻ�","�ǰ��ϼ���"));
		list.add(new Board("����","������Ʈ","���̿�����"));
		
		System.out.println("======������Ź�======");
		Iterator<Board> it=list.iterator();
		int i=1;
		while(it.hasNext()) {
			System.out.println(i+". "+it.next());
			i++;
		}
		System.out.println("======���ǰ��� �ۼ���======");
		it=list.iterator();
		String search="���ǻ�";
		while(it.hasNext()) {
			Board b=it.next();
			if(b.writer.equals(search))
			System.out.println(b);
		}
		System.out.println("======����� ����======");
		String delete="����";
		boolean check=false;
		it=list.iterator();
		//���ڸ� ���鼭 Board��ü�� title�� delete�� ������
		//Board��ü�� ����
		while(it.hasNext()) {
			Board b=it.next();
			if(b.title.equals(delete)) {
				it.remove(); //���ڰ� ����Ű�� �׸��� ����
				check=true;
			}
		}	
		if(!check) {
			System.out.println("������� �����ϴ�.");
			return;
		}
		 it=list.iterator();
		 	i=1;
			while(it.hasNext()) {
				System.out.println(i+". "+it.next());
				i++;
			}
	}//end of main

}//end of class









