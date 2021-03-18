package Jay.basic.day03;

public class EX02 {
	public static void main(String[] args) {
		// 7
		System.out.println(" 가. " + (3 + 4.5 * 2 + 27 / 8));
		System.out.println(" 나. " + (true || false && 3 <4 || !(5==7)));
		//System.out.println(" 다. " + (ture || (3 < 5 && 6 >= 2)));
		
		//System.out.println(" 라. " + (!ture > 'A')); 
		// 잘못된 비교대상으로 오류
		
		
		// 단일문자를 수식에사용하면
		// 자동으로 숫자형으로 바뀜
		// 숫자형으로 변환시 ASCII코드값을 참조함
	    // 0 : 48 , A : 65 , a :97 
		//
		System.out.println(" 마. " + (7 % 4 + 3 - 2 / 6 * 'Z'));
		System.out.println(" 바. " + ('D' + 1 + 'M' % 2/3));
		System.out.println(" 사. " + (5.0 /3 + 3 /3));
		System.out.println(" 아. " + (53 % 21 < 45 / 18));
		//System.out.println(" 자. " + ((4<6)||ture && false|| false && (2>3)));
		System.out.println(" 차. " + (7 - (3 + 8 * 6 + 3)-(2 + 5 * 2)));
		
		
		// 8
		System.out.print("may 13,1988 fell on day number");
		
		//특정연도-1의 12월31일의 요일 출력
		//0:일, 1:월, ... , 6:토
		//따라서, 특정연도의 1월 1일의 요일 출력하려면
		//계산식 결과에 +1을 해주면 됌
		System.out.println( ( (13 + (13 * 3 - 1) / 5 + 2021 % 100  
	            + 2021 % 100 / 4 + 2021 / 400
	            - 2 * (2021 / 100) ) % 7 + 7) % 7 );
		System.out.print(" Check out this line");
		System.out.println(" //hello there" + '9' + 7);
		System.out.print('H' + 'I' + "is" + 1 + "more example");
		// H와 I 사이 산술연산자로 인해
		// H와 I가 숫자형으로 변환되어 연산이 수행됨
		System.out.print( 'H' + 6.5 + 'I' + " is " + 1 + "more example" );
		
		//System.out.print("print both of us","Me too"");
		System.out.print("Reverse" +'I' + 'T');
		//System.out.print("No! Here is" +1 "more example);
		System.out.print("Here is" + 1 + "more example");
		System.out.println("Here is"+ 10*10);//that's 100");
		System.out.println("Not x is" + true); //that's ture);
		//System.out.print();
		//출력할 대상이 지정되지 않았으므로 오류발생!
		
		//System.out.println;
		//괄호가필요
		//System.out.print("How about this one"++'?'+ 'Huh');
		//문자열에 사용할수없는 증감연산자를 사용했음
		
		
		// 증감연산자
		// 피연산자의 값을 하나 증가시키거나 감소시킴
		// 피연산자의 어느쪽에 위치하는가에 따라 연산의 순서가 달라짐
		// i = 1 => i = i + 1 => i + = 1 => ++i
		//       => i = i + 3 => i + = 3
		int a = 7, b = 7;
		int result3 = ++a + 10; // a값을 증가시킨후 연산참여(전치)
		int result4 = a++ + 10; // a값 연산에 적용한 후 값 증가(후치)
		System.out.println("++a + 10 = " + result3);
		System.out.println("b++ + 10 = " + result4);
		
	}
}
