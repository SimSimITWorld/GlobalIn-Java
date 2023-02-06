package com.threadex;

public class ATM implements Runnable {

	private long depositeMoney = 10000;

	public long getDepositeMoney() {
		return depositeMoney;
	}

	@Override
	public void run() {

		synchronized (this) {

			for (int i = 0; i < 10; i++) {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException ii) {
					ii.printStackTrace();
				}

				if (getDepositeMoney() <= 0)
					break;
				// 0이 아니면 출금 가능
				withDraw(1000);

				if (getDepositeMoney() % 2000 ==0) {
					try {
						this.wait();
					} catch (InterruptedException ii) {
						ii.printStackTrace();
					}
				} else {
					this.notify();
				}

			}
		}
	}

	public void withDraw(long howMuch) {
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + " ");
			System.out.printf("잔액 : %d원%n", getDepositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName() + " ");
			System.out.println("잔액이 부족합니다.");
		}
	}

}
