package com.gameex;

/*
 * 문2]
    Converter 클래스를 상속받아 원화를 달러로 변환하는 Won2Dollar 클래스를 작성하시오.

    main()
      
      public static void main(String[] args) {
      
      Won2Dollar toDollar = new Won2Dollar(1200); // $ 1 를 1200 으로 가정한다.
      toDollar.run();
}
    

  출력결과
  원을 달러로 바꿉니다.
  원을 입력하세요 : 24000
  변환 결과 : 20.0달러입니다.
 */

public class Won2Dollar extends Converter{
	
	public Won2Dollar(int exchange) {
		super.exchange = exchange;
	}

	public static void main(String[] args) {

		Won2Dollar toDollar = new Won2Dollar(1200); // $ 1 를 1200 으로 가정한다.
		toDollar.run();

	}

	@Override
	String kor_money() {
		return "원";
	}

	@Override
	String eng_money() {
		return "달러";
	}

	@Override
	double exchange(double money) {
		return money/exchange;
	}

}
