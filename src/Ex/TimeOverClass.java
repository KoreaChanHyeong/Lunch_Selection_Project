package Ex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TimeOverClass extends JFrame{		//게임오버 클래스
	TimeOverClass(){
		setTitle("타임오버");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c;
		c = getContentPane();
		GameOverPanel panel1 = new GameOverPanel();		

		c.add(panel1, BorderLayout.CENTER);
		ImageIcon reButton = new ImageIcon("images/처음으로.jpg");
		ImageIcon exitButton = new ImageIcon("images/종료하기.jpg");
		
		JButton btn = new JButton(reButton);// 처음으로
		JButton btn1 = new JButton(exitButton); // 종료

		panel1.setLayout(null);

		btn.setLocation(600, 280);// 위치
		btn.setSize(100,50);// 버튼크기 = 사진크기
		panel1.add(btn);
		btn.setToolTipText("초기화면으로 돌아갑니다.");
		btn1.setToolTipText("게임을 종료합니다.");

		btn1.setLocation(600, 360);
		btn1.setSize(100,50);
		panel1.add(btn1);
		setSize(800, 600);
		setVisible(true);
		btn.addActionListener(new ActionListener() { // 처음
			public void actionPerformed(ActionEvent e) {
				new MainClass();					//초기화면
				dispose();
			}
		});
		btn1.addActionListener(new ActionListener() { // 종료
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});	
	}
}