package MyProgram;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;

//�����α׷��� ������: ���� �������� �߻��Ҽ� �־ �Ȱ��� ������ ��� ���ü� �ִ�
//   quiz()�޼ҵ忡�� �Ź� �ٸ� �������� �������� ���׷��̵尡 �ʿ�
class Dictionary{
	TreeMap<String, String> tm=new TreeMap<>();
	
	public Dictionary() {
		tm.put("apple", "���");
		tm.put("search", "ã��");
		tm.put("shadow", "�׸���");
		tm.put("crab", "��");
		tm.put("refrigerator", "�����");
		tm.put("chair", "����");
		tm.put("clock", "�ð�");
		tm.put("bowl", "�׸�");
		tm.put("brick", "����");
		tm.put("near", "�����");
		tm.put("squid", "��¡��");
		tm.put("spill", "��������");
		tm.put("cheer", "�����ϴ�, ȯȣ�ϴ�");
		tm.put("rack", "����, ��ħ��");
	}

	void input() { //�ܾ� �Է��ϱ�
		//1. �ܾ �Է��ϼ��� ��� ��ȭâ�� ����
		//   �Է��� �ܾ word ������ ����
		//2. ���� �Է��ϼ��� ��� ��ȭâ�� ����
		//   �Է��� ���� mean ������ ����
		//3. word��mean�� tm�� ����
		//4. �ܾ ��ϵǾ����ϴ� ��� ��ȭâ���� �˷��ش�
		String word;
		word = JOptionPane.showInputDialog("�ܾ �Է��ϼ���");
		
		String mean;
		mean = JOptionPane.showInputDialog("�渦 �Է��ϼ���");
		
		tm.put(word, mean);
		
		JOptionPane.showMessageDialog(null, "�ܾ ��ϵǾ����ϴ�");
		
	}
	
	void search() {	//�ܾ� �˻��ϱ�
		//1. �˻��� ����ܾ� �Է� �̶�� ��ȭâ�� ����
		//2. �Է��� ����ܾ key��� ������ �����Ѵ�
		//3. key�� tm�� �ִ��� �˾ƺ���
		// 	 ������ ��: ooo �̶�� ��ȭâ�� ��Ÿ����
		//   ������ �ܾ���� �̶�� ��ȭâ�� ����
		String key;
		key = JOptionPane.showInputDialog("�ܾ �Է��ϼ���");
		
		if(tm.containsKey(key)) {
			JOptionPane.showMessageDialog(null, "��: "+tm.get(key));
		}else {
			JOptionPane.showMessageDialog(null, "�ܾ����");
		}
		
		
	}
	
	void showAll() { //��� �ܾ� ����
		Set<String> set=tm.keySet();
		String result="---�ܾ� ����Ʈ---\n";
		
		//���ڸ� �������� ����: ���ڴ� get�޼ҵ带 ����Ҽ� ����
		for(String s:set) {
			result+=s+":"+tm.get(s)+"\n";
		}
		JOptionPane.showMessageDialog(null, result);
	}
	
	void quiz(){ //����
		int wrong=0; //����� ����
		int count=0; //������ ����
		//1. ���� �� �Է� �̶�� ��ȭâ�� ���
		count = Integer.parseInt(JOptionPane.showInputDialog("���� �� �Է�"));
		String result="������: "+count;
		
		Set<String> set=tm.keySet();
		//�Ʒ��� ���� �ϸ� ����ȯ������ �߻�
		//String[] keys=(String[])set.toArray();
		String[] keys=new String[set.size()];
		keys=set.toArray(keys);
		
		//2. �ѱ۶�? �̶� ������ �Է��� ����ŭ ��Ÿ����
		//3. �����̸� ����!!(�����: oo)��� ���
		//			�����̸� ��!! (�����: oo)\n ����: ooo �̶�� ���
		while(count>0) {
			int random=(int)(Math.random()*count);
			String quiz=tm.get(keys[random]);
			count--;
			
			String answer=JOptionPane.showInputDialog(quiz+"?");
			
			if(keys[random].equals(answer)) {
				JOptionPane.showMessageDialog(null,"����!! (�����:"+wrong+")");
			}else {
				wrong++;
				JOptionPane.showMessageDialog(null, "��!! (�����:"+wrong+")\n ����:"+keys[random]);
			}
				
		}
		
		//4. ������ o / �����: o �̶�� ���������� ��Ÿ����
		JOptionPane.showMessageDialog(null, result+"�����: "+wrong);
		
		
		
		
	}
}
 
public class DictionaryEx {

	public static void main(String[] args) {
		String msg="�޴��� �����ϼ���\n "
				+"------------------------\n"
				+"1.���ܾ� ���\n"
				+"2.�ܾ� �˻�\n"
				+"3.��� �ܾ� ����\n"
				+"4.Quiz\n"
				+"5.�����ϱ�\n";
		Dictionary d=new Dictionary();
		while(true) {
			String select=JOptionPane.showInputDialog(msg);
			if(select.equals("1")) {//���ܾ� �Է�
				d.input();
				continue;
			}
			if(select.equals("2")) { //�ܾ� �˻�
				d.search();
				continue;
			}
			if(select.equals("3")) { //��� �ܾ� ����
				d.showAll();
				continue;	
			}
			if(select.equals("4")) { //����
				d.quiz();
				continue;
			}
			if(select.equals("5")) { //����
				break;
			}
			
			JOptionPane.showMessageDialog(null, "�߸� �Է��ϼ̾��");

		}//end of while

	}//end of main

}//end of class
