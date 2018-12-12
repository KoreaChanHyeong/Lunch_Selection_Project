package Ex;

import java.awt.*;
import java.awt.event.*;
import java.io.InputStream;
import javax.swing.*;
import javax.swing.event.*;


class TimerRunnable extends Thread{	//Thread 클래스 상속
	JLabel timerLabel;				//타이머 라벨생성
	
	boolean flag = false;			
	int time=10;					//시간초 설정
	JFrame j=new JFrame();
	public TimerRunnable(JLabel timerLabel){		//생성자
		this.timerLabel=timerLabel;
	}	
	public void run(){							//run() 메소드 오버라이딩
		synchronized(this){			//한 스레드가 독점적으로 실행해야 하는 부분(동기화 코드)을 표시하는키워드
									//먼저 실행한 스레드가 모니터 소유
			while(true){
				timerLabel.setText(Integer.toString(time));
				time--;
				try{
					if(!flag){
						Thread.sleep(1000);		//1초 동안 잠잔후 깨어난다.
						if(time<10){
							timerLabel.setForeground(Color.yellow);
							timerLabel.setFont(new Font("Gothic", Font.BOLD, 80));							
						}														
							}					
					if(time==0){		
					}
					if(time<0){
						System.out.println("타임오버");
						flag=true;
						timerLabel.setFont(new Font("Gothic",Font.BOLD,25));
						timerLabel.setText("타임 오버");						
						new TimeOverClass();
						j.dispose();
						wait();	//스레드 멈춤			
							}
					}
				catch(InterruptedException e){	//예외를 받고 스스로 리턴하여 종료
					return;
				}
					}
						}
					}
}
public class PlayWorldCup extends JFrame{
		Container c;

		ImageIcon[] image1 = new ImageIcon[1];// 1강
		ImageIcon[] image2 = new ImageIcon[2];// 2강
		ImageIcon[] image4 = new ImageIcon[4];// 4강
		ImageIcon[] image8 = new ImageIcon[8];// 8강
		ImageIcon[] image16 = new ImageIcon[16];// 16강 배열

		int ll = 0;// 왼쪽 배열 값 _ 짝수
		int rr = 1;// 오른쪽 배열 값 _ 홀수
		int r[];

		int count = 0; // 카운트 값 _ 월드컵이 몇 번 진행되었는 지 기억함 
		

		JLabel timerLabel=new JLabel();
		TimerRunnable runnable =new TimerRunnable(timerLabel);	//맨위에 있는 클래스 객체 생성
		Thread th;		//Thread 객체생성하는부분중 일부 (Thread th=new Thread();가 스레드객체생성)
		PlayWorldCup() {
			System.out.println("playworld실행");
			timerLabel.setFont(new Font("Gothic",Font.ITALIC,55));
			timerLabel.setForeground(Color.black);
			setTitle("점심 월드컵");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			c = getContentPane();
			GameStart panel = new GameStart();

			c.add(panel, BorderLayout.CENTER);// FlowLayout,

			r=new int[16];
			for (int i = 0; i < r.length; i++) {
				r[i] = i; // 랜덤배열 [0]~[15]개의 생성, 0~15 저장
			}
			for (int i = 0; i < 16; i++) {
				int temp;
				int n = (int) (Math.random() * 16);// 0~15 랜덤 값
				temp = r[i]; // t값에 i값 저장
				r[i] = r[n]; // r[i]에 r[랜덤] 저장
				r[n] = temp; // r[랜덤]에 t값 저장
				// 0~15의 배열 각 자리수를 랜덤으로 바꿈
			}
			for (int i = 0; i < 16; i++) {
				System.out.print(r[i] + " "); // 랜덤으로 바뀐 배열 0~15까지 총 16개의 숫자 뽑기

			}
			panel.addMouseListener(new MyMouseListener());

			setSize(800, 600);
			setVisible(true);
			
		}
		class MyMouseListener extends MouseAdapter {
			public void mouseClicked(MouseEvent e) {
			if(e.getClickCount() == 1) {
					new lunch16r();
					dispose();
				}
			}
		}
		class lunch16r extends JFrame { 

