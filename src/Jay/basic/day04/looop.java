package Jay.basic.day04;

public class looop {
	public static void main(String [] args) {
		// while
		// 특정조건을 만족할때까지 계속해서 주어진 명령을 수행
		// 초기식
		// while(조건식) {
		//		반족코드
		//		증감식
		//  }
		
		// 조건식이 처음부터 false면
		// while은 코드를 반복실행하지 않음
		//반면, do-while문은 일단 코드를 먼저 실행하고
		// 조건을 검사하기 때문에 조건식이 false라도
		// 최소 한번정도 코드를 실행할 수있음
		
		// ex) 1 ~ 10까지 정수출력
		int i = 1;              // 초기식
		while(i <= 10) {        // 조건이 참이면 반복실행
			System.out.print(i+" ");
			i += 1;              // 증감식
		}
		System.out.println("");   //줄바꿈용 코드
		
		// ex ) 1 ~ 50 사이 홀수출력
		i = 1;             //위에서 int i = 1 해서 int 생략
		while(i <= 50) {
			System.out.print(i+" ");
			i+= 2;
		}
		System.out.println("");   //줄바꿈용 코드
		
		// ex ) 1 ~ 50 사이 짝수출력
		i = 2;
		while(i <=50) {
			System.out.print(i+" ");
			i=i+2;
		}
		System.out.println(""); //줄바꿈용
		// ex ) 1 ~ 100 사이 총합 구해서 출력
		int sum = 0;
		i = 1;
		while(i <= 100) {
			sum +=i;
			++i;
			System.out.println(sum);
		}
		
		
		// 가우스 덧셈공식을 이용하면
		// 특정범위 내의 모든 수의 합을 편리하게 구할 수 있음
		// 총합 : sum, 시작범위: i, 끝범위 j
		// sum = (i + j) * j / 2
		i = 1;
		int j = 100;
		sum = (i +j) * j / 2;
			System.out.println(sum);
		
		// ex ) 1 ~ 99 사이 총합 구해서 출력
		// 단, 가우스 덧셈공식을 이용하세요
		i = 1;
		j = 98;
		sum = (i+j) *j/2+j+1;
		System.out.println(sum);
		
				
			
	}
}
