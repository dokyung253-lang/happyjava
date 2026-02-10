package day12;

import 종합.예제7.model.dto.BoardDto;

public class Exam1 { // class start
    public static void main(String[] args) { // main start

        /*
            기본타입 : byte short int long float double boolean char
                  - 8개 이면서, 리터럴(상수; 키보드로 입력받는)값 분류하는 타입
                  - 소문자로 시작함
                  - 자료 1개 저장
            참조타입 : String, Scanner, MemberDto, [ ] 등등 기본타입 외 모두
                  - 기본타입 외 모두 참조타입이다. 배열, 클래스, 인터페이스
                  - 대문자로 시작함
                  - 기본 타입 외 개발자가 새로운 타입 만드는 행위, 예] int/double 2개 갖는 타입

        */

        // 자바 회사에서 제공하는 기본클래스들
        // [1] Object : 자바에서 최상위 클래스 이면서 모든 클래스는 Object로 부터 상속받는다.
        Object o1 = 3; // 3: 자식, Object: 부모
        Object o2 = 3.14;
        Object o3 = true;
        Object o4 = "유재석";
        Object o5 = new Object();
        Object o6 = new int[3];
        Object o7 = new BoardDto();  // 종합예제 7에서 만든 dto
        // 즉] 모든 자료들은 Object로 타입변환(다형성) 가능
            // 1-1) toString(): 인스턴스/자료 주소값(메모리위치) 반환 함수
        System.out.printf( o6.toString() ); // [I@214c265e], 이와같이 할당된 주소값출력(개발자가 제어 불가)
        System.out.printf( o7.toString() ); // BoardDto{}, 이와같이 toString 오버라이딩한 객체는 문자열 출력
            // 1-2) .equals( ) : 주소가 참조하는 객체 값 비교 vs == 주소(위치)또는 리터럴 비교
        Object o8 = new BoardDto();
        Object o9 = new BoardDto();
        System.out.println( o8 == o9 ); // false
        System.out.println( o8.equals(o9)); // false

        Object o10 =  o9;  // 객체 참조 복사 / 복제
        System.out.println( o8.equals(o9)); // true

        String str1 = new String("유재석");
        String str2 = new String("유재석");
        System.out.println( str1 == str2); // false : 서로다른 객체가 같은 문자열을 갖는다.
        System.out.println( str1.equals(str2)); // true : 서로다른 객체 내 문자열 비교.

            // 1-3).hashcode() 객체를 식별하는 값을 정수로 반환
        System.out.println( str1.hashCode() ); // 50621969
        System.out.println( str2.hashCode() ); // 50621969
        System.out.println( o10.hashCode() ); // 1323165413
        System.out.println( o9.hashCode() ); // 1323165413
        System.out.println( o8.hashCode() ); // 1880587981

        // [2] Class : 클래스 정보(멤버변수/ 메소드 등등) 담는 클래스
        String obj1 = new String();
        Class c1 = obj1.getClass();
        System.out.println(c1); // class java.lang.String

        Integer obj2 = 3;
        Class c2 = obj2.getClass();
        System.out.println(c2); //class java.lang.Integer

        // 2-1) Class.forName("패키지명.클래스명" ); , 일반예외
        // ** 리플렉션** : 최초 실행할 때(컴파일) 객체 생성하지 않고 실행 도중에 객체 생성 = 동적 처리
        // 사용처 : JDBC(db연동), 스프링 프레임워크(자바 플랫폼)
        try{Class.forName("java.lang.String");} // String 클래스가 존재하면 객체가 동적으로 생성된다.
        catch( ClassNotFoundException e){}




    }// m end
}// c end
