package Ex;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.event.*;
import javax.swing.*;


public class MainClass extends JFrame{//메인
	Container c;
	static InputStream In;
//	static AudioStream BGM;
//	static AudioPlayer MGP = AudioPlayer.player;
	MenuBar menu=new MenuBar();
  
	MainClass() {
		setTitle("골라골라 내 맘대로~");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		MyPanel panel = new MyPanel();
		c.add(panel, BorderLayout.CENTER);// FlowLayout,
		
		panel.add(menu.mb);


		//기본이미지
		ImageIcon normalIcon1 = new ImageIcon("images/음식.jpg");
		

		
		ImageIcon rolloverIcon1 = new ImageIcon("images/음식1.jpg");
		

		//마우스가 눌릴 때 이미지
		ImageIcon pressedIcon1 = new ImageIcon("images/음식1.jpg");
		

		JButton btn1 = new JButton(normalIcon1);// 음식		

		btn1.setRolloverIcon(rolloverIcon1);
		btn1.setPressedIcon(pressedIcon1);

		panel.setLayout(null);

		btn1.setLocation(440, 330);
		btn1.setSize(300, 500);
		panel.add(btn1);
		
		btn1.setToolTipText("점심이나저녁 월드컵으로 들어갑니다.");

		btn1.addActionListener(new ActionListener() { // 점심
			public void actionPerformed(ActionEvent e) {
				new ChooseFood();
				dispose();
			}
		});

		setSize(1200, 900);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		
		new MainClass();
	}
}//MainGUI