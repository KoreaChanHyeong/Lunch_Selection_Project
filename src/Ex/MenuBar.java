package Ex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class MenuBar extends JFrame{
	JMenuBar mb = new JMenuBar();			//메뉴바객체생성
	MenuBar() {
		System.out.println("menu()");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
	}

	void createMenu() {

		JMenuItem[] menuItem = new JMenuItem[4]; // 메뉴아이템 객체생성
		String[] itemTitle = { "처음으로", "종료하기", "BgnOff", "BgnOn" }; // 아이템 이름
		JMenu textMenu = new JMenu("Menu");
		textMenu.setToolTipText("메뉴창으로 들어갑니다."); // 툴팁
		for (int i = 0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(new MenuActionListener());
			textMenu.add(menuItem[i]); // JMenu에 itemTitle추가
		}
		mb.add(textMenu); // 메뉴바에 추가
		this.setJMenuBar(mb); // JMenuBar를 JFrame에 붙인다.s

		setSize(10, 200);
		setVisible(true);
	}

	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if (cmd.equals("처음으로")) {
				new MainClass();
				setVisible(false);
			}
			if (cmd.equals("종료하기")) {
				System.exit(0);
			}
			
		}

	}
} 
