package com.ascore;

public interface Score {

	// 추가
	public void insert();

	// 변경(수정)
	public void update();

	// 삭제
	public void delete();

	// 전체 목록
	public void list();

	// 학번으로 검색
	public void haksearch();

	// 이름으로 검색
	public void namesearch();
}
