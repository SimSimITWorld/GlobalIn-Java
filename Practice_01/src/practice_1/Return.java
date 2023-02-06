package practice_1;

public class Return {
	
	float divide(int x, int y) {
		if(y==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		}
		return x/(float)y;
	}

}
