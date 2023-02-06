package study;

/* byte = 1byte 자료형이며, 입출력 범위 : -128 ~ 127
 * byte bb = -129
 */

public class ByteEx {

	public static void main(String[] args) {
		
		byte bb = -128;
		// java는 컴파일시 컴파일러가 에러를 발생 시킨다.
		// 단, 초기값일 경우
		// 증감연산자만 가능
		// ++ --;
		
		//bb=bb + 1
		bb--;
		System.out.println(bb);

	}

}
