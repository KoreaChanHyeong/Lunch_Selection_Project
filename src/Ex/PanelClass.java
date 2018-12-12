package Ex;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


class GameStart extends JPanel{
	ImageIcon imageIcon = new ImageIcon("images/¥Î±‚»≠∏È.jpg");
	Image image = imageIcon.getImage();
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}
class MyPanel extends JPanel {//∏ﬁ¿ŒπŸ≈¡
	ImageIcon imageIcon = new ImageIcon("images/∏ﬁ¿Œ.png");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel2 extends JPanel {// 16∞≠πŸ≈¡
	ImageIcon imageIcon = new ImageIcon("images/16∞≠.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel3 extends JPanel {// 8∞≠πŸ≈¡
	ImageIcon imageIcon = new ImageIcon("images/8∞≠.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel4 extends JPanel {// 4∞≠πŸ≈¡
	ImageIcon imageIcon = new ImageIcon("images/4∞≠.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel5 extends JPanel {// 2∞≠πŸ≈¡
	ImageIcon imageIcon = new ImageIcon("images/∞·Ω¬.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel6 extends JPanel {// øÏΩ¬ πŸ≈¡
	ImageIcon imageIcon = new ImageIcon("images/øÏΩ¬.jpg");
	Image image = imageIcon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyPanel7 extends JPanel {// øÏΩ¬ πŸ≈¡
	ImageIcon imageIcon = new ImageIcon("images/øÏΩ¬.jpg");
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