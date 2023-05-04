package day1102;
/*
 * <Set 인터페이스>
 * -인덱스X, 중복저장X, 저장순서 유지X
 * -List와 메소드 중복, 대신 인덱스처리가 없다(인덱스를 매개변수로 갖는 메소드X)
 * -구현클래스 : HashSet, TreeSet
 * 	          (Hash: 검색빠름, Tree: 자동정렬)
 */

import java.util.TreeSet;
import java.util.Iterator;

public class SetEx01 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet();
		
		set.add(100);	set.add(50);
		set.add(-100); 	set.add(5);
		set.add(150);	set.add(55);
		set.add(70);	set.add(100); //추가X (중복)
        //set.add(7.1);	//추가X(Integer가 X)
		System.out.println(set);
		//HashSet일 경우, 값이 무작위 출력
		//TreeSet일 경우, 값이 정렬되어 출력
		
		set.remove(100);
		System.out.println("삭제후: "+ set.size()+"개");
		// TODO Auto-generated method stub
		
		System.out.println("배열로 변경");
		Object[] arr=set.toArray();
		for(Object o:arr) {
			System.out.println(o);
		}
		/*
		 * <java.util.Iterator(반복자) 인터페이스>
		 * : 전체 객체를 대상으로 한번씩 반복해서 가져오는 반복자
		 */
		Iterator<Integer> it=set.iterator();
		Integer i=it.next();//50
		System.out.println("반복자: "+i);
		System.out.println(it.next()); //-100
		System.out.println("반복자를 이용한 데이터 출력");
		it=set.iterator();	//반복자를 맨 처음 위치로 
		while(it.hasNext()) {	//다음 데이터가 있는 동안
			System.out.print(it.next()+" ");
		}
		
		//아래 메소드는 TreeSet의 메소드이다
		System.out.println("min:"+set.first());
		System.out.println("max:"+set.last());
		//higher(E e) : e보다 큰값을 가진 객체 중 가장 가까운 객체 반환
		System.out.println(set.higher(20));
		//lower(E e) : e보다 작은값을 가진 객체 중 가장 가까운 객체 반환
		System.out.println(set.lower(20));
		//Set<E> subSet (E from, E to)
		System.out.println(set.subSet(50, 70));
		//Set<E> tailSet (E from) : from보다 큰 객체를(from포함)
		System.out.println(set.tailSet(70));
		//Set<E> headSet (E to) : to보다 작은 객체를(to포함X)
		System.out.println(set.headSet(70));
		
	}//end of main

}//end of class
