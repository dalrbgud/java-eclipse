package day1102;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import java.util.Scanner;

public class SetEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new TreeSet<>();
		
		set.add("국어"); set.add("수학");
		set.add("영어");	set.add("미술");
		set.add("사회"); set.add("과학");
		
		//1> "과목의 갯수를 출력해보세요 (예: 과목(총 6개))
			System.out.println("과목(총 "+set.size()+"개)");
		//2> 복자를 사용하여 모든 과목명을 출력해보세요
		//	(예: 국어 수학 영어 미술 사회 과학)
			Iterator<String> it=set.iterator();
			while(it.hasNext()) {	//다음 데이터가 있는 동안
				System.out.print(it.next()+" ");
			}
			System.out.println(" ");
		//3) 삭제할 과목명을 입력받아서 set에서 그 과목을 삭제후
		//	 삭제후 과목의 갯수를 출력해보세요
			Scanner sc=new Scanner(System.in);
			System.out.println("삭제할 과목명 입력");
			String delete=sc.next();
			set.remove(delete);
			System.out.println("삭제후 과목(총 "+set.size()+"개)");
			
		//4) 복자를 사용하여 모든 과목명을 출력해보세요
			it=set.iterator();
			while(it.hasNext()) {	//다음 데이터가 있는 동안
				System.out.print(it.next()+" ");
			}
	}//end of main

}//end of class
