package day1103;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"/"+age+"세";
	}
	
	@Override
	public int compareTo(Person o) {
//		if(age>o.age) return 10;
//		else if(age<o.age) return -10;
//		else {	
//			if(name.equals(o.name)) {//이름과 나이 모두 같음=같은사람(저장X)
//				return 0;
//			}else {//이름은 다르지만 나이는 같은 경우
//				return name.compareTo(o.name);
//			}//end of if
//		}//end of if
		
		//또다른 방법
		if(age==o.age) {
			return name.compareTo(o.name);
		}
		return o.age-age; //내림차순
		// return age-o.age; //오름차순
	}//end of compareTo
}

public class CompareEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Comparable인터페이스에 compareTo()메소드가 정의되어 있고,
		// Integer와 String에는 이 메소드가 오버라이드되었기 때문에
		// 비교가 가능하다
		// Comparable : 기본으로 오름차순 정렬
		
		
		Integer i1=45, i2=25, i3=25;
		String str1="a2ab", str2="ceis";
		
		System.out.println(i1.compareTo(i2)); //1
		System.out.println(i2.compareTo(i1)); //-1
		System.out.println(i2.compareTo(i3)); //0
		
		System.out.println(str1.compareTo(str2)); //-2
		System.out.println(str2.compareTo(str1)); //2
		
		TreeSet<Person> ts=new TreeSet<>();
		ts.add(new Person("홍자바",45));
		ts.add(new Person("김자바",25));
		ts.add(new Person("박자바",30));
		ts.add(new Person("이자바",30));
		
		//김자바 박자바 이자바 홍자바
		System.out.println(ts);
		
	}//end of main

}//end of class
