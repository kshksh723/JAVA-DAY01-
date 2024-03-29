package my.day07.c.random;

import java.util.Random;

public class Main_random_1 {

	public static void main(String[] args) {

//== 랜덤한 정수를 뽑아낸다 ===//
		//방법 1.
		double random = Math.random(); //return타입이 double 타입이다
		System.out.println("random=>" + random);
		/*
		 random => 0.3720606033227164
		 */
		
		/*
		 java.lang.Math.random() 메소드는
		 0.0이상 1.0 미만의 실수(double)값을 랜덤하게 나타내어주는 메소드이다.
		 	즉, 0.0 <= 임의의 난수(실수) < 1.0
		 	
		 	1 부터 10까지 중 랜덤한 정수를 얻어와 본다
		 		
		 		공식 
		 	랜덤한 정수 = 	(int)(Math.random()*구간범위) + 시작값;
		 	
		 		(int)(0.3720606033227164 * (10-1+1)) +1 ==> (int)(0.3720606033227164)+1  => 3+1 ==
		 		(int)(0.06645054565362352 * (10-1+1))+1==> (int) (0.6645054565362352)+1 => 6+1
		 		(int)(0.8388789648844754 * (10-1+1))+1 ==> (int) (0.8388789648844754)+1  => 8+1
		 		(int)(0.02354523453242345 * (10-1+1) +1 ==> (int) 0.2354523453242345)+1  => 0+1
		 		소수부 없앰
		 		
		 		
		 		----------------------------------------------------------------
		 			2 부터 5까지 중 랜덤한 정수를 얻어와 본다
		 		공식 
		 	랜덤한 정수 = 	(int)(Math.random()*구간범위) + 시작값;
		 		(int)(0.3720606033227164 * (5-2+1)) +2 ==> (int)(1.4882424132908656)+2  => 1+2 ==>3
		 		(int)(0.06645054565362352 * (5-2+1))+2==> (int) (0.26580218261449406)+2 => 0+2 = > 2
		 		(int)(0.8388789648844754 * (5-2+1))+2 ==> (int) (3.3555158595379018)+2  => 3+2 =>5
		 		(int)(0.02354523453242345 * (5-2+1) +2 ==> (int)( 0.0941809381296938)+2  => 0+2 => 2
		 		소수부 없앰
		 		0.0<= 임의의 난수(실수) < 1.0
		 	//System.out.println(0.02354523453242345 * (5-2+1));	
		 */
		
	
		// 랜덤한 정수 = 	(int)(Math.random()*구간범위) + 시작값;
	
		
	
		
		
		double rnd = Math.random();	//  equal to 0.0 and less than 1.0 //rnd가 왜 double 타입인가? // 실수도 나와서 double 타입임 
		int n1 = (int)( rnd * (10-1+1)) +1; // 1부터 10까지 중 랜덤
		int n2 = (int)( rnd * (7-3+1)) +3; // 3부터 7까지 중 랜덤
		char ch = (char)((int) (rnd*('z'-'a'+1)) + 'a'); // a부터 z까지 
		
			System.out.println("1부터 10까지 중 랜덤하게 발생한 값 :"+ n1);
			System.out.println("3부터 7까지 중 랜덤하게 발생한 값 :"+ n2);
			System.out.println("a부터 z까지 중 랜덤하게 발생한 값 :"+ ch);
			
			System.out.println("\n===== new Random()을 사용한 것 =====");
			
			// ==== 랜덤한 정수를 봅아낸다 === //
			//보안상 Math.random() 보다는 new Random();을 사용하는 것이 더 안전하다
			Random rdom = new Random(); // import해야함
			
			// 처음 얼마부터 마지막 얼마까지 랜덤한 정수
			// ==> rndom.nextInt(마지막수 - 처음수 +1)+ 처음수;
			
			n1 = rdom.nextInt(10 - 1 +1)+ 1; // 1부터 10까지 중 랜덤
			n2 = rdom.nextInt(10 - 1 +1)+ 1; //3부터 7까지 중 랜덤
			ch = (char)(rdom.nextInt('z' - 'a' + 1) +'a');  // int로 나오기때문에 char로 형변환하기
			System.out.println("1부터 10까지 중 랜덤하게 발생한 값 :"+ n1);
			System.out.println("3부터 7까지 중 랜덤하게 발생한 값 :"+ n2);
			System.out.println("a부터 z까지 중 랜덤하게 발생한 값 :"+ ch);
			
			

	
	}

}
