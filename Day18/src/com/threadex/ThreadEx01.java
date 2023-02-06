package com.threadex;

class ThreadSub extends Thread{
	@Override
	public void run() {
		
		for(char ch = 'A';ch<='z';ch++) {
			System.out.println(ch);
			try {
				sleep(150);
			//	join();
			}catch(InterruptedException uu) {
				uu.printStackTrace();
			}
		}
	}
}

public class ThreadEx01 {

	public static void main(String[] args) {
		
		ThreadSub ts = new ThreadSub();
		ts.start();
		for(int i = 1;i<=60;i++) {
			System.out.println(i);
			try {
				Thread.sleep(150);
			}catch(InterruptedException uu) {
				uu.printStackTrace();
			}
		}

	}

}
