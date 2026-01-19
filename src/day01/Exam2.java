package day01; // 패키지(폴더)로써 클래스가 위치한 폴더명

import java.sql.SQLOutput;

public class Exam2 { // class s
    // public class : 공개용 클래스를 선언하는 뜻 갖는 키워드
    // Exam2 : 임의의 클래스명 정의한다, 첫글자 대문자
    // shift + ctrl + f10 = class 실행
      // [1] m + 엔터 : main함수
      // 자바에서 최초로 실행 흐름(스레드)를 갖는 (미리만들어진) 함수
    public static void main(String[] args) {
        // [2] 리터럴: 상수이면서 키보드로 입력 가능한 자료들
        // 3, 3.14, 'a', true, false : 상수
        System.out.println(3); //  JS에 console.log() 동일한 기능의 함수
        System.out.println(3.14); // sout + 엔터 : System.out.println(출력자료);
        System.out.println("유"); // 선언 또는 함수실행 뒤에 ;세미콜론 작성한다.
        System.out.println("유재석");// 문자열 처리할 때는 "큰 따옴표 실행

        // [3] 자료형/타입(분류): 자료들을 효율적으로 사용하기 위한 분류 방법
        // 효율이란? 내가 시계 선물을 하기 위해 다이소에서 시계크기 맞는 적당(효율)한 상자를 고른다.
        // 바이트(byte)란? bit(0 혹은 1) -----> 01101010(8bit/bit 8개) --> 1024byte (kb)
        // 정수 : byte(1b, -128 ~ +127, 0은 음수에 포함됨), short(2b, +- 30,000),
        //       int(4b,+-21억까지, *정수의 기본 타입*), long(8,+-21억 이상)
        // 실수 : float(4, 소수점 8자리 표현), double(8, 소수점 17자리 표현, *실수의 기본타입*)
        // 문자 : char (2, '' 작은따옴표 감싼 ) , 문자열 :  String( 문자열클래스, ""큰 따옴표 감싼)
        // 논리 : boolean (1, true/false )
        // =====================> 8가지 암기 + String

        //1. boolean : true 또는 false 저장하는 타입
        boolean bool1 = true; // [JAVA] 자료형 변수명 = 값; [JS] let bool1 = true;
        boolean bool2 = false; // 변수명은 카멜표기법 권장, 숫자 시작 / 일부 특수/ 띄어쓰기 안됨
        // boolean box3 = 3; // [오류} boolean은 3 저장할 수 없다.
        System.out.println( bool1 );
        System.out.println( bool2 );

        // 2. char : '' 작은따옴표로 감싼 문자 1개 저장하는 타입
        char ch1 = 'A';
        // char ch2 = 'ABC'; // [오류] 문자 여러개 저장 불가능
        // char ch3 = "ABC"; // [오류] "" 사용 불가능
        System.out.println( ch1 );

        // 3. String : "" 큰 따옴표로 감싼 문자 여러개 저장하는 (클래스) 타입
        String str1 = "ABC";
        System.out.println( str1 );

        // 4. byte: -128 ~ +127
        byte b1 = 100;
        // byte2 b2 = 300; // [오류]
        System.out.println(b1);

        // 5. short : +- 30,000 정도
        short s1 = 32000;
        // short s2 = 50000; // [오류]

        // 6. int : +- 21억 정도 , 정수의 리터럴 기본타입, 즉] 키보드로부터 입력받은 값들은 int 타입이다.
        int i1 = 2100000000;        System.out.println( i1 );
        // int i2 = 3000000000; // [오류] 30억

        // 7. long : +- 21억 이상, 리터럴 뒤에 L/l 붙인다.
        long l1 = 3000000000L; // 3000000000 리터럴 값은 INT타입이라서 뒤에 L 명시한다.
        System.out.println( l1 );

        // 8. double : 소수점 17자리까지 표현, 실수의 리터럴 기본타입
        double d1 = 0.123456789123456789;       System.out.println(d1);


        // 9. float : 소수점 8자리까지 표현 , 리터럴 뒤에 F/f 붙인다.
        float f1 = 0.123456789123456789F;
        System.out.println( f1 );

        //  + 소수점 오차가 발생하거나 표현한계로 사용 제약 : String, BigDecimal 등 사용한다.

    } // main e
} // class e

/* -------코드실행---------             ------------코드실행-----------
JS : console.log("자바")                브라우저
JAVA : print("자바")                    main


*/