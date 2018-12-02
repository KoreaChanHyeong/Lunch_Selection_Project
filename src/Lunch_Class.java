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
		System.out.println("점심 메뉴 월드컵");
		
		// 중식에 관한 ArrayList
		Menu C1 = new Menu("용초수","8000","꿔바로우 맛집");
		Menu C2 = new Menu("언니네반점","7000","");
		Menu C3 = new Menu("전설의 짬뽕","7000","" );
		Menu C4 = new Menu("니뽕내뽕","10000","" );
		Menu C5 = new Menu("일미옥", "8000", "");
		Menu C6 = new Menu("홍콩반점","7000","" );
		Menu C7 = new Menu("임시", "임시", "임시");
		
		ArrayList<Menu> Chi = new ArrayList<>();
		Chi.add(C1);
		Chi.add(C2);
		Chi.add(C3);
		Chi.add(C4); 
		Chi.add(C5);
		Chi.add(C6);
		Chi.add(C7);
		//양식에 관한 Array List
		
		
	}
}
