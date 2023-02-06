package com.gameex;

public class IPTV extends ColorTV {

	private String ipAddr;
	
	public IPTV(String ipAddr, int size, int Color) {
		super(size, Color);
		this.ipAddr = ipAddr;
	}

	@Override
	public void prt() {
		System.out.print("IP 주소 : " + ipAddr + " 주소의 ");
		super.prt();
	}
	
	public static void main(String[] args) {
		
		IPTV iptv = new IPTV("192. 1. 1. 2", 32, 2048);
		
		iptv.prt();

	}

}
