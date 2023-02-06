package homework;

public class Card {
	
	final int card = 52;
	static String[] name;
	static String[] num;
	static String[] joker;
	
	public void _str_() {};
	
}

class Deck extends Card{
	
	String result;
	void input() {
		super.name = new String[]{"클럽","다이아몬드","하트","스페이드"};
		super.num = new String[]{"2","3","4","5","6","7","8","9","10"};
		super.joker = new String[]{"에이스","잭","퀸","킹"};
	}
	@Override
    public void _str_() {
		System.out.print("[");
		for(int i = 0;i<name.length;i++) {
			int a = 0;
			for(int j = 0;j<num.length+joker.length;j++) {
				if(j==0) 
					System.out.print("'"+name[i]+" "+joker[0]+"' ,");
				else if(j==10)
					System.out.print("'"+name[i]+" "+joker[1]+"' ,");
				else if(j==11)
					System.out.print("'"+name[i]+" "+joker[2]+"' ,");
				else if(i!=name.length-1 && j==12)
					System.out.print("'"+name[i]+" "+joker[3]+"' ,");
				else if(i==name.length-1 && j==12)
					System.out.print("'"+name[i]+" "+joker[3]+"']");
				else if(j<10) {
					System.out.print("'"+name[i]+" "+num[a]+"' ,");
					a++;
				}
					
				
			}
			System.out.println();
		}
		
	}
	
	
	
	
}



