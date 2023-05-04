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
	
	//�й��� ������ ���� ��ü�� �νĵǷη� �������̵�
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
	
	//������ ����(��������), ������ ������ �̸��� ����
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
		hs.add(new Student(10,"����",90));
		hs.add(new Student(28,"�β�",75));
		hs.add(new Student(31,"����Ŵ",86));
		hs.add(new Student(10,"������",86));	//����X
		hs.add(new Student(4,"���̾�Ƽ",67));
		hs.add(new Student(5,"�����",75));
	
		System.out.println("=====HashSet=====");
		System.out.println(hs);
	
		TreeSet<Student> ts= new TreeSet<>();
		
		ts.add(new Student(10,"����",90));
		ts.add(new Student(28,"�β�",75));
		ts.add(new Student(31,"����Ŵ",86));
		ts.add(new Student(10,"������",88));	//����O(�й��� ���X)
		ts.add(new Student(4,"���̾�Ƽ",67));
		ts.add(new Student(5,"�����",75));
		ts.add(new Student(6,"�����",75));  //������ �̸��� ������
										   //���� ��ü�� �νĵǹǷ� ����X
	
		System.out.println("=====TreeSet=====");
		System.out.println(ts);
		
		Student s=ts.last();
		System.out.println("�����������: "+s.score);
		s=ts.first();
		System.out.println("���峷������: "+s.score);
	}

}














