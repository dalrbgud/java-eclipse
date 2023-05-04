package day1104;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * <MAP �������̽�>
 *  : Ű(key)-��(Value) ������ ���Ҹ� ����
 *    ==>Ű(���� ã�µ� �����ִ� ��): �ߺ�X, ��: �ߺ�O
 *	
 *	  -Ư�� Ű����� �˻��� �Ҷ� ���� ���
 *	  -����Ŭ���� : HashMap, TreeMap
 *		  (Hash:�˻��پ, TreeMap: �����˻�, ����)
 */



public class MapEx01 {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		
		//�����̸��� ������ ����
		
		//1. V put(K key, V value): ���Ҹ� �߰�
		map.put("���", 5);
		map.put("�ٳ���", 3);
		map.put("����", 10);
		map.put("����", 1);
		map.put("���", 10); //����X
		
		//2. int size() :������ ����
		System.out.println(map.size()+"���� ������ ������ �ֽ��ϴ�");
		
		//3. boolean containsKey(Object key): Ű�� �ִ��� ����
		System.out.println(map.containsKey("�ٳ���"));
		
		//4. V get(Object key) :Ű�� �ش��ϴ� ���� ����
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ã�� ���� �Է�: ");
		String input=sc.next();
		//Quiz>input�� �ش��ϴ� ������ ������ ����غ���
		if(map.containsKey(input)) {
			System.out.println(input+"��(��) "+map.get(input)+"�� �־��");
		}else {
			System.out.println(input+"��(��) �����");
		}
		
		//5. V remove(Object key) : ���� ����
		System.out.println("������ ���� �Է�: ");
		input=sc.next();	
		//Quiz>input�� map�� �ִ��� ������ ������ "OO�� �����߾��"
		//                            ������ "OO�� �����" ���

		if(map.containsKey(input)) {
			map.remove(input);
			System.out.println(input+"�� �����߾��");
		}else {
			System.out.println(input+"�� �����");
		}
		
		//6. Set<K> keySet() : Map�� ����� ��� key�� ����� Set�� ��ȯ
		Set<String> set=map.keySet();		
		Iterator<String> it=set.iterator();		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//7. void clear() : map�� ��� ���Ҹ� ����
		map.clear();
		System.out.println("��� �����߾��");
		
		//8. boolean isEmpty() : ����ִ��� ����
		System.out.println("������ �ֳ���?"+map.isEmpty());

	}//end of main

}//end of class
