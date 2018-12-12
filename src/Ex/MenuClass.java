package Ex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MenuClass extends JFrame{
	JMenuBar mb = new JMenuBar();			//�޴��ٰ�ü����
	MenuClass() {
		System.out.println("menu()");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
	}

	void createMenu() {

		JMenuItem[] menuItem = new JMenuItem[2]; // �޴������� ��ü����
		String[] itemTitle = { "ó������", "�����ϱ�" }; // ������ �̸�
		JMenu textMenu = new JMenu("Menu");
		textMenu.setToolTipText("�޴�â���� ���ϴ�."); // ����
		for (int i = 0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(new MenuActionListener());
			textMenu.add(menuItem[i]); // JMenu�� itemTitle�߰�
		}
		mb.add(textMenu); // �޴��ٿ� �߰�
		this.setJMenuBar(mb); // JMenuBar�� JFrame�� ���δ�.s

		setSize(800, 10);
		setVisible(true);
	}

	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if (cmd.equals("ó������")) {
				new MainClass();
				setVisible(false);
			}
			if (cmd.equals("�����ϱ�")) {
				System.exit(0);
			}
		}

	}
		} 