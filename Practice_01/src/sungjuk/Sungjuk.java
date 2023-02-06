package sungjuk;

/* 
 *  학생별로 국, 영, 수 점수를 입력받아
 *  총점, 평균, 석차를 계산하는 프로그램
 *  
 *  단, 클래스를 활용하고 배열을 같이 활용한다.
 *  
 *  클래스 구성
 *  
 *  1. Record 클래스 : 속성만 존재하는 클래스로 구성
 *                           이름, 국어, 영어, 수학, 총점, 평균, 석차
 *  
 *  
 *  2. Sung 클래스 : 
 *             인원수를 입력받아, 입력받은 인원수만큼 이름, 국어, 영어, 수학 점수 입력
 *             이름, 국어, 영어, 수학 점수를 입력받고
 *             총점, 평균, 석차를 계산하는 클래스
 *             
 *             속성 : 인원수, Record 객체배열
 *             기능 : 인원수 입력, 상세 데이터 입력 --> 입력 메소드
 *                     총점, 평균, 석차 계산 --> 계산 메소드(연산처리)
 *                     결과를 출력 --> 출력 메소드
 *  
 *  3. main 메소드를 포함한 실행 클래스
 *     Sungjuk
 * 
 */
import java.util.*;
public class Sungjuk {

	static Scanner sc = new Scanner(System.in);
	int unit;
	Record[] name;
	
	void unit() {
		do {
			System.out.print("인원수 입력(1 ~ 100) : ");
			unit = sc.nextInt();
		}while(unit<1 || unit>100);
		name = new Record[unit];
	}
	
	void input() {
		for(int i = 0;i<name.length;i++) {
			name[i] = new Record();
			System.out.print((i+1) + "번째 이름 입력 : ");
			name[i].name = sc.next();
			System.out.print("국어점수 : ");
			name[i].kor = sc.nextInt();
			System.out.print("영어점수 : ");
			name[i].eng = sc.nextInt();
			System.out.print("수학점수 : ");
			name[i].mat = sc.nextInt();
			name[i].sum = name[i].kor + name[i].eng + name[i].mat;
			name[i].avg = (double)name[i].sum/3.0;
		}
		
		for(int i = 0;i<name.length;i++) {
			for(int j = 0;j<name.length;j++) {
				if(name[i].avg<name[j].avg)
					name[i].rank++;
			}
		}
	}
	
	void show() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t\t석차");
		for(int i = 0;i<name.length;i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%6.2f\t%2d\n",name[i].name,name[i].kor,name[i].eng,name[i].mat,name[i].sum,name[i].avg,name[i].rank);
		}
	}
	
}