			lunch16r() {
				
				setTitle("점심 월드컵 16강");
				count = count + 1; // 카운트 증가

				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				c = getContentPane();
				MyPanel2 panel = new MyPanel2();
				c.add(panel, BorderLayout.CENTER);// FlowLayout,

				JButton btn = new JButton(image16[ll]);// 왼쪽사진
				JButton btn1 = new JButton("랜덤선택");// 랜덤
				JButton btn2 = new JButton(image16[rr]);// 오른쪽사진

				panel.setLayout(null);

				btn.setLocation(37, 120);
				btn.setSize(280, 410);
				panel.add(btn);

				btn1.setFont(new Font("HY울릉도M", Font.PLAIN, 16));
				btn1.setLocation(345, 250);
				btn1.setSize(100, 30);
				panel.add(btn1);

				btn2.setLocation(468, 120);
				btn2.setSize(280, 410);
				panel.add(btn2);

				th=new Thread(runnable);		//스레드객체생성
				timerLabel.setLocation(345,120);
				timerLabel.setSize(150,150);
				panel.add(timerLabel);
				th.start();//start()메소드 호출,스레드 작동시작
				timerLabel.setToolTipText("제한 시간입니다. 0초가 되면 Game Over 됩니다.");
				btn.addActionListener(new ActionListener() { // 왼쪽
					
					public void actionPerformed(ActionEvent e) { // 왼쪽이 눌렸을 때
						if (count < 8) {
							image8[count-1] = image16[ll]; // 8강의 이미지의 첫 번째 배열 = 16강 이미지 
							ll += 2;
							rr += 2;
							new lunch16r();
							dispose();
						} else if (count == 8) {
							image8[count-1] = image16[ll];
							ll = 0;
							rr = 1;
							count = 0; 	 	// 다시 8강부터 시작하기 위해 초기화
							
							new lunch8r(); 	// 8강 시작
							dispose();
						}
						
						

					}
			
					
				});

				btn1.addActionListener(new ActionListener() { // 랜덤선택
					
					public void actionPerformed(ActionEvent e) {
						if (count == 8) {// 카운터횟수,배열[7]
							int k = (int) (Math.random() * 2) + 1;

							if (k == 1) {// 랜덤선택
								image8[count-1] = image16[ll];
								ll = 0;
								rr = 1;
								count = 0;
								
								new lunch8r();
								dispose();

							} else if (k == 2) {//// 랜덤선택
								image8[count-1] = image16[rr];
								ll = 0;
								rr = 1;
								count = 0;
							
								new lunch8r();
								dispose();
							}
						} else if (count < 8) {

							int n = (int) (Math.random() * 2) + 1;

							if (n == 1) {// 랜덤선택
								image8[count-1] = image16[ll];
								ll += 2;
								rr += 2;
								new lunch16r();
								dispose();
							} else if (n == 2) {//// 랜덤선택
								image8[count-1] = image16[rr];
								ll += 2;
								rr += 2;
								new lunch16r();
								dispose();
							}
						}
					}
				});

				btn2.addActionListener(new ActionListener() { // 오른쪽
					public void actionPerformed(ActionEvent e) {
						if (count < 8) {
							image8[count-1] =image16[rr];
							ll += 2;
							rr += 2;
							new lunch16r();
							dispose();
						} else if (count == 8) {
							image8[count-1] = image16[rr];
							ll = 0;
							rr = 1;
							count = 0;
							
							new lunch8r();
							dispose();
						}

					}
				});

				setSize(800, 600);
				setVisible(true);
			}

		}// class lunch16r

