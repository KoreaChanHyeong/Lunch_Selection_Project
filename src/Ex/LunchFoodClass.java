package Ex;

import javax.swing.ImageIcon;

public class LunchFoodClass extends PlayWorldCup{
LunchFoodClass(){
	for (int nn = 0; nn < image16.length; nn++)// 이미지0~15배열 랜덤번호이미지 저장
	{
		image16[nn] = new ImageIcon("음식/" + r[nn] + ".png"); // 0~15.png
	}
}
}
