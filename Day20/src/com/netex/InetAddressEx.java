package com.netex;

import java.net.*;

public class InetAddressEx {

	public static void main(String[] args) {
		
		/* 
		 *  InetAddress :	IP 정보와 HOST 정보를 가지는 객체다.
		 *   					InetAddress 객체는 생성자가 아닌 static 메소드를 이용해서 생성한다.
		 */
		
		
		try {
			
			InetAddress ipInfo1 = InetAddress.getByName("localhost");
			
			String ip = ipInfo1.getHostAddress();
			System.out.println("ip주소 : " + ip);
			
			InetAddress[] ipArray = InetAddress.getAllByName("www.google.com");
			
			for(InetAddress ipp : ipArray) {
				System.out.println(ipp);
			}
			
			
			// 현재 컴퓨터의 IP 정보
			InetAddress myHost = InetAddress.getLocalHost();
			System.out.println("host : " + myHost.getHostName());
			System.out.println("host ip : " + myHost.getHostAddress());
			
			
		}catch(UnknownHostException ue) {
			ue.printStackTrace();
		}finally {
			
		}

	}

}