		class lunch8r extends JFrame { // 남자로 들어갔을때

			
			lunch8r() {

				count = count + 1; // 카운트 증가


				setTitle("점심 월드컵 8강");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				c = getContentPane();
				MyPanel3 panel = new MyPanel3();
				c.add(panel, BorderLayout.CENTER);// FlowLayout,

				JButton btn = new JButton(image8[ll]);// 왼쪽사진
				JButton btn1 = new JButton("랜덤선택");// 랜덤
				JButton btn2 = new JButton(image8[rr]);// 오른쪽사진

				panel.setLayout(null);

				btn.setLocation(37, 120);
				btn.setSize(280, 410);
				panel.add(btn);

				btn1.setFont(new Font("HY울릉도M", Font.PLAIN, 16));
				btn1.setLocation(345, 250);
				btn1.setSize(100, 30);
				panel.add(btn1);

				btn2.setLocation(468, 120);
				btn2.setSize(280, 410);
				panel.add(btn2);

				th=new Thread(runnable);
				timerLabel.setLocation(345,120);
				timerLabel.setSize(150,150);
				panel.add(timerLabel);
				th.start();//start()메소드 호출,스레드 작동시작
				timerLabel.setToolTipText("제한 시간입니다. 0초가 되면 Game Over 됩니다.");
				btn.addActionListener(new ActionListener() { // 왼쪽
					public void actionPerformed(ActionEvent e) { //
						if (count < 4) {
							image4[count - 1] = image8[ll];
							ll += 2;
							rr += 2;
							new lunch8r();
							dispose();
						} else if (count == 4) {
							image4[count - 1] = image8[ll];
							ll = 0;
							rr = 1;
							count = 0;
							new lunch4r();// 4r
							dispose();
						}
					}
				});

				btn1.addActionListener(new ActionListener() { // 랜덤선택
					public void actionPerformed(ActionEvent e) {
						if (count == 4) {// 카운터횟수,배열[3]
							int k = (int) (Math.random() * 2) + 1;

							if (k == 1) {// 랜덤선택
								image4[count - 1] = image8[ll];
								ll = 0;
								rr = 1;
								count = 0;
								new lunch4r();//
								dispose();

							} else if (k == 2) {//// 랜덤선택
								image4[count - 1] = image8[rr];
								ll = 0;
								rr = 1;
								count = 0;
								new lunch4r();// 4r
								dispose();
							}
						} else if (count < 4) {

							int n = (int) (Math.random() * 2) + 1;

							if (n == 1) {// 랜덤선택
								image4[count - 1] = image8[ll];
								ll += 2;
								rr += 2;
								new lunch8r();
								dispose();
							} else if (n == 2) {//// 랜덤선택
								image4[count - 1] = image8[rr];
								ll += 2;
								rr += 2;
								new lunch8r();
								dispose();
							}
						}
					}
				});

				btn2.addActionListener(new ActionListener() { // 오른쪽
					public void actionPerformed(ActionEvent e) {
						if (count < 4) {
							image4[count - 1] = image8[rr];
							ll += 2;
							rr += 2;
							new lunch8r();
							dispose();
						} else if (count == 4) {
							image4[count - 1] = image8[rr];
							ll = 0;
							rr = 1;
							count = 0;
							new lunch4r();// 4r
							dispose();
						}
					}
				});

				setSize(800, 600);
				setVisible(true);
			}
		}// 8r

		class lunch4r extends JFrame { 

			lunch4r() {

				count = count + 1; // 카운트 증가

				setTitle("점심 월드컵 4강");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				c = getContentPane();
				MyPanel4 panel = new MyPanel4();
				c.add(panel, BorderLayout.CENTER);// FlowLayout,

				JButton btn = new JButton(image4[ll]);// 왼쪽사진
				JButton btn1 = new JButton("랜덤선택");// 랜덤
				JButton btn2 = new JButton(image4[rr]);// 오른쪽사진

				panel.setLayout(null);

				btn.setLocation(37, 120);
				btn.setSize(280, 410);
				panel.add(btn);

				btn1.setFont(new Font("HY울릉도M", Font.PLAIN, 16));
				btn1.setLocation(345, 250);
				btn1.setSize(100, 30);
				panel.add(btn1);

				btn2.setLocation(468, 120);
				btn2.setSize(280, 410);
				panel.add(btn2);
				
				th=new Thread(runnable);
				timerLabel.setLocation(345,120);
				timerLabel.setSize(150,150);
				panel.add(timerLabel);
				th.start();//start()메소드 호출,스레드 작동시작
				timerLabel.setToolTipText("제한 시간입니다. 0초가 되면 Game Over 됩니다.");
				btn.addActionListener(new ActionListener() { // 왼쪽
					public void actionPerformed(ActionEvent e) { //
						if (count < 2) {
							image2[count - 1] = image4[ll];
							ll += 2;
							rr += 2;
							new lunch4r();
							dispose();
						} else if (count == 2) {
							image2[count - 1] = image4[ll];
							ll = 0;
							rr = 1;
							count = 0;
							new lunch2r();// 2r
							dispose();
						}
					}
				});

				btn1.addActionListener(new ActionListener() { // 랜덤선택
					public void actionPerformed(ActionEvent e) {
						if (count == 2) {// 카운터횟수,배열[3]
							int k = (int) (Math.random() * 2) + 1;

							if (k == 1) {// 랜덤선택
								image2[count - 1] = image4[ll];
								ll = 0;
								rr = 1;
								count = 0;
								new lunch2r();// 2r
								dispose();

							} else if (k == 2) {//// 랜덤선택
								image2[count - 1] = image4[rr];
								ll = 0;
								rr = 1;
								count = 0;
								new lunch2r();// 2r
								dispose();
							}
						} else if (count < 2) {

							int n = (int) (Math.random() * 2) + 1;

							if (n == 1) {// 랜덤선택

								image2[count - 1] = image4[ll];
								ll += 2;
								rr += 2;
								new lunch4r();
								dispose();
							} else if (n == 2) {//// 랜덤선택
								image2[count - 1] = image4[rr];
								ll += 2;
								rr += 2;
								new lunch4r();
								dispose();
							}
						}
					}
				});

				btn2.addActionListener(new ActionListener() { // 오른쪽
					public void actionPerformed(ActionEvent e) {
						if (count < 2) {
							image2[count - 1] = image4[rr];
							ll += 2;
							rr += 2;
							new lunch4r();
							dispose();
						} else if (count == 2) {
							image2[count - 1] = image4[rr];
							ll = 0;
							rr = 1;
							count = 0;
							new lunch2r();// 2r
							dispose();
						}
					}
				});

				setSize(800, 600);
				setVisible(true);
			}
		}// 4r

