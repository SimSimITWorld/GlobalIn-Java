package practice_1;

public class Animals {
	void a() {
		System.out.println("짖어봐");
	}
}

class dog extends Animals{
	@Override
	void a() {
		System.out.println("멍멍");
	}
	int b = 3;
}

class cat extends Animals{
	@Override
	void a() {
		System.out.println("야옹");
	}
}

