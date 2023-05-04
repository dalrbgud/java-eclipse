package day1102;
/*
 * <Set �������̽�>
 * -�ε���X, �ߺ�����X, ������� ����X
 * -List�� �޼ҵ� �ߺ�, ��� �ε���ó���� ����(�ε����� �Ű������� ���� �޼ҵ�X)
 * -����Ŭ���� : HashSet, TreeSet
 * 	          (Hash: �˻�����, Tree: �ڵ�����)
 */

import java.util.TreeSet;
import java.util.Iterator;

public class SetEx01 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet();
		
		set.add(100);	set.add(50);
		set.add(-100); 	set.add(5);
		set.add(150);	set.add(55);
		set.add(70);	set.add(100); //�߰�X (�ߺ�)
        //set.add(7.1);	//�߰�X(Integer�� X)
		System.out.println(set);
		//HashSet�� ���, ���� ������ ���
		//TreeSet�� ���, ���� ���ĵǾ� ���
		
		set.remove(100);
		System.out.println("������: "+ set.size()+"��");
		// TODO Auto-generated method stub
		
		System.out.println("�迭�� ����");
		Object[] arr=set.toArray();
		for(Object o:arr) {
			System.out.println(o);
		}
		/*
		 * <java.util.Iterator(�ݺ���) �������̽�>
		 * : ��ü ��ü�� ������� �ѹ��� �ݺ��ؼ� �������� �ݺ���
		 */
		Iterator<Integer> it=set.iterator();
		Integer i=it.next();//50
		System.out.println("�ݺ���: "+i);
		System.out.println(it.next()); //-100
		System.out.println("�ݺ��ڸ� �̿��� ������ ���");
		it=set.iterator();	//�ݺ��ڸ� �� ó�� ��ġ�� 
		while(it.hasNext()) {	//���� �����Ͱ� �ִ� ����
			System.out.print(it.next()+" ");
		}
		
		//�Ʒ� �޼ҵ�� TreeSet�� �޼ҵ��̴�
		System.out.println("min:"+set.first());
		System.out.println("max:"+set.last());
		//higher(E e) : e���� ū���� ���� ��ü �� ���� ����� ��ü ��ȯ
		System.out.println(set.higher(20));
		//lower(E e) : e���� �������� ���� ��ü �� ���� ����� ��ü ��ȯ
		System.out.println(set.lower(20));
		//Set<E> subSet (E from, E to)
		System.out.println(set.subSet(50, 70));
		//Set<E> tailSet (E from) : from���� ū ��ü��(from����)
		System.out.println(set.tailSet(70));
		//Set<E> headSet (E to) : to���� ���� ��ü��(to����X)
		System.out.println(set.headSet(70));
		
	}//end of main

}//end of class
