package day1104;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * <MAP 인터페이스>
 *  : 키(key)-값(Value) 쌍으로 원소를 저장
 *    ==>키(값을 찾는데 도와주는 것): 중복X, 값: 중복O
 *	
 *	  -특정 키워드로 검색을 할때 많이 사용
 *	  -구현클래스 : HashMap, TreeMap
 *		  (Hash:검색뛰어남, TreeMap: 범위검색, 정렬)
 */



public class MapEx01 {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		
		//과일이름과 갯수를 저장
		
		//1. V put(K key, V value): 원소를 추가
		map.put("사과", 5);
		map.put("바나나", 3);
		map.put("포도", 10);
		map.put("딸기", 1);
		map.put("사과", 10); //저장X
		
		//2. int size() :원소의 갯수
		System.out.println(map.size()+"가지 종류의 과일이 있습니다");
		
		//3. boolean containsKey(Object key): 키가 있는지 여부
		System.out.println(map.containsKey("바나나"));
		
		//4. V get(Object key) :키에 해당하는 값을 리턴
		
		Scanner sc= new Scanner(System.in);
		System.out.println("찾을 과일 입력: ");
		String input=sc.next();
		//Quiz>input에 해당하는 과일의 갯수를 출력해보자
		if(map.containsKey(input)) {
			System.out.println(input+"이(가) "+map.get(input)+"개 있어요");
		}else {
			System.out.println(input+"이(가) 없어요");
		}
		
		//5. V remove(Object key) : 원소 삭제
		System.out.println("삭제할 과일 입력: ");
		input=sc.next();	
		//Quiz>input이 map에 있는지 따져서 있으면 "OO을 삭제했어요"
		//                            없으면 "OO은 없어요" 출력

		if(map.containsKey(input)) {
			map.remove(input);
			System.out.println(input+"을 삭제했어요");
		}else {
			System.out.println(input+"은 없어요");
		}
		
		//6. Set<K> keySet() : Map에 저장된 모든 key가 저장된 Set을 반환
		Set<String> set=map.keySet();		
		Iterator<String> it=set.iterator();		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//7. void clear() : map의 모든 원소를 삭제
		map.clear();
		System.out.println("모두 삭제했어요");
		
		//8. boolean isEmpty() : 비어있는지 여부
		System.out.println("과일이 있나요?"+map.isEmpty());

	}//end of main

}//end of class
