package day13;

import java.util.Arrays;

public class Exam2 {
    public static void main(String[] args) {

        // String 클래스
        // 1. 문자열 표현 방법
        char str1 = '유'; // char는 1글자만 저장 가능
        char[] str2 = {'유', '재', '석'}; // char타입 배열

        // 2. 문자 변환, 아스키코드(C언어) 7비트 -> 128문자, 유니코드(자바) 전세계 표준 문자 부호
        char str3 = 65;         System.out.println("str3 = " + str3); // A
        char[] str4 = { 74, 65, 86, 65 };
        System.out.println("str4 = "+ Arrays.toString( str4 )); // [J, A, V, A]
        char str5 = '김';        System.out.println("(int)str5 = " + (int)str5); // 44608

        // 3. 문자열 생성, == 리터럴(상수) 비교, .equals() 객체 비교
        String str6 = "유재석"; // 문자 리터럴 형식
        String str7 = "유재석"; // 문자 리터럴 형식
        String str8 = new String("유재석"); // 문자 객체 형식 , 스트링 객체로 한 번 래핑 한 것
        System.out.println(str6 == str7); // true
        System.out.println( str6 == str8 ); // false
        System.out.println( str6.equals(str8)); // true

        // 4. 주요 기능/ 메소드
            // 1) "문자열".concat("새로운문자") : 문자열에 새로운문자열 연결하여 *(새로운)*반환하는 함수
        String str9 = "자바"; // str9 주소값
        String str10 = str9.concat("프로그래밍"); // str10 주소값
            // 2) "문자열" + "새로운문자열" : 연결연산자, 연결된 문자열이 반환된다.
                // 3 + 3 -> 6
        String str11 = str9 + "프로그래밍";
            // 3) StringBuilder 클래스, .append함수 이용하여 문자열 연결하는 객체, 연결된 문자열에 따른 *주소값 유지*
        StringBuilder builder = new StringBuilder();
        builder.append( str9 );
        builder.append( "프로그래밍");
        System.out.println(builder); // 자바프로그래밍
            // 4) String.format("%", "문자열")
        String str12 = String.format("%s%s", str9, "프로그래밍");
        System.out.println("str12 = " + str12); // 자바프로그래밍
            // 5) """ """ 자동 줄바꿈 표현하는 문자열 vs \n
        String str13 = """
                자바
                프로그래밍
                """;
        System.out.println( str13 );
        //자바
        // 프로그래밍

        // 활용 : JDBC SQL
        String name = "유재석";
        String sql1 = "insert into table(name)values("+name+")";
        String sql2 = "insert into table(name)values(".concat(name+")");
        String sql3 = String.format("insert into table(name)values(%s)", name);
        StringBuilder sql4 = new StringBuilder();
        sql4.append("insert into table(name)");
        sql4.append("values(");
        sql4.append(name);
        sql4.append( ")");
        String sql5 = "insert into table(name) values(?)";
            // 6) .charAt(인덱스), 문자열 내 지정한 인덱스 번호의 문자 1개 추출/반환
        char gender = "012345-1230123".charAt(7);
        System.out.println("gender = "+ gender); // 1
            // 7).length() : 문자열 내 문자 개수/ 길이 반환
        System.out.println("012345-1230123".length()); // 14
            // 8) .replace(기존문자, 새로운문자) : 문자열 내 기존문자가 존재하면 새로운문자로 치환하여 새로운 문자열 반환
        String str14 = "자바프로그래밍".replace("자바","JAVA");
        System.out.println("str14 = " + str14); // JAVA프로그래밍
        // 활용 : HTML (데이터수집 과정 정제/정리)
        String html = "<div>유재석</div> <br/><div>강호동</div> <br/>";
        System.out.println( html.replaceAll("<br/>", "\n")); // html 줄바꿈 ---> java 줄바꿈 치환

    }
}
