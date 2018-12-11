package Ex;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


class GameStart extends JPanel{
	ImageIcon imageIcon = new ImageIcon("images/¹«Á¦_16.png");
	Image image = imageIcon.getImage();
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}
class MyPanel extends JPanel {//¸ÞÀÎ¹ÙÅÁ
	ImageIcon imageIcon = new ImageIcon("images/¸ÞÀÎ.png");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel2 extends JPanel {// 16°­¹ÙÅÁ
	ImageIcon imageIcon = new ImageIcon("images/16°­.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel3 extends JPanel {// 8°­¹ÙÅÁ
	ImageIcon imageIcon = new ImageIcon("images/8°­.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel4 extends JPanel {// 4°­¹ÙÅÁ
	ImageIcon imageIcon = new ImageIcon("images/4°­.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel5 extends JPanel {// 2°­¹ÙÅÁ
	ImageIcon imageIcon = new ImageIcon("images/°á½Â.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel6 extends JPanel {// ¿ì½Â ¹ÙÅÁ
	ImageIcon imageIcon = new ImageIcon("images/¿ì½Â.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel7 extends JPanel {// ¿ì½Â ¹ÙÅÁ
	ImageIcon imageIcon = new ImageIcon("images/¿ì½ÂÀÚ.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}
class GameOverPanel extends JPanel{
	ImageIcon imageIcon = new ImageIcon("images/GameOver.png");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}