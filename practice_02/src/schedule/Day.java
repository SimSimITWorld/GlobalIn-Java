package schedule;

public class Day {

	private String work;

	public void setWork(String work) {
		this.work = work;
	}
	
	public void show() {
		if(work==null) 
			System.out.println("할 일이 없습니다.");
		else
			System.out.println(work + "입니다.");
	}
	
}
