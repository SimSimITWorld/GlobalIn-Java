package com.ascore;

import java.util.*;

public class ScoreImpl implements Score {

	static Scanner sc = new Scanner(System.in);
	private List<ScoreVO> list = new ArrayList<ScoreVO>();
	
	@Override
	public void insert() {
		System.out.println(" [자료 추가. ......]");
		System.out.print("학번 : ");
		String hak = sc.next();
		ScoreVO temp = search(hak);
		if(temp!=null) {
			System.out.println("[SYSTEM] - 이미 학번이 존재합니다.");
			return;
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("이름 : ");
		vo.setName(sc.next());
		System.out.print("생년월일 : ");
		vo.setBirth(sc.next());
		System.out.print("국어 : ");
		vo.setKor(sc.nextInt());
		System.out.print("영어 : ");
		vo.setEng(sc.nextInt());
		System.out.print("수학 : ");
		vo.setMat(sc.nextInt());
		list.add(vo);
		
		System.out.println("[SYSTEM] - 자료가 추가 되었습니다.");
	}

	@Override
	public void update() {
		System.out.println("\n [자료 수정. .......]");
		System.out.print("수정할 학번 : ");
		String hak = sc.next();
		ScoreVO temp = search(hak);
		if(temp==null) {
			System.out.println("[SYSTEM] - 등록된 자료가 없습니다.");
			return;
		}
		ScoreVO vo = new ScoreVO();
		System.out.print("이름 : ");
		vo.setName(sc.next());
		System.out.print("생년월일 : ");
		vo.setBirth(sc.next());
		System.out.print("국어 : ");
		vo.setKor(sc.nextInt());
		System.out.print("영어 : ");
		vo.setEng(sc.nextInt());
		System.out.print("수학 : ");
		vo.setMat(sc.nextInt());
		System.out.println("[SYSTEM] - 자료가 수정 되었습니다.");
		
	}

	@Override
	public void delete() {
		System.out.println("\n [자료 삭제......]");
		System.out.print("삭제할 학번 입력 : ");
		String hak = sc.next();
		ScoreVO temp = search(hak);
		if(temp==null) {
			System.out.println("[SYSTEM] - 등록된 자료가 없습니다.");
			return;
		}
		
		ScoreVO vo = new ScoreVO();
		list.remove(vo);
		System.out.println("[SYSTEM] - 자료가 삭제 되었습니다.");
		
	}

	@Override
	public void list() {
		System.out.println("\n [전체 출력]");
		Iterator<ScoreVO> it = list.iterator();
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo);
		}
		System.out.println();
		
	}

	@Override
	public void haksearch() {
		System.out.println("\n [학번 검색....]");
		System.out.print("검색할 학번 : ");
		String hak = sc.next();
		
		ScoreVO vo = search(hak);
		if(vo!=null) {
			System.out.print(vo);
			toString();
		}else {
			System.out.println("[SYSTEM] - 검색한 자료가 존재 하지 않습니다.");
		}
	}

	@Override
	public void namesearch() {
		System.out.println("\n [이름 검색.....]");
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		
		ScoreVO vo = search(name);
		if(vo!=null) {
			System.out.print(vo);
			toString();
		}else {
			System.out.println("[SYSTEM] - 검색한 자료가 존재 하지 않습니다.");
		}
		
	}
	
	public ScoreVO search(String hak) {
		ScoreVO vo = null;
		for(ScoreVO temp : list ) {
			if(temp.equals(hak)) {
				vo = temp;
				break;
			}
		}
		return vo;
	}

}
