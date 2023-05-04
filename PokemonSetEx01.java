package day1103;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * <객체 비교>
 * HashSet : 객체의 equals(), hashCode()를 오버라이드
 * 	-기존의 String, 포장클래스 등은 이미 equals()와 hashCode()를 
 * 	  오버라이드 했기 때문에 중복저장이 되지 않는다.
 * 	 cf)해시코드: 객체가 저장된 위치를 의미
 * 			   객체의 주소값을 이용해서 만들기 때문에
 * 			   모든 객체의 해시코드는 전부다 다르다
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
	
	//이름순 정렬, 이름이 같으면 레벨높은순,레벨도 같으면 체력높은순
	
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
		
		hs.add(new Pokemon("피카츄",1,10));
		hs.add(new Pokemon("푸린",2,100));
		hs.add(new Pokemon("망나뇽",1,1000));
		hs.add(new Pokemon("토게피",10,100));
		hs.add(new Pokemon("망나뇽",5,10));
		hs.add(new Pokemon("피카츄",1,1000));
		hs.add(new Pokemon("푸린",2,100));
		
		Iterator<Pokemon> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//객체의 내용이 같아도, 해시코드는 다르다
		Pokemon p=new Pokemon("푸린",2,100);
		System.out.println(p.hashCode());
		
		Pokemon p2=new Pokemon("푸린",2,100);
		System.out.println(p2.hashCode());
		
		Set<Pokemon> ts=new TreeSet<>();
		
		ts.add(new Pokemon("피카츄",1,10));
		ts.add(new Pokemon("푸린",2,100));
		ts.add(new Pokemon("망나뇽",1,1000));
		ts.add(new Pokemon("토게피",10,100));
		ts.add(new Pokemon("망나뇽",5,10));
		ts.add(new Pokemon("피카츄",1,1000));
		ts.add(new Pokemon("푸린",2,100));
		
		it=ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}//end of main

}//end of class
