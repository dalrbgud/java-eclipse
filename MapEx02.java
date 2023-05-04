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
		//이름을 가지고 포켓몬 정보를 불수있는 Map을 사용
		tm.put("피카츄", new Pokemon("피카츄",10,1000));
		tm.put("라이츄", new Pokemon("라이츄",100,10000));
		tm.put("토게피",new Pokemon("토게피",10,100));
		tm.put("망나뇽",new Pokemon("망나뇽",5,10));
		tm.put("피카츄",new Pokemon("피카츄",1,1000));	//저장X
		tm.put("푸린",new Pokemon("푸린",2,100));
		
		//Quiz>피카츄 포켓몬이 있는지 여부
		System.out.println(tm.containsKey("피카츄"));
		
		//Quiz>푸린의 정보를 출력
		System.out.println(tm.get("푸린"));
		
		//Quiz>찾을 포켓몬의 이름을 입력받아서
		//     있으면 그 포켓몬의 정보를 출력, 없으면 "없다고" 출력
		Scanner sc= new Scanner(System.in);
		System.out.println("찾을 포켓몬: ");
		String name=sc.next();	
		
		if(tm.containsKey(name)) {
			System.out.println(tm.get(name));
		}else {
			System.out.println(name+"없다고");
		}
		
		//Quiz>라이츄 포켓몬 삭제	
		tm.remove(name);
		System.out.println(tm);
		
		Set<String> keys=tm.keySet();		
		
		for(String k:keys) {
			System.out.println(tm.get(k));
		}
		
		
	}//end of main

}//end of class
