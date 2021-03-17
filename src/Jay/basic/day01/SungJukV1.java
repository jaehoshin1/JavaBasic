package Jay.basic.day01;

/**
 * 
 * @author Jay
 * @category javabasic
 * @version 1.0
 * 자바프로그램 기초 - 성적처리프로그램
 * 
 * 입력 : 이름,국어,영어,수학
 * 처리 : 총점,평균,학점
 * 출력 : 이름,국어,영어,수학, 총점,평균,학점
 *
 */
public class SungJukV1 {
	public static void main(String[] args) {
		//변수선언
		String name;
		int korean;
		int english;
		int math;
		int total;
		double avg;
		char grd;
		
		//처리
		name = "홍길동";
		korean = 95;
		english = 78;
		math = 84;
		
		//tot = 95 =78 =84;
		total = korean + english + math;
		
		//avg = (korean +english + math) /3;
		avg = total / 3;
		
		grd ='가';
		
		// 결과 출력
		System.out.print("이름 : ");
		System.out.println(name);
		System.out.print("국어 : ");
		System.out.println(korean);
		System.out.print("영어 ");
		System.out.println(english);
		System.out.print("총점 : ");
		System.out.println(total);
		System.out.print("평균 : ");
		System.out.println(avg);
		
	}
}
