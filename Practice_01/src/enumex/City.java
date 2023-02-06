package enumex;

public enum City {
	
	SEOUL("서울",1000),
	BUSAN("부산",350),
	DAEGU("대구",250),
	INCHEON("인천",200);
	
	private final String cityName;
	private final int Ingu;

	protected String getCityName() {
		return cityName;
	}

	protected int getIngu() {
		return Ingu;
	}

	City(String cityName, int Ingu) {
		this.cityName = cityName;
		this.Ingu = Ingu;
	}
	
}
