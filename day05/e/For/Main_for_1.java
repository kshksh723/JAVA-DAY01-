package my.day05.e.For;

import java.util.Iterator;

/*
 **** 반복문(loop) ==> for 문 ****
  
    ※ for 문의 형식
   
    for(초기화; 조건식; 증감식) {
          반복해서 실행할 문장;
    }  
    
    ▣ 순서
    1) 초기화;
    2) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.)
    3) 증감식
    4) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.) 
    5) 증감식
    6) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.)                                                  
    
*/

public class Main_for_1 {

	public static void main(String[] args) {
		 
		for(int i=0; i<10; i++) {
	          System.out.println("1.안녕자바~~");			// 조건이 거짓이라면 sysout문장을 실행하지 않음, 바로 빠져나옴
	          // 증감식 다음 조건식임, i가 9까지 감, i는 0~9
	    }  // 10이되면 거짓이라서 여길 빠져나와서 sysout (프로그램 종료)로 들어감
		
	    // int i -> index의 i
		
		/*
		 1.안녕 자바~
		 2.안녕 자바~
		 3.안녕 자바~
		 4.안녕 자바~
		 5.안녕 자바~
		 6.안녕 자바~
		 7.안녕 자바~
		 8.안녕 자바~
		 9.안녕 자바~
		 10.안녕 자바~ -> 이렇게 하려면 System.out.println((i+1)+"1.안녕자바~~")); 이렇게 하면 됌	
		 */
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i = 0; i<10; i+=1) { //i+1;은 i=i+1;와 같다
			System.out.println((i+1)+"1.안녕자바~~");
			
		}
		
		
		
		/*
		 1.안녕 JAVA~
		 2.안녕 JAVA~
		 3.안녕 JAVA~
		 4.안녕 JAVA~
		 5.안녕 JAVA~
		 6.안녕 JAVA~
		 7.안녕 JAVA~
		 8.안녕 JAVA~
		 9.안녕 JAVA~
		 10.안녕 JAVA~ 	
		 */
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		/*
		 1.안녕 이클립스~		 
		 3.안녕 이클립스~		
		 5.안녕 이클립스~	
		 7.안녕 이클립스~
		 9.안녕 이클립스~
		 
		 */
		
		//홀수만 하고 싶을 때
		for(int i = 0; i<10; i++) {
			System.out.println(++i +".안녕 이클립스~~");
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		for(int i = 0; i<10; i+=2) { //i+2;은 i=i+2;와 같다
			System.out.println((i+1)+"1.안녕자바~~");
		}
		/*
		 1.안녕 eclipse~		 
		 3.안녕 eclipse~		
		 5.안녕 eclipse~	
		 7.안녕 eclipse~
		 9.안녕 eclipse~
		 
		 */
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0,j=0; i<10; i++, j+=2) {
			System.out.println((j+1)+".안녕 오라클~~");
			/*
			 	1.안녕 오라클~~
				3.안녕 오라클~~
				5.안녕 오라클~~
				7.안녕 오라클~~
				9.안녕 오라클~~
				11.안녕 오라클~~
				13.안녕 오라클~~
				15.안녕 오라클~~
				17.안녕 오라클~~
				19.안녕 오라클~~
			 */
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=10; i>0; i--) {
			System.out.println(i+".안녕 Oracle");
		} // 감소
		/*
		 * 10.안녕 Oracle
			9.안녕 Oracle
			8.안녕 Oracle
			7.안녕 Oracle
			6.안녕 Oracle
			5.안녕 Oracle
			4.안녕 Oracle
			3.안녕 Oracle
			2.안녕 Oracle
			1.안녕 Oracle
		 */
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=10; i>0; i-=1) { //i-=1;은 i=i=i-1;와 같다
			System.out.println(i+".안녕 스프링");
		} 
/*
 			10.안녕 스프링
			9.안녕 스프링
			8.안녕 스프링
			7.안녕 스프링
			6.안녕 스프링
			5.안녕 스프링
			4.안녕 스프링
			3.안녕 스프링
			2.안녕 스프링
			1.안녕 스프링
 */
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=10; i>0; i--) // 10번반복
		{
			if(i%2 != 0) { //i%2은 i를 2로 나누었을 때의 나머지를 나타내는 것 , 홀수
			System.out.println(i+".안녕 Spring~~");
			System.out.println("하하하");
		} // 해당 명령어가 하나밖에 없을 땐 괄호 안적어도 됌
	}
	/*
	 * 9.안녕 Spring~~ 
	 * 7.안녕 Spring~~ 
	 * 5.안녕 Spring~~ 
	 * 3.안녕 Spring~~ 
	 * 1.안녕 Spring~~
	 */
		
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=10; i>0; i-=2) //5번 반복
		{
			System.out.println((i-1)+".안녕하십니까?~~~~");
		} 	
		/*
		 * 9.안녕 Spring~~ 
		 * 7.안녕 Spring~~ 
		 * 5.안녕 Spring~~ 
		 * 3.안녕 Spring~~ 
		 * 1.안녕 Spring~~
		 */	
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=10; i>0; i--) {
			System.out.println((--i)+".Hello~~~"); //i-- + ".Hello~~"라며고하면 10을 찍어준다음 1 감소가 된다! 전위 후위 조심해야함 .. ((--i)+".Hello~~~")이거랑 다름
		}
		/*
		 * 9.Hello~~ 
		 * 7.Hello~~ 
		 * 5.Hello~~ 
		 * 3.Hello~~ 
		 * 1.Hello~~
		 */	
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0,j=9; i<5; i++, j--) //5번 반복
		{ 
			System.out.println((j-1)+".헬로~~");
		}		
		/*
		 * 9.헬로~~ 
		 * 7.헬로~~ 
		 * 5.헬로~~ 
		 * 3.헬로~~ 
		 * 1.헬로~~
		 */	
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		int i=0; //초기화
		for (; i<5; i++)// i : 지역변수, int i=0 괄호 안에서 할 필요 없음, 5번반복 for문 빠져나올 때 5가 되어짐 , 
		{ 
			System.out.println((i+1)+".길동");
		} // end of for-----
		
		System.out.println("반복문을 빠져나온 i값 : " + i);
		//반복문을 빠져나온 i값 : 5
		
		// switch의 brak와 반복문의 break는 다르다
		
		
		
		
		
		System.out.println(">> 프로그램 종료<<");

	}

}
// 프로그래밍 상에서 가장 중요한 건 if와 반복문(for), switch문 중요함
//if를 모르면 안됌