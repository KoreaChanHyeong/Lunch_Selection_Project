package Ex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;


public class MainClass extends JFrame{//메인
	Container c;
	
	MenuClass menu = new MenuClass();
	
	MainClass() {
		setTitle("KU 점심 월드컵");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		MyPanel panel = new MyPanel();
		c.add(panel, BorderLayout.CENTER);// FlowLayout,
		
		panel.add(menu.mb);
		
		//기본이미지
		ImageIcon normalIcon1 = new ImageIcon("images/btn1.png");
		
		ImageIcon rolloverIcon1 = new ImageIcon("images/btn2.png");

		//마우스가 눌릴 때 이미지
		ImageIcon pressedIcon1 = new ImageIcon("images/btn2.png");
		

		JButton btn1 = new JButton(normalIcon1);// 음식		

		btn1.setRolloverIcon(rolloverIcon1);
		btn1.setPressedIcon(pressedIcon1);

		panel.setLayout(null);

		btn1.setLocation(320, 280);;
		btn1.setSize(150, 200);
		panel.add(btn1);
		
		btn1.setToolTipText("점심 월드컵으로 들어갑니다.");

		btn1.addActionListener(new ActionListener() { // 점심
			public void actionPerformed(ActionEvent e) {
				new ChooseFood();
				dispose();
			}
		});

		setSize(800, 600);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		
		new MainClass();
	}
}//MainGUI