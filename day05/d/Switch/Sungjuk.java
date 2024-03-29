package my.day05.d.Switch;

public class Sungjuk {
	
	
	
	String hakbun; // "091234"
	String name;
	byte kor; // byte -128 ~ 127 0 ~ 100로 제한
	byte eng; //  byte -128 ~ 127 0 ~ 100로 제한
	byte math; //  byte -128 ~ 127  0 ~ 100로 제한
	
	// ==== method ===
	boolean check_jumsu(byte jumsu) {
		if( 0 <= jumsu && jumsu <= 100 ) {
			return true; // return을 만나면 해당 메소드가 종료가 된다
					
		}
		else {
			System.out.println("[경고] 입력하시는 점수는 0 이상 100 이하 이어야만 합니다.\n");
			return false; // return을 만나면 해당 메소드가 종료가 된다
		}
	}
	
	void sungjuk_print() {
		
		float avg = (kor + eng + math) / 3.0F;
		
		char hakjum = 'F';
		
		/*
		 * if(avg >= 90 ) { hakjum = 'A'; } else if ( avg >= 80) { hakjum = 'B'; } else
		 * if ( avg >= 70) { hakjum = 'C'; } else if ( avg >= 60) { hakjum = 'D'; }
		 */
		// byte key = 0; => 가능함
		// short key = 0; => 가능함
		// int key = 0; => 가능함
		// long key = 0; // switch문에 long문은 들어오면 안됌
		// char key = ' ';
		// float key = 0.0F; // float도 switch문에 들어오면 안됌
		// double key = 0.0;
		// string key = ""; // 가능함
		switch (((byte)avg)/10) { // switch에 들어올 비교대상값은 정수형중에 long을 제외한 나머지인 byte, short, int만 가능하다<기억>
					// switch에 들어올 비교대상값은 char 타입도 가능하다
					// switch에 들어올 비교대상값은 float 및 double은 불가하다
					//  switch에 들어올 비교대상값은 String 타입도 가능하다
					// avg 실수 , 실수 / 정수, avg/10: 실수, avg를 정수로 바꿔준 다음에 10으로 나누는 것 -> 괄호를 한번 더 해주는 것
		//((byte)avg)를 먼저 해준 다음 10으로 나눔
		//byte, short, int, char, String만 가능하다
		//avg가 100
		
		// avg는 못쓴다, avg가 float, 형변환은 가능함 (int)avg/ (byte)avg 다만 long 타입으로는 안됌
			
		case 10:
			// case 10과 case 9랑 값이 비슷해서 hakjum = 'A'; break;를 생략해서 적어도 됌 
		
		case 9: //((byte)avg)/10 값이 10 또는 9이라면
				// 90 91 92 99 100 
				// 90/10 91/10 92/10 99/10 100/10
				// 9 9 9  9    9       9  9 
			
			
			
			//90 <= (byte)avg <= 99
				//90 91 92 93 94 ... 98 99 앞자리가 9라면은 A
				// 90/10 91/10 92/10 99/10
				// 9 9 9 9 9 9       9  9 
				hakjum= 'A';
				break; 
				
				
		case 8:		//((byte)avg)/10 값이 8이라면
			hakjum= 'B';
			break; 
			
			// 평균치가 70 얼마라면
		case 7:		//((byte)avg)/10 값이 8이라면
			hakjum= 'C';
			break;
			
		case 6:		//((byte)avg)/10 값이 8이라면
			hakjum= 'D';
			break;	
			
			
			default: //((byte)avg)/10 값이 8이라면
			hakjum= 'F';
			break;
		}// end of switch(((byte)avg)/10)) --------
		
		String gift = "";
		
		switch (hakjum) {
		case 'A':
			gift += "놀이공원이용권,"; //할당연산자, 먼저 gift에 "놀이공원이용권,"이걸 먼저 해줌      
								  // gift = gift + "놀이공원이용권,"와 같은 것       //gift = " " + "놀이공원이용권,"
		case 'B':
			gift += "치킨,";   //gift = gift + "치킨,", break가 없어서 B가 나오면 치킨, 피자가 나옴 
			
		case 'C':
			gift += "피자,"; //gift = gift + "피자,"
			
		case 'D':
			gift += "아이스크림"; //gift = gift + "아이스크림"
			break; //break;를 만나야만 switch case문을 빠져나온다

		default:
			gift = "꿀밤3대";
			break;
		} //end of switch(key)
		
		System.out.println("\n=== " + name + "====\n"
							+ "1. 학번 : " + hakbun + "\n" 
							+ "2. 성명 : " + name + "\n"
							+ "3. 국어 : " + kor + "\n"
							+ "4. 영어 : " + eng + "\n"
							+ "5. 수학 : " + math + "\n"
							+ "6. 총점 : " + (kor + eng + math) + "\n"
							+ "7. 평균 : " + Math.round(avg*10) + "\n" 
							+ "8. 학점 : " + hakjum + "\n" 
							+ "9. 선물 : " + gift + "\n");
	
		
		//avg는 float 타입
	}
	}
	// end of
	
	/* == 이순신님의 성적 결과
	 * 1. 학번 : 091234
	 * 2. 성명 : 이순신
	 * 3. 국어 : 90
	 * 4. 영어 : 80
	 * 5. 수학 : 78
	 * 6. 총점 : 248
	 * 7. 평균 : 827
	 * 8. 학점 : B
	 * 9. 선물 : 
	 *  */
		
	
	
	
	
		
	 //end of boolean check_jumsu(byte jumsu)-------
	
	
	
	
	
	
	
	
	
	

