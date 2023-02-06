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

public class SungjukMain {

	public static void main(String[] args) {
		
		Sungjuk score = new Sungjuk();
		score.unit();
		score.input();
		score.show();

	}

}
