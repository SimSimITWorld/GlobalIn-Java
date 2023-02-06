package practice_1;

public class Fight {

	String name;
	static int hp = 30;
	
	Fight(String name){
		this.name = name;
	}
	
	void Fight(Fight enermy) {
		int a = (int)((Math.random()*10)+1);
		enermy.hp -= a;
		System.out.printf("[%s]의 공격\n",this.name);
		System.out.printf("\t%s: %d/30\n",enermy.name,enermy.hp);
		if(enermy.hp<0) {
			enermy.hp =0;
			return;
		}
		
	}
}
