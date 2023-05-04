package day1103;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student>{
	int hakbun;
	String name;
	int score;
	
	public Student(int hakbun, String name, int score) {
		super();
		this.hakbun = hakbun;
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return hakbun+":"+name+"("+score+")";
	}
	
	//학번이 같으면 같은 객체로 인식되로록 오버라이드
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s=(Student)obj;
			
			return hakbun==s.hakbun;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return ((Integer)hakbun).hashCode();
	}
	
	//점수순 정렬(오름차순), 점수가 같으면 이름순 정렬
	@Override
	public int compareTo(Student o) {
		if(score==o.score) {
			name.compareTo(o.name);
		}
		return score-o.score;
	}
}
public class SetQuiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> hs= new HashSet<>();
		hs.add(new Student(10,"김필",90));
		hs.add(new Student(28,"로꼬",75));
		hs.add(new Student(31,"로이킴",86));
		hs.add(new Student(10,"아이유",86));	//저장X
		hs.add(new Student(4,"자이언티",67));
		hs.add(new Student(5,"양다일",75));
	
		System.out.println("=====HashSet=====");
		System.out.println(hs);
	
		TreeSet<Student> ts= new TreeSet<>();
		
		ts.add(new Student(10,"김필",90));
		ts.add(new Student(28,"로꼬",75));
		ts.add(new Student(31,"로이킴",86));
		ts.add(new Student(10,"아이유",88));	//저장O(학번은 고려X)
		ts.add(new Student(4,"자이언티",67));
		ts.add(new Student(5,"양다일",75));
		ts.add(new Student(6,"양다일",75));  //점수와 이름이 같으면
										   //같은 객체로 인식되므로 저장X
	
		System.out.println("=====TreeSet=====");
		System.out.println(ts);
		
		Student s=ts.last();
		System.out.println("가장높은점수: "+s.score);
		s=ts.first();
		System.out.println("가장낮은점수: "+s.score);
	}

}














