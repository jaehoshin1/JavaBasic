package Jay.basic.day05;
import java.util.Scanner;

// 성적처리프로그램 v2b
// 반복문을 이용해서 성적데이터입력을 계속 수행함

public class SungjukV2b {
	public static void main(String[] args) {
		// 변수선언
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		char grd;
		String fmt ="%s, %d, %d, %d /n" +
					"%d, %.1f, %c/n";
		
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(i<=3) {  // while문의 조건식을 ture로 설정하면
			           // 끝없이 unlimit하게 코드를 계속 실행함
		
		// 성적처리
		System.out.print("이름은?");
		name = sc. next();
		System.out.print("국어는?");
		kor = sc.nextInt();
		System.out.print("영어는?");
		eng = sc.nextInt();
		System.out.print("수학은?");
		mat = sc.nextInt();
		
		tot = kor + eng + mat;
		avg = (double)tot / 3;
		
		// 학점 계산을 if문으로 작성한다면?
		grd = '가';
		if(avg >= 90) grd = '수' ;
		else if (avg >= 80) grd = '우';
		else if (avg >= 70) grd = '미';
		else if (avg >= 60) grd = '양';
		else if (avg >= 50) grd = '가';
		
		
		// 학점 계산을 switch문으로 작성한다면?
		// avg : 99.9 => (int)avg : 99
		switch((int)avg / 10) {
			case 10:
			case 9 : grd = '수'; break;
			case 8 : grd = '우'; break;
			case 7 : grd = '미'; break;
			case 6 : grd = '양'; break;
			default: grd = '가';
		}
		
		// 결과출력
		System.out.printf(fmt, name, kor , eng, mat, tot, avg, grd);
		// 반복 증감식
		++i;
		} //while
	} //main
} // class