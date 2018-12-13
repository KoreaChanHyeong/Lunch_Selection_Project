package Ex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ChooseFood extends JFrame { // ����Ŭ����
	
	ChooseFood() {
	//	menu = new MenuClass();
		setTitle("���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		MyPanel1 panel = new MyPanel1();

		c.add(panel, BorderLayout.CENTER);

		ImageIcon lunchtime1 = new ImageIcon("images/�ڿ�ķ.png");//�̹��� ����
		ImageIcon rolloverIcon1 = new ImageIcon("images/�ڿ�ķ1.png");//���콺�� �ö� �� �̹���
		ImageIcon pressedIcon1 = new ImageIcon("images/�ڿ�ķ1.png");//���콺�� ���� �� �̹���
		
		ImageIcon lunchtime2 = new ImageIcon("images/�ι�ķ.png");
		ImageIcon rolloverIcon2 = new ImageIcon("images/�ι�ķ1.png");
		ImageIcon pressedIcon2 = new ImageIcon("images/�ι�ķ1.png");
		
		
		
		
		JButton btn_1 = new JButton(lunchtime1);  //�߽� ��ư����

		btn_1.setRolloverIcon(rolloverIcon1);
		btn_1.setPressedIcon(pressedIcon1);
		panel.setLayout(null);
		panel.add(btn_1);
		btn_1.setLocation(80, 250);
		
		btn_1.setSize(200, 200);
		btn_1.setToolTipText("�̰�ķ ���� ������ ������ �����մϴ�.");
		btn_1.addActionListener(new ActionListener() { // 
			public void actionPerformed(ActionEvent e) {
				new LunchFoodClass2();
				dispose();
			}
		});
		
		JButton btn_2 = new JButton(lunchtime2);
		
		btn_2.setRolloverIcon(rolloverIcon2);
		btn_2.setPressedIcon(pressedIcon2);
		panel.setLayout(null);
		panel.add(btn_2);
		btn_2.setLocation(500, 250);
		btn_2.setSize(200, 200);
		btn_2.setToolTipText("����ķ ���� ������ ������ �����մϴ�.");
		btn_2.addActionListener(new ActionListener() { // 
			public void actionPerformed(ActionEvent e) {
				new LunchFoodClass();
				dispose();
			}
		});
		
		setSize(800, 600);
		dispose(); //������ �ϳ�����

		setSize(800, 600);
		setVisible(true);
	}
	class MyPanel1 extends JPanel {
		ImageIcon imageIcon = new ImageIcon("images/�޴�����.png");
		Image image = imageIcon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
}