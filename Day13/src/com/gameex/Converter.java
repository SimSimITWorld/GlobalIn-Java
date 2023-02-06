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


import java.util.*;

public abstract class Converter {

	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio; // 비율
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString() + "을" + getDestString() + " 로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요 : ");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("변환결과 : " + res + getDestString() + "입니다.");
	}
}
