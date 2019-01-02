import java.io.UnsupportedEncodingException;

public class MethodsOfStringMid {
	public static void main(String[] a) {
		/* 정의
		 * str : mutable string object
		 * str1: alphabet
		 * str2: number
		 * str3: special char
		 * 이 프로그램은 StringBuilder나 StringBuffer는 사용하지 않음 
		 */
		
		//전체-생성: 다양한 생성자로 생성
		char charAry[]= {'<', '!', '>' };
		
		String str = "";
		String str1= "abc";
		String str2= new String("123");
		String str3= new String(charAry, 0, charAry.length);
		String[] strAry= {str1, " ", str2, " ", str3};
		
		System.out.printf("[%-25s]", str1+","+str2+","+str3); 
		System.out.printf("전체-생성\n");
		
		for(int i= 0; i < strAry.length; i++){
			str= str+ strAry[i];
		}
		System.out.format("[%-25s]", str);
		System.out.printf("전체-생성-배열\n");


		//전체-복사: 
		String strCopy= new String(str);
		System.out.printf("[%-25s]", strCopy );
		System.out.printf("전체-복사");
		if (str.matches(strCopy) == true) System.out.printf("부분매칭, "); 
		if (str.contains(strCopy) == true) System.out.printf("포함여부, " );
		if (str.compareTo(strCopy) == 0) System.out.printf("동일한지, " );
		if (str.equals(strCopy) == true) System.out.printf("동일한지\n" );

		
		//전체-연결
		str= str + strCopy;
		System.out.printf("[%-25s]", str);
		System.out.printf("전체-연결\n");
		
		
		//내부-추출-위치로:
		int startPos=str.indexOf(str2);
		String tempStr="";
		for (int i= startPos; i < startPos+ str2.length(); i++) {
			tempStr=tempStr + str.charAt(i);
		}
		System.out.printf("[%-25s]", tempStr);
		System.out.printf("부분-추출-위치로\n");

		
		//내부-포함여부:
		String subStr;
		int strIndex= str.indexOf(str2); 
		if (strIndex>= 0){
		//내부-문자열위치://내부-추출
			subStr= str.substring(strIndex, strIndex+ str2.length());
			System.out.printf("[%-25s]", subStr );
			System.out.printf("부분-추출-문자열\n");
		}
		else{
			subStr="";
			System.out.println("str not matched\n");
		}

		
		//내부-부분문자열 변경:
		System.out.printf("[%-25s]", str.replaceFirst(str2, "777"));
		System.out.printf("부분-변경-첫번째\n");
 		System.out.printf("[%-25s]", str.replaceAll("[0-9][0-9][0-9]", "999"));
 		System.out.printf("부분-변경-모두\n" );
		System.out.printf("[%-25s]", str.replace(str2, "555"));
		System.out.printf("부분-변경-모두\n");

 		if (str.startsWith(str1) && str.endsWith(str3)){
 			System.out.printf("[%-25s]", str.toUpperCase());
 			System.out.printf("부분-변경-대문자로\n" );
 		}

		
		//전체-type 변환-toNum
		int toNum= Integer.parseInt(subStr);
		System.out.printf("[%-25s]", toNum );
		System.out.printf("부분-변환-숫자로\n" );

		
		//전체-type 변환-toString
		String toStr= "" + String.valueOf(toNum) +toNum ;
		System.out.printf("[%-25s]", toStr);
		System.out.printf("부분-변환-문자로\n" );

		
		//내부-분리-여러개:
		strAry= str.split(" ");

		tempStr="";
		for(int i= 0; i < strAry.length; i++){
			tempStr= tempStr+ strAry[i]+ ",";
		}
		System.out.printf("[%-25s]", tempStr);
		System.out.printf("전체-분리-배열로\n");


		String d = "안녕 親9"; // 자바는 내부 문자열을 모두 유니코드 처리한다

		// 유니코드 문자열을 UTF-8 캐릭터 바이트배열로 변환하여 반환
		byte [] utf8 = new byte[0];
		try {
			utf8 = d.getBytes("UTF-8");
			// 유니코드 문자열을 EUC-KR 캐릭터 바이트배열로 변환하여 반환
			byte [] euckr = d.getBytes("EUC-KR");

			// 당연히 다른 바이트 배열이므로 사이즈가 다르다.
			System.out.println("byte length > " + utf8.length); // byte length > 11
			System.out.println("byte length > " + euckr.length); // byte length > 8

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}


	}
}
