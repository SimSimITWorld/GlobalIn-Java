package com.vscore;

import java.util.*;

public class ScoreImpl implements Score {

	Vector<ScoreVO> list = new Vector<ScoreVO>();
	private static Scanner sc = new Scanner(System.in);
	
	@Override
	public void insert() {
		System.out.println(" [자료 추가. ......]");
		String hak;
		System.out.print("학번 : ");
		hak = sc.next();
		
		ScoreVO vo = readHak(hak);
		
		if(vo!=null) {
			System.out.println("[SYSTEM] - 이미 등록된 학번입니다.");
			return;
		}
		
		ScoreVO t = new ScoreVO();
		System.out.print("이름 : ");
		t.setName(sc.next());
		System.out.print("생년월일 : ");
		t.setBirth(sc.next());
		System.out.print("국어 : ");
		t.setKor(sc.nextInt());
		System.out.print("영어 : ");
		t.setEng(sc.nextInt());
		System.out.print("수학 : ");
		t.setMat(sc.nextInt());
		list.add(t);
		System.out.println("[SYSTEM] - 자료가 추가 되었습니다.\n");
	}

	@Override
	public void update() {
		
		System.out.println(" [자료 수정. .......]");
		String hak;
		System.out.print("수정할 학번 : ");
		hak = sc.next();
		
		ScoreVO vo = readHak(hak);
		if(vo==null) {
			System.out.println("[SYSTEM] - 등록된 자료가 없습니다.\n");
			return;
		}
		ScoreVO t = new ScoreVO();
		System.out.print("이름 : ");
		t.setName(sc.next());
		System.out.print("생년월일 : ");
		t.setBirth(sc.next());
		System.out.print("국어 : ");
		t.setKor(sc.nextInt());
		System.out.print("영어 : ");
		t.setEng(sc.nextInt());
		System.out.print("수학 : ");
		t.setMat(sc.nextInt());
		list.add(t);
		System.out.println("[SYSTEM] - 자료가 수정 되었습니다.\n");
		
		
	}

	@Override
	public void delete() {
		
		String hak;
		System.out.println(" [자료 삭제. ......]");
		System.out.println("삭제할 학번 입력 : ");
		hak = sc.next();
		
		ScoreVO vo = readHak(hak);
		if(vo!=null) {
			
		}
		
	}

	@Override
	public void listAll() {
		
		
	}

	@Override
	public void searchHak() {
		
		
	}

	@Override
	public void searchName() {
		
		
	}

	public ScoreVO readHak(String hak) {
		ScoreVO vo = null;
		
		for(ScoreVO t : list) {
			if(t.getHak().equals(hak)) {
				vo = t;
				break;
			}
		}
		return vo;
	}
	
}