		class lunch2r extends JFrame { // 2r 

			lunch2r() {

				count = count + 1; // 카운트 증가

				setTitle("음식 월드컵");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				c = getContentPane();
				MyPanel5 panel = new MyPanel5();

				c.add(panel, BorderLayout.CENTER); // FlowLayout

				JButton btn = new JButton(image2[ll]);// 왼쪽사진
				JButton btn1 = new JButton("랜덤선택");// 랜덤
				JButton btn2 = new JButton(image2[rr]);// 오른쪽사진

				panel.setLayout(null);

				btn.setLocation(37, 120);
				btn.setSize(280, 410);
				panel.add(btn);

				btn1.setFont(new Font("HY울릉도M", Font.PLAIN, 16));
				btn1.setLocation(345, 250);
				btn1.setSize(100, 30);
				panel.add(btn1);

				btn2.setLocation(468, 120);
				btn2.setSize(280, 410);
				panel.add(btn2);

				th=new Thread(runnable);
				timerLabel.setLocation(345,120);
				timerLabel.setSize(150,150);
				panel.add(timerLabel);
				th.start();//start()메소드 호출,스레드 작동시작
				timerLabel.setToolTipText("제한 시간입니다. 0초가 되면 Game Over 됩니다.");
				btn.addActionListener(new ActionListener() { // 왼쪽
					public void actionPerformed(ActionEvent e) {

						image1[0] = image2[ll];

						ll = 0;
						rr = 0;
						count = 0;

						new winner();
						// new boy1r();//1r
						dispose();

					}
				});

				btn1.addActionListener(new ActionListener() { // 랜덤선택
					public void actionPerformed(ActionEvent e) {

						int n = (int) (Math.random() * 2) + 1;

						if (n == 1) {// 랜덤선택
							image1[0] = image2[ll];
							ll = 0;
							rr = 0;
							count = 0;
							new winner();
							// new boy1r();//1r
							dispose();
						}

						else if (n == 2) {//// 랜덤선택
							image1[0] = image2[rr];
							ll = 0;
							rr = 0;
							count = 0;
							new winner();
							// new boy1r();//1r
							dispose();
						}
					}
				});

				btn2.addActionListener(new ActionListener() { // 오른쪽
					public void actionPerformed(ActionEvent e) {

						image1[0] = image2[rr];
						ll = 0;
						rr = 0;
						count = 0;

						new winner();

						dispose();
					}
				});

				setSize(800, 600);
				setVisible(true);
			}
		}// 2r

		class winner extends JFrame {
			winner() {
				runnable.interrupt();
				th.interrupt();
				
				System.out.println("우승"+image1[ll]);
				setTitle("우승자");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				c = getContentPane();
				MyPanel7 panel = new MyPanel7();

				c.add(panel, BorderLayout.CENTER);
	

				ImageIcon startButton = new ImageIcon("images/처음으로.jpg");
				ImageIcon reButton = new ImageIcon("images/다시하기.jpg");
				ImageIcon exitButton = new ImageIcon("images/종료하기.jpg");

				JButton btn2 = new JButton(image1[ll]);// 최종사진

				JButton btn = new JButton(startButton);// 처음으로
				JButton btn1 = new JButton(exitButton); // 종료
				JButton btn3 = new JButton(reButton);// 다시하기

				panel.setLayout(null);

				btn2.setLocation(255, 122);// 위치
				btn2.setSize(280, 410);// 버튼크기 = 사진크기
				panel.add(btn2);

				btn.setLocation(600, 200);
				btn.setSize(100, 50);
				panel.add(btn);

				btn3.setLocation(600, 280);
				btn3.setSize(100, 50);
				panel.add(btn3);

				btn1.setLocation(600, 360);
				btn1.setSize(100, 50);
				panel.add(btn1);

				btn.addActionListener(new ActionListener() { // 처음
					public void actionPerformed(ActionEvent e) {
						new MainClass();
						dispose();
					}
				});
				btn1.addActionListener(new ActionListener() { // 종료
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					}
				});

				btn3.addActionListener(new ActionListener() { // 다시
					public void actionPerformed(ActionEvent e) {
	
						new PlayWorldCup();
						dispose();
					}
				});

				setSize(800, 600);
				setVisible(true);
			}
		}// 1r
	}