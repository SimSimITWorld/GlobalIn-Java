package com.gameex;

public class Dictionary extends PairMap {

	protected int cnt = 0;
	
	public Dictionary() {}
	
	public Dictionary(int capacity) {
		keyArray = new String[capacity];
		valueArray = new String[capacity];
	}
	
	@Override
	String get(String key) {
		for(int i=0;i<cnt;i++) {
			if(keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return null;
	}

	@Override
	void put(String key, String value) {
		int i = 0;
		
		for(i=0;i<cnt;i++) { 
			if(keyArray[i].equals(key)) break;
		}
		
		if(i==cnt) {
			if(i<keyArray.length) {
				keyArray[i] = key;
				valueArray[i] = value;
				cnt++;
			}
		}else {
			keyArray[i] = key;
			valueArray[i] = value;
		}
			
	}

	@Override
	String delete(String key) {
		int i = 0;
		
		for(i =0;i<cnt;i++) 
			if(keyArray[i].equals(key)) break;
		
		if(i==cnt)
			return null;
		
		String value = valueArray[i];
		
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
