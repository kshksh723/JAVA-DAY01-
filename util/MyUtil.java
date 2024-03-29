package my.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class MyUtil {
	
	// === 현재 시각을 출력해주는  static 메소드를 생성한다. === //
	public static void current_time_print() {
		// static이 없으면 instance 메소드
		
		Date now = new Date(); // 현재 시각
		
		SimpleDateFormat sdfmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("== 현재시각 : " + sdfmt.format(now));
		
		
	}
	
	// === 소문자 3개와 숫자 4개로 이루어진 랜덤한 인증키 만들기 ===
	   public static String certification_key() { // String 타입을 return;
	      
	      Random rnd = new Random();
	      // 처음 얼마부터 마지막 얼마까지 랜덤한 정수
	      // 랜덤한 정수 = rnd.nextInt(마지막수-처음수+1) + 처음수;
	      
	      String certification_key = ""; // 값을 쌓아두는 용도
	      
	      for(int i=0; i<7; i++) {
	         
	         if(i<3) { // 랜덤한 소문자를 발생시킴
	            char ch = (char)(rnd.nextInt('z'-'a'+1) + 'a');
	            certification_key += ch;
	         }
	         
	         else { // 랜덤한 숫자 0 부터 9 까지 발생시킴
	            int n = rnd.nextInt(9-0+1) + 0;
	            certification_key += n; // 문자열 결합
	         }
	         
	      } // end of for ----------
	      
	      return certification_key; // 문자열 반환
	      
	   }


	
	public static String space_delete(String input_str) {
		
		String result = null;
		
		if(input_str != null) {
			result = "";
			for(int i=0; i<input_str.length(); i++) {
							char ch = input_str.charAt(i);
				if(ch != ' ') {
					result += ch;
				
				} 
			
			}//end of for--------------------------------
		}
		
		return result;
	}
	// 비밀번호가 규칙에 맞는지 틀리는지 알려주는 static 메소드 생성하기 ==//
	/*
	 비밀번호 규칙은 비밀번호의 길이는 8글자 이상 15글자 이하이어야 하고, 또한 
	 비밀번호는 영문 대문자, 영문 소문자, 숫자, 특수기호가 혼합되어야만 한다
	 규칙에 맞으면 true를 리턴해주고, 규칙에 틀리면 false를 리턴하도록 만든다
	 */
	public static boolean isCheckPasswd(String passwd) {
		
		if(passwd == null) return false;
		// 예를들어서
		//	입력받은 passwd가 C5d#이라면 dsfdf2342@##!#@!dsffd이라면 
		// 또는
		// 입력받은 passwd가 C5Dfdq#이라면 C5df1@이라면
		// 입력받은 passwd가 C5Dfdq#이라면 C5df1@이라면
	
	
		int length = passwd.length();
		// 암호에 한글이 들어가 있는지 알아본다
		if(length < 8 || length > 15) {
			return false;
		}
			// 이제부터는 입력받은 passwd의 글자수가 8글자 이상 15글자 이하인 경우이다
			
		// 예를들어서
			//	입력받은 passwd가 C5d#이라면 dsfdf2342@##!#@!dsffd이라면 
		
		boolean flag_upper = false;
		boolean flag_lower = false;
		boolean flag_number = false;	
		boolean flag_special = false;
	
		for(int i=0; i<length; i++) {
			// 암호에 한글이 들어가 있는지 알아본다
			char ch = passwd.charAt(i);
			if('가'<= ch && ch <= '힣')
			   return false;		
	
			else if(Character.isUpperCase(ch))  // 영문 대문자일 경우
			     flag_upper = true;
			
			else if(Character.isLowerCase(ch))
				flag_lower = true;
			
			else if (Character.isDigit(ch))
				flag_number = true;
			
			else // 특수문자일 경우
				flag_special = true;
			
		} // end of for
		
	    return 	flag_upper && flag_lower && flag_number && flag_special;
		
	} //end of public static boolean isCheckPasswd(string passwd) 
	
	
}

			
	
	
