package com.gameex;

public class Dictionary extends PairMap{

	protected int cnt = 0;
	
	public Dictionary() {}
	
	public Dictionary(int capacity) { // 생성자
		keyArray = new String[capacity];
		valueArray = new String[capacity];
		// 생성자에 배열 생성
	}

	@Override
	String get(String key) {
		// 현재 배열에 저장된 원소 개수만큼 반복하면 됨
		for(int i = 0;i<cnt;i++) {
			if(keyArray[i].equals(key)) 
				return valueArray[i];
		}
		// key 값이 없을 때 null을 리턴함
		return null; 
	}

	@Override
	void put(String key, String value) {
		int i = 0;
		// 현재 배열에 저장된 개수만큼 반복
		for(i = 0;i<cnt;i++) 
			if(keyArray[i].equals(key)) break;
		
		
		if(i == cnt) { // 키 값을 찾지 못했을 경우
			if(i<keyArray.length) { // 배열이 차지 않았을 경우에만 저장하고 cnt 증가함
			    keyArray[i]=key;
			    valueArray[i]=value;
			    cnt++;
			}
		}else { // 키 값을 발견했으나 값이 수정된 경우이므로 cnt는 증가하지 않음
			keyArray[i] = key;
			valueArray[i] = value;
		}
	}

	@Override
	String delete(String key) {
		int i = 0;
		// 현재 배열에 저장된 개수만큼 반복
		for(i = 0;i<cnt;i++) 
			if(keyArray[i].equals(key)) break;
		
		if(i==cnt) // 발견이 안되었을 경우
		    return null;
		
		String value = valueArray[i];
		
		// 앞으로 자리 이동한다.(감소)
		int last = cnt-1;
		
		for(int j = i;j<last;j++) {
			keyArray[j] = keyArray[j+1];
			valueArray[j] = valueArray[j+1];
		}
		cnt--;
		return value;
	}

	@Override
	int length() {
		
		return cnt;
	}

	

	
}
