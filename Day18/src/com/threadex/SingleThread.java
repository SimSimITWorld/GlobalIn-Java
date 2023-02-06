package com.threadex;

public class SingleThread extends Thread {

	private int[] temp;
	
	public SingleThread(String threadname) {
		super(threadname);
		temp = new int[10];
		for(int start = 0;start<temp.length;start++) {
			temp[start] = start;
		}
		
	}
	
	
	@Override
	public void run() {
		
		for(int start : temp) {
			try {
				sleep(1000);
			}catch(InterruptedException uu) {
				uu.printStackTrace();
			}
			System.out.printf("스레드 이름 : %s, ", currentThread().getName());
			System.out.printf("temp value : %d%n", start);
		}
		super.run();
	}
	
	public static void main(String[] args) {
		SingleThread st = new SingleThread("홍길동");
		st.start();

	}

}
