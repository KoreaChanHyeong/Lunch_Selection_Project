package Ex;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


class GameStart extends JPanel{
	ImageIcon imageIcon = new ImageIcon("images/���ȭ��.jpg");
	Image image = imageIcon.getImage();
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}
class MyPanel extends JPanel {//���ι���
	ImageIcon imageIcon = new ImageIcon("images/����.png");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel2 extends JPanel {// 16������
	ImageIcon imageIcon = new ImageIcon("images/16��.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel3 extends JPanel {// 8������
	ImageIcon imageIcon = new ImageIcon("images/8��.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel4 extends JPanel {// 4������
	ImageIcon imageIcon = new ImageIcon("images/4��.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel5 extends JPanel {// 2������
	ImageIcon imageIcon = new ImageIcon("images/���.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel6 extends JPanel {// ��� ����
	ImageIcon imageIcon = new ImageIcon("images/���.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel7 extends JPanel {// ��� ����
	ImageIcon imageIcon = new ImageIcon("images/���.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}
class GameOverPanel extends JPanel{
	ImageIcon imageIcon = new ImageIcon("images/GameOver.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}