import java.util.ArrayList;

class Menu {
	
	String Set [] = new String[3]; 
	
	public Menu(String name, String cost, String feat) {
		String Menu [] = {name, cost, feat};
		this.Set = Menu;
	}
	
}

public class Lunch_Class {
	public static void main(String [] args) {
		System.out.println("���� �޴� ������");
		
		// �߽Ŀ� ���� ArrayList
		Menu C1 = new Menu("���ʼ�","8000","��ٷο� ����");
		Menu C2 = new Menu("��ϳ׹���","7000","");
		Menu C3 = new Menu("������ «��","7000","" );
		Menu C4 = new Menu("�ϻͳ���","10000","" );
		Menu C5 = new Menu("�Ϲ̿�", "8000", "");
		Menu C6 = new Menu("ȫ�����","7000","" );
		Menu C7 = new Menu("�ӽ�", "�ӽ�", "�ӽ�");
		
		ArrayList<Menu> Chi = new ArrayList<>();
		Chi.add(C1);
		Chi.add(C2);
		Chi.add(C3);
		Chi.add(C4); 
		Chi.add(C5);
		Chi.add(C6);
		Chi.add(C7);
		//��Ŀ� ���� Array List
		
		
	}
}
