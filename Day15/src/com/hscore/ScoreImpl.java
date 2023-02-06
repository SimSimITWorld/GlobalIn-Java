package com.hscore;

import java.util.*;

public class ScoreImpl implements Score {

	// private Vector<ScoreVO> list = new Vector<ScoreVO>();
	// private Map<String, ScoreVO> map = new HashMap<String, ScoreVO>();
	
	private Map<String, ScoreVO> map = new TreeMap<String, ScoreVO>();
	
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void insert() {
		System.out.println("\n [자료 추가. .......]");
		
		String hak;
		System.out.print("학번 : ");
		hak = sc.next();
		
		/*
		ScoreVO temp = readScore(hak);
		if(temp != null) {
			System.out.println("[SYSTEM] - 이미 등록된 학번입니다.\n");
			return;
		}
		*/
		if(map.containsKey(hak)) {
			System.out.println("[SYSTEM] - 이미 등록된 학번입니다..\n");
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
		
		// list.add(vo);
		map.put(hak, vo);
		
		System.out.println("[SYSTEM] - 자료가 추가 되었습니다. \n");
	}

	@Override
	public void update() {
		
		System.out.println("\n 자료 수정 .......");
		String hak;
		System.out.print("수정할 학번 : ");
		hak = sc.next();
		
		/*
		 ScoreVO vo = readScore(hak);
		 
		 if(vo ==null){
		     System.out.println("등록된 학번이 없습니다. \n");
		     return;
		 }    
		 */
		
		if(!map.containsKey(hak)) {
			System.out.println("등록된 학번이 없습니다.");
			return;
		}
		
		ScoreVO vo = map.get(hak);
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
		
		// list.add(vo);
		map.put(hak, vo);
		
		System.out.println("[SYSTEM] - 자료가 추가 되었습니다. \n");
		
	}

	@Override
	public void delete() {
		
		System.out.println("\n [자료 삭제......]");
		String hak;
		
		System.out.print("삭제할 학번 입력 : ");
		hak = sc.next();
		
		/*
        ScoreVO vo = readScore(hak);
		
		if(vo==null) { // 자료가 벡터에 없을 때
			System.out.println("[SYSTEM] - 등록된 자료가 없습니다. \n");
			return;
		}
		*/
		if(!map.containsKey(hak)) {
			System.out.println("등록된 학번이 없습니다.");
			return;
		}
		
	//	ScoreVO vo = map.get(hak);
		
		map.remove(hak);
		
		System.out.println("[SYSTEM] - 자료가 삭제 되었습니다. \n");
		
	}

	@Override
	public void listAll() {
		System.out.println("\n [전체 출력]");
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = map.get(hak);
			System.out.println(vo.toString());
		}
		System.out.println();
	}

	
	@Override
	public void searchHak() {
		
		System.out.println("\n [학번 검색......]");
		
		String hak;
		System.out.print("검색할 학번 : ");
		hak = sc.next();
		
		if(!map.containsKey(hak)) {
			System.out.println("등록된 학번이 없습니다.");
			return;
		}
		
		ScoreVO vo = map.get(hak);
		
		if(vo != null) {
			System.out.println(vo.toString());
			/*
			System.out.println(vo.getHak()+"\t");
			System.out.println(vo.getName()+"\t");
			System.out.println(vo.getBirth()+"\t");
			System.out.println(vo.getKor()+"\t");
			System.out.println(vo.getEng()+"\t");
			System.out.println(vo.getMat()+"\t");
			System.out.println(vo.getTot()+"\t");
			System.out.println(vo.getTot()/3);
			*/
		}	
		else
		    System.out.println("[SYSTEN] - 검색한 자료가 존재 하지 않습니다.");
	}
	
	@Override
	public void searchName() {
		
		System.out.println("\n [이름 검색......]");
		
		String name;
		System.out.print("검색할 이름 : ");
		name = sc.next();
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = map.get(hak);
			if(vo.getName().startsWith(name)) {
				System.out.println(vo);
			}
		}
		
		/*
		for(ScoreVO vo : list) {
			if(vo.getName().startsWith(name)) {
				System.out.println(vo);
			}
		}
		*/
		
		System.out.println();
	}
	
	// 벡터안에 있는 정보를 읽어오는 기능 readScore(String hak)
	
/*
	public ScoreVO readScore(String hak) {
		ScoreVO vo = null;
		
		for(ScoreVO temp : list) {
			if(temp.getHak().equals(hak)) {
				vo = temp;
				break;
			}
		}
		
		return vo;
	}
*/	
	
	

}
