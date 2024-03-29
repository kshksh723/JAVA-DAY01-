/*
 * package my.day08.c.object_array;
 * 
 * import java.util.Scanner;
 * 
 * import my.util.MyUtil;
 * 
 * public class Main_member {
 * 
 * public static void main(String[] args) {
 * 
 * //System.out.println("시작"+MyUtil.space_delete("이순신")+"끝");
 * //System.out.println("시작"+MyUtil.space_delete(null)+"끝"); // int[]
 * arr_subject = new int[7]; // 엔터는 null이 아니다
 * 
 * System.out.println("시작"+"     "+ "끝"); // true
 * System.out.println("시작"+" 중간    ".trim()+ "끝" ); //trim 왼쪽부터 양쪽에 공백을 다 제거
 * System.out.println("시작"+" 중간    "+ "끝" );
 * System.out.println("    ".trim().isEmpty() );
 * System.out.println(" 하   ".trim().isEmpty() );
 * System.out.println(" ".trim().isEmpty() );
 * System.out.println("    ".isEmpty() ); // true
 * 
 * 
 * // int[] arr_subject = new int[7]; Member[] arr_mbr = new Member[3];
 * 
 * 
 * for(int i=0; i<arr_mbr.length; i++) { System.out.println(arr_mbr[i]); } //
 * end of for
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * String str_menu = " "; do {
 * System.out.println("\n===========>> 메뉴 << ============\n"
 * +"1. 회원 가입 2. 모든 회원 조회 3. 프로그램종료\n" + "===========================");
 * System.out.print("◎ 선택하세요 =>");
 * 
 * str_menu = MyUtil.space_delete(sc.nextLine()); switch (str_menu) { case "1":
 * // 회원가입 System.out.print("★ 아이디 :"); String id = sc.nextLine();
 * if(id.trim().isEmpty())
 * System.out.println(">>[경고] 아이디값을 공백이 아닌 다른 값으로 입력하세요");
 * 
 * 
 * System.out.print("★ 비밀번호 :"); String passwd = sc.nextLine();
 * 
 * System.out.print(" ★ 성명 :"); String name = sc.nextLine();
 * 
 * Member mbr = new Member(); mbr.id = id; mbr.passwd = passwd; mbr.name = name;
 * break;// switch를 빠져나옴
 * 
 * case "2": // 모든 회원조회 break;
 * 
 * case "3": // 프로그램 종료
 * 
 * break;
 * 
 * default:// 메뉴에 존재하지 않는 값 System.out.println("== [경고] 메뉴에 없는 것입니다 == \n");
 * break; } } while (!("3".equals(str_menu) ));
 * 
 * 
 * System.out.println("\n==== 프로그램 종료 ====");
 * 
 * 
 * 
 * 
 * 
 * // 문자열 비교, 3번을 do while 문으로 반복해준다 }
 * 
 * }
 * 
 * // [경고] 메뉴에 없는 것입니다.
 */
package my.day08.c.object_array;

import java.util.Scanner;

import my.util.MyUtil;

public class Main_member {
   
   public static void main(String[] args) {
//      System.out.println("시작"+MyUtil.space_delete(" 이 순 신 ") + "끝");
//      System.out.println("시작"+MyUtil.space_delete(null) + "끝");
//      
//      System.out.println("시작" + "          " +"끝");
//      System.out.println("시작" + "          ".trim()+"끝");
//      
//      
//      System.out.println("시작" + "   중  간     " +"끝");
//      System.out.println("시작" + "   중  간     ".trim()+"끝");
//      
//      System.out.println("".isEmpty()); //true
//      System.out.println(" ".isEmpty()); // false
//      System.out.println("      ".trim().isEmpty()); //true
//      System.out.println("   하하하   ".trim().isEmpty()); // false
//      System.out.println("".trim().isEmpty()); // true
//      
      // 배열은 따로 초기화 안하면 null로 초기화됨
      // int[] arr_subject = new int[7];
      Member[] arr_mbr = new Member[3];
      
//      for(int i = 0; i<arr_mbr.length; i++) {
//         System.out.println(arr_mbr[i]);
//      }//end of for-----------------
      
      Scanner sc = new Scanner(System.in);
      
      String str_menuno = "";
      do {
         System.out.println("\n===========>>메뉴<<============\n" 
                        + "1. 회원가입   2.모든회원조회   3.프로그램종료\n"
                        + "================================");
         System.out.print("○ 선택하세요 ->");
         str_menuno = MyUtil.space_delete(sc.nextLine()); //유저가 공백 입력했을때 빼주는거..
         
         switch(str_menuno) {

            case "1":
               
               String id ="";
               do {
                  System.out.print("아이디 : ");
                  id = sc.nextLine();
                  
                  if(id.trim().isEmpty()) {
                     System.out.println(">>경고: 아이디값을 공백이 아닌 다른 값으로 입력하세요!");
                  } else {
                     break;
                  }
                  
               } while(true);
           
               System.out.print("ㅁ비밀번호 : ");
               String passwd = sc.nextLine();
               if(!(MyUtil.isCheckPasswd(passwd)));{ //passwd 값 자체가 boolean
               	System.out.println(">>[경고] 비밀번호는 8글자 이상 15글자 이하의 영문 대,소문자 및 숫자 및 특수문자가 혼합되어야만 합니다\n");
         }
          
      
      
      
         // 성명은 공백이 없는 한글로만 되어야 하고 글자길이는 2글자 이상 6글자 이하이어야만 한다
         String name = null;	
         do {
               System.out.print("ㅁ성명 :"
               		+ " ");
                name = sc.nextLine();
               
                boolean isUseName = true;
                
                if(name.length() < 2 || name.length() > 6) {
                	isUseName = false;
         	} 
                else { //입력한 성명의 길이가 2글자 이상 6글자 이하인 경우
                	for(int i = 0; i<name.length(); i++) {
                		if(!('가' <= name.charAt(i) && name.charAt(i)<= '힣')) {
                			isUseName = false;
                			break;  
         }
                		
        }   
                	
                }
                if(isUseName) {
                break;
                }
                else {
                	System.err.println(">> [경고] 성명은 공백이 없는 한글로만 2글자 이상 6글자 이하로 입력하세요!! \n" );
                }
         }while(true);
       			
       		
         		Member mbr = new Member();
               mbr.id = id;
               mbr.passwd = passwd;
               mbr.name = name;
               
               
               break;
               
            case "2": // 모든 회원 조회
               break;
               
            case "3":
               break;
               
            default:
               System.out.println("[경고] 메뉴에 없는 것입니다.");
               break;
         }
         
      } while(!("3".equals(str_menuno))); // str을 따로 명시해주는 이유: str은 지역변수니까 do를 빠져나가면 소멸.
                            // while문에서 사용이 안되미..
      //equals 사용시 null값 올 수 있는 입력값 변수 넣지 말고 리터럴값을 넣어야 오류가 없음.
      
      // * 공백이나 엔터는 null 아님!! 
      
      
      
      System.out.println("\n ==== 프로그램 종료 ====");
      
   }
   
}