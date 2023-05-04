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
		return name+"/"+age+"��";
	}
	
	@Override
	public int compareTo(Person o) {
//		if(age>o.age) return 10;
//		else if(age<o.age) return -10;
//		else {	
//			if(name.equals(o.name)) {//�̸��� ���� ��� ����=�������(����X)
//				return 0;
//			}else {//�̸��� �ٸ����� ���̴� ���� ���
//				return name.compareTo(o.name);
//			}//end of if
//		}//end of if
		
		//�Ǵٸ� ���
		if(age==o.age) {
			return name.compareTo(o.name);
		}
		return o.age-age; //��������
		// return age-o.age; //��������
	}//end of compareTo
}

public class CompareEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Comparable�������̽��� compareTo()�޼ҵ尡 ���ǵǾ� �ְ�,
		// Integer�� String���� �� �޼ҵ尡 �������̵�Ǿ��� ������
		// �񱳰� �����ϴ�
		// Comparable : �⺻���� �������� ����
		
		
		Integer i1=45, i2=25, i3=25;
		String str1="a2ab", str2="ceis";
		
		System.out.println(i1.compareTo(i2)); //1
		System.out.println(i2.compareTo(i1)); //-1
		System.out.println(i2.compareTo(i3)); //0
		
		System.out.println(str1.compareTo(str2)); //-2
		System.out.println(str2.compareTo(str1)); //2
		
		TreeSet<Person> ts=new TreeSet<>();
		ts.add(new Person("ȫ�ڹ�",45));
		ts.add(new Person("���ڹ�",25));
		ts.add(new Person("���ڹ�",30));
		ts.add(new Person("���ڹ�",30));
		
		//���ڹ� ���ڹ� ���ڹ� ȫ�ڹ�
		System.out.println(ts);
		
	}//end of main

}//end of class
