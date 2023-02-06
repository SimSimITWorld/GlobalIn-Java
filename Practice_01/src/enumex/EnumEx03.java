package enumex;

public class EnumEx03 {

	public static void main(String[] args) {
		
		System.out.printf("서울 인구 : %d\n",City.SEOUL.getIngu());
		
		for(City c : City.values()) {
			System.out.printf("%s(%s) 인구 : %d\n",c,c.getCityName(),c.getIngu());
		}
	}

}
