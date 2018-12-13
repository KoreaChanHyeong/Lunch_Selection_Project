package Ex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ChooseFood extends JFrame { // 점심클래스
	
	ChooseFood() {
	//	menu = new MenuClass();
		setTitle("점심 월드컵");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		MyPanel1 panel = new MyPanel1();

		c.add(panel, BorderLayout.CENTER);

		ImageIcon lunchtime1 = new ImageIcon("images/자연캠.png");//이미지 저장
		ImageIcon rolloverIcon1 = new ImageIcon("images/자연캠1.png");//마우스가 올라갈 때 이미지
		ImageIcon pressedIcon1 = new ImageIcon("images/자연캠1.png");//마우스가 눌릴 때 이미지
		
		ImageIcon lunchtime2 = new ImageIcon("images/인문캠.png");
		ImageIcon rolloverIcon2 = new ImageIcon("images/인문캠1.png");
		ImageIcon pressedIcon2 = new ImageIcon("images/인문캠1.png");
		
		
		
		
		JButton btn_1 = new JButton(lunchtime1);  //중식 버튼생성

		btn_1.setRolloverIcon(rolloverIcon1);
		btn_1.setPressedIcon(pressedIcon1);
		panel.setLayout(null);
		panel.add(btn_1);
		btn_1.setLocation(80, 250);
		
		btn_1.setSize(200, 200);
		btn_1.setToolTipText("이과캠 점심 월드컵 게임을 시작합니다.");
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
		btn_2.setToolTipText("문과캠 점심 월드컵 게임을 시작합니다.");
		btn_2.addActionListener(new ActionListener() { // 
			public void actionPerformed(ActionEvent e) {
				new LunchFoodClass();
				dispose();
			}
		});
		
		setSize(800, 600);
		dispose(); //프레임 하나종료

		setSize(800, 600);
		setVisible(true);
	}
	class MyPanel1 extends JPanel {
		ImageIcon imageIcon = new ImageIcon("images/메뉴선택.png");
		Image image = imageIcon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
}