package Ex;

import javax.swing.ImageIcon;

public class LunchFoodClass2 extends PlayWorldCup{
LunchFoodClass2(){
	for (int nn = 0; nn < image16.length; nn++)// 이미지0~15배열 랜덤번호이미지 저장
	{
		image16[nn] = new ImageIcon("이과캠/" + r[nn] + ".png"); // 16개의 이미지 선출
	}	//이과캠 음식들만 폴더에 따로 저장
}
}
