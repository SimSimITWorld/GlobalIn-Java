package com.gameex;

/*
 * 문3]

    Converter 클래스를 상속받아 Km를 mile(마일)로 변환하는 Km2Mile 클래스를 작성하시오.

    main()
      
      public static void main(String[] args) {
      
      Km2Mile toMile = new Km2Mile(1.6); // 1 마일은 1.6Km임.
      toMile.run();
}

  출력결과
  
  Km를 Mile로 바꿉니다.
  Km를 입력하세요. >> 30
  변환결과 : 18.75mile입니다.
 */

public class Km2Mile extends Converter {

	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return "Km";
	}

	@Override
	protected String getDestString() {
		return "Mile";
	}

    public static void main(String[] args) {
		
	    Km2Mile toMile = new Km2Mile(1.6); // 1 마일은 1.6Km임.
        toMile.run();

	}
}
