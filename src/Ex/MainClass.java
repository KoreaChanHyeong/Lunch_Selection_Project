package Ex;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.event.*;
import javax.swing.*;


public class MainClass extends JFrame{//����
	Container c;
	static InputStream In;
//	static AudioStream BGM;
//	static AudioPlayer MGP = AudioPlayer.player;
	MenuBar menu=new MenuBar();
  
	MainClass() {
		setTitle("����� �� �����~");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		MyPanel panel = new MyPanel();
		c.add(panel, BorderLayout.CENTER);// FlowLayout,
		
		panel.add(menu.mb);


		//�⺻�̹���
		ImageIcon normalIcon1 = new ImageIcon("images/����.jpg");
		

		
		ImageIcon rolloverIcon1 = new ImageIcon("images/����1.jpg");
		

		//���콺�� ���� �� �̹���
		ImageIcon pressedIcon1 = new ImageIcon("images/����1.jpg");
		

		JButton btn1 = new JButton(normalIcon1);// ����		

		btn1.setRolloverIcon(rolloverIcon1);
		btn1.setPressedIcon(pressedIcon1);

		panel.setLayout(null);

		btn1.setLocation(440, 330);
		btn1.setSize(300, 500);
		panel.add(btn1);
		
		btn1.setToolTipText("�����̳����� ���������� ���ϴ�.");

		btn1.addActionListener(new ActionListener() { // ����
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