package day1104;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Pokemon {
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
}

public class MapEx02 {

	public static void main(String[] args) {
		TreeMap<String, Pokemon> tm=new TreeMap<>();
		//�̸��� ������ ���ϸ� ������ �Ҽ��ִ� Map�� ���
		tm.put("��ī��", new Pokemon("��ī��",10,1000));
		tm.put("������", new Pokemon("������",100,10000));
		tm.put("�����",new Pokemon("�����",10,100));
		tm.put("������",new Pokemon("������",5,10));
		tm.put("��ī��",new Pokemon("��ī��",1,1000));	//����X
		tm.put("Ǫ��",new Pokemon("Ǫ��",2,100));
		
		//Quiz>��ī�� ���ϸ��� �ִ��� ����
		System.out.println(tm.containsKey("��ī��"));
		
		//Quiz>Ǫ���� ������ ���
		System.out.println(tm.get("Ǫ��"));
		
		//Quiz>ã�� ���ϸ��� �̸��� �Է¹޾Ƽ�
		//     ������ �� ���ϸ��� ������ ���, ������ "���ٰ�" ���
		Scanner sc= new Scanner(System.in);
		System.out.println("ã�� ���ϸ�: ");
		String name=sc.next();	
		
		if(tm.containsKey(name)) {
			System.out.println(tm.get(name));
		}else {
			System.out.println(name+"���ٰ�");
		}
		
		//Quiz>������ ���ϸ� ����	
		tm.remove(name);
		System.out.println(tm);
		
		Set<String> keys=tm.keySet();		
		
		for(String k:keys) {
			System.out.println(tm.get(k));
		}
		
		
	}//end of main

}//end of class
