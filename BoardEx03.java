package day1102;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//홈페이지 게시판 구현해보기

class Board{
	String title;	//제목
	String content;	//내용
	String writer;	//제자
	
	public Board(String title, String writer, String content) {
		super();
		this.title = title;
		this.writer = writer;
		this.content = content;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title+" / "+writer+" / "+content;
	}
	
}//end of Board
public class BoardEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list=new ArrayList<>();
		
		list.add(new Board("사랑의 헌혈 행사 안내문","보건샘","헌혈하세요"));
		list.add(new Board("4차 방과후 안내문","방과후부","방과후합니다"));
		list.add(new Board("학폭 실태 조사","학생부","조사합니다"));
		list.add(new Board("10월 급식표","영양사샘","많이드세요"));
		list.add(new Board("3학년 졸업앨범비 납부","3학년부","돈내세요"));
		list.add(new Board("10월 보건소식지","보건샘","건강하세요"));
		list.add(new Board("광고","땡땡마트","많이오세요"));
		
		System.out.println("======가정통신문======");
		Iterator<Board> it=list.iterator();
		int i=1;
		while(it.hasNext()) {
			System.out.println(i+". "+it.next());
			i++;
		}
		System.out.println("======보건관련 작성글======");
		it=list.iterator();
		String search="보건샘";
		while(it.hasNext()) {
			Board b=it.next();
			if(b.writer.equals(search))
			System.out.println(b);
		}
		System.out.println("======광고글 삭제======");
		String delete="광고";
		boolean check=false;
		it=list.iterator();
		//복자를 돌면서 Board객체의 title이 delete와 같으면
		//Board객체를 삭제
		while(it.hasNext()) {
			Board b=it.next();
			if(b.title.equals(delete)) {
				it.remove(); //복자가 가리키는 항목을 삭제
				check=true;
			}
		}	
		if(!check) {
			System.out.println("광고글이 없습니다.");
			return;
		}
		 it=list.iterator();
		 	i=1;
			while(it.hasNext()) {
				System.out.println(i+". "+it.next());
				i++;
			}
	}//end of main

}//end of class









