package day1103;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * <��ü ��>
 * HashSet : ��ü�� equals(), hashCode()�� �������̵�
 * 	-������ String, ����Ŭ���� ���� �̹� equals()�� hashCode()�� 
 * 	  �������̵� �߱� ������ �ߺ������� ���� �ʴ´�.
 * 	 cf)�ؽ��ڵ�: ��ü�� ����� ��ġ�� �ǹ�
 * 			   ��ü�� �ּҰ��� �̿��ؼ� ����� ������
 * 			   ��� ��ü�� �ؽ��ڵ�� ���δ� �ٸ���
 */

class Pokemon implements Comparable<Pokemon>{
	String name;
	int lv, hp;
	
	public Pokemon(String name, int lv, int hp) {
		super();
		this.name = name;
		this.lv = lv;
		this.hp = hp;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"/LV."+lv+"/HP."+hp;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pokemon) {
			Pokemon p=(Pokemon)obj;
			return name.equals(p.name)&&lv==p.lv&&hp==p.hp;
		}
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return (name+lv+hp).hashCode();
	}
	
	//�̸��� ����, �̸��� ������ ����������,������ ������ ü�³�����
	
	@Override
	public int compareTo(Pokemon o) {
		if(name.equals(o.name)) {
			if(lv==o.lv) {
				return o.hp-hp;
			}
			return o.lv-lv;
		}
		return name.compareTo(o.name);
	}
	
}//end of Pokemon

public class PokemonSetEx01 {

	public static void main(String[] args) {
		Set<Pokemon> hs=new HashSet<>();
		
		hs.add(new Pokemon("��ī��",1,10));
		hs.add(new Pokemon("Ǫ��",2,100));
		hs.add(new Pokemon("������",1,1000));
		hs.add(new Pokemon("�����",10,100));
		hs.add(new Pokemon("������",5,10));
		hs.add(new Pokemon("��ī��",1,1000));
		hs.add(new Pokemon("Ǫ��",2,100));
		
		Iterator<Pokemon> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//��ü�� ������ ���Ƶ�, �ؽ��ڵ�� �ٸ���
		Pokemon p=new Pokemon("Ǫ��",2,100);
		System.out.println(p.hashCode());
		
		Pokemon p2=new Pokemon("Ǫ��",2,100);
		System.out.println(p2.hashCode());
		
		Set<Pokemon> ts=new TreeSet<>();
		
		ts.add(new Pokemon("��ī��",1,10));
		ts.add(new Pokemon("Ǫ��",2,100));
		ts.add(new Pokemon("������",1,1000));
		ts.add(new Pokemon("�����",10,100));
		ts.add(new Pokemon("������",5,10));
		ts.add(new Pokemon("��ī��",1,1000));
		ts.add(new Pokemon("Ǫ��",2,100));
		
		it=ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}//end of main

}//end of class
