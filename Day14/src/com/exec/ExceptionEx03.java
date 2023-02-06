package com.exec;

import java.io.FileNotFoundException;

public class ExceptionEx03 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {	
			System.out.println(3/0);
		}catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
		}catch(ClassCastException cc) {
			System.out.println(cc.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println(6);
		}

		/*
		 * printStackTrace()
		 *   - 예외가 발생 했을 때 호출스택(Call Stack)에 있었던 메소드의 정보와
		 *     예외 메세지를 출력하는 메소드
		 *     
		 * getMessage()
		 *   - 발생한 예외 클래스의 인스턴스에 저장된 예외 메세지를 얻을 수 있는 메소드

		 */
	
	}
}
