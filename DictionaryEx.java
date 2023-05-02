package MyProgram;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;

//이프로그램의 문제점: 같은 랜덤수가 발생할수 있어서 똑같은 내용의 퀴즈가 나올수 있다
//   quiz()메소드에서 매번 다른 랜덤수가 나오도록 업그레이드가 필요
class Dictionary{
	TreeMap<String, String> tm=new TreeMap<>();
	
	public Dictionary() {
		tm.put("apple", "사과");
		tm.put("search", "찾다");
		tm.put("shadow", "그림자");
		tm.put("crab", "게");
		tm.put("refrigerator", "냉장고");
		tm.put("chair", "의자");
		tm.put("clock", "시계");
		tm.put("bowl", "그릇");
		tm.put("brick", "벽돌");
		tm.put("near", "가까운");
		tm.put("squid", "오징어");
		tm.put("spill", "엎지르다");
		tm.put("cheer", "응원하다, 환호하다");
		tm.put("rack", "선반, 받침대");
	}

	void input() { //단어 입력하기
		//1. 단어를 입력하세요 라고 대화창을 띠운다
		//   입력한 단어를 word 변수에 저장
		//2. 뜻을 입력하세요 라고 대화창을 띠운다
		//   입력한 뜻을 mean 변수에 저장
		//3. word와mean을 tm에 저장
		//4. 단어가 등록되었습니다 라고 대화창으로 알려준다
		String word;
		word = JOptionPane.showInputDialog("단어를 입력하세요");
		
		String mean;
		mean = JOptionPane.showInputDialog("뜻를 입력하세요");
		
		tm.put(word, mean);
		
		JOptionPane.showMessageDialog(null, "단어가 등록되었습니다");
		
	}
	
	void search() {	//단어 검색하기
		//1. 검색할 영어단어 입력 이라는 대화창을 띠운다
		//2. 입력한 영어단어를 key라는 변수에 저장한다
		//3. key가 tm에 있는지 알아본후
		// 	 있으면 뜻: ooo 이라고 대화창에 나타내고
		//   없으면 단어없음 이라고 대화창을 띠운다
		String key;
		key = JOptionPane.showInputDialog("단어를 입력하세요");
		
		if(tm.containsKey(key)) {
			JOptionPane.showMessageDialog(null, "뜻: "+tm.get(key));
		}else {
			JOptionPane.showMessageDialog(null, "단어없음");
		}
		
		
	}
	
	void showAll() { //모든 단어 보기
		Set<String> set=tm.keySet();
		String result="---단어 리스트---\n";
		
		//복자를 쓸수없는 이유: 복자는 get메소드를 사용할수 없다
		for(String s:set) {
			result+=s+":"+tm.get(s)+"\n";
		}
		JOptionPane.showMessageDialog(null, result);
	}
	
	void quiz(){ //퀴즈
		int wrong=0; //오답수 저장
		int count=0; //문제수 저장
		//1. 퀴즈 수 입력 이라고 대화창이 뜬다
		count = Integer.parseInt(JOptionPane.showInputDialog("퀴즈 수 입력"));
		String result="문제수: "+count;
		
		Set<String> set=tm.keySet();
		//아래와 같이 하면 형변환오류가 발생
		//String[] keys=(String[])set.toArray();
		String[] keys=new String[set.size()];
		keys=set.toArray(keys);
		
		//2. 한글뜻? 이란 문제가 입력한 수만큼 나타난다
		//3. 정답이면 정답!!(오답수: oo)라고 뜬다
		//			오답이면 땡!! (오답수: oo)\n 정답: ooo 이라고 뜬다
		while(count>0) {
			int random=(int)(Math.random()*count);
			String quiz=tm.get(keys[random]);
			count--;
			
			String answer=JOptionPane.showInputDialog(quiz+"?");
			
			if(keys[random].equals(answer)) {
				JOptionPane.showMessageDialog(null,"정답!! (오답수:"+wrong+")");
			}else {
				wrong++;
				JOptionPane.showMessageDialog(null, "땡!! (오답수:"+wrong+")\n 정답:"+keys[random]);
			}
				
		}
		
		//4. 문제수 o / 오답수: o 이라고 최종적으로 나타난다
		JOptionPane.showMessageDialog(null, result+"오답수: "+wrong);
		
		
		
		
	}
}
 
public class DictionaryEx {

	public static void main(String[] args) {
		String msg="메뉴를 선택하세요\n "
				+"------------------------\n"
				+"1.새단어 등록\n"
				+"2.단어 검색\n"
				+"3.모든 단어 보기\n"
				+"4.Quiz\n"
				+"5.종료하기\n";
		Dictionary d=new Dictionary();
		while(true) {
			String select=JOptionPane.showInputDialog(msg);
			if(select.equals("1")) {//새단어 입력
				d.input();
				continue;
			}
			if(select.equals("2")) { //단어 검색
				d.search();
				continue;
			}
			if(select.equals("3")) { //모든 단어 보기
				d.showAll();
				continue;	
			}
			if(select.equals("4")) { //퀴즈
				d.quiz();
				continue;
			}
			if(select.equals("5")) { //종료
				break;
			}
			
			JOptionPane.showMessageDialog(null, "잘못 입력하셨어요");

		}//end of while

	}//end of main

}//end of class
