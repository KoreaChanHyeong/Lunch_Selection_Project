package Ex;

import javax.swing.ImageIcon;

public class LunchFoodClass extends PlayWorldCup{
	LunchFoodClass(){
		for (int nn = 0; nn < image16.length; nn++)// 이미지0~15배열 랜덤번호이미지 저장
			image16[nn] = new ImageIcon("문과캠/" + r[nn] + ".png"); // 16개의 이미지 선출
	}	//문과캠 음식들만 폴더에 담아 저장
}
