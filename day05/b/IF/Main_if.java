package my.day05.b.IF;

import java.util.Scanner;

public class Main_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		String input_str = "";
		
		try {
			System.out.println("■ 첫번째 정수 입력 =>");
			input_str = sc.nextLine();
			int num1 = Integer.parseInt(input_str); //문자열을 정수로 형변환시킨다
														// 10
														// 30000000
														// 똘똘이
			
			
			System.out.println("■ 두번째 정수 입력 =>");	
			input_str = sc.nextLine();
			int num2 = Integer.parseInt(input_str); //문자열을 정수로 형변환시킨다
														// 4
														// 50000000
														// 헤헤헤
			
			System.out.println("■ 사칙연산을 선택하세요(+ - */) : "); // + - * /
															// 우하하하
																// # 
																// 7
			
			 String operator = 	sc.nextLine();
			 String result = " ";
			 double calc_result = 0;
			
			 
			 if("+".equals(operator)) {
				 // num1 + num2;
				 calc_result = num1 + num2;
			 }
			 
			 else if ("-".equals(operator)) {
			 
				 calc_result = num1 - num2;
			 }	
			 else if("*".equals(operator)) {	
				 calc_result = num1 * num2;
			 }
			 else if("/".equals(operator)) {
				 calc_result = (double) num1 / num2;
				 
			 }

			 else {
				 // 사칙연산 선택시 + - * / 를 제외한 다른 것을 입력한 경우
				 System.out.println("[경고] 사칙연산 선택은 + - * /만 입력하세요!!");
				 sc.close();
				 return; //종료
			 }
		
			 // 10 + 4 = 14
			 
			 if("/".equals(operator)) {
				 if(num1 % num2 == 0)
					 
				 result = num1 + operator + num2 + "=" + calc_result;
				 	//10/4=2.5
			 }
			 
			
	 
			 else {
				 result = num1 + operator + num2 + "=" + calc_result;
			 }
			 
			 //operator 스프링type
			 
			 
			 	System.out.println(result);
			 	
			 	
			 	
			 	/* 
			 	 * 10 + 4 = 14
			 	 * 10 - 4 = 6
			 	 * 10 * 4 = 40
			 	 * 10 / 4 = 2.5
			 	 * */
			 	
			 	

		} catch(NumberFormatException e ) {
			System.out.println(">>> " + input_str + "은 올바른 데이터가 아닙니다");
			
		} catch(ArithmeticException e) {
			System.out.println(">>> 0으로 나눌 수 없습니다 <<< ");
		}
		
		sc.close();
		
	}

}
