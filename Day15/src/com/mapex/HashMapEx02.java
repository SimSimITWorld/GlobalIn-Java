package com.mapex;

import java.util.*;

public class HashMapEx02 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String,String>();
		
		map.put("aaaa", "1111");
		map.put("bbbb", "2222");
		map.put("cccc", "3333");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("ID 와 PW 입력 : ");
			String id = sc.next();
			String pw = sc.next();
			
			System.out.println();
			
			if(!map.containsKey(id)) { // 아이디가 존재하지 않으면
				System.out.println("입력하신 ID는 없는 아이디 입니다.");
				continue;
			}else { // 아이디가 존재하면 
				if(!(map.get(id)).equals(pw)){
					System.out.println("PW가 일치하지 않습니다. 다시 확인 후 입력해주세요.");
				}else {
					System.out.println("ID와 PW가 일치합니다.");
				//	login();
					break;
				}
			}
		}

		
	}

}
