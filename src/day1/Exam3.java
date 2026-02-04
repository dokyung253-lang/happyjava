package day01; // 클래스가 속한 패키지 명

public class Exam3 { // class start
    // m + enter : 코드의 흐름을 읽어주는 main 선언
    public static void main(String[] args) { // main start
       // [1]  System.out.println(); : 자료 출력 후 줄바꿈 포함, sout 자동완성
        //  system : class이면서 시스템(현컴퓨터) 관련 기능/ 함수 제공한다.
        // out : 출력에 관련된 기능/함수 갖는 객체 반환
        // print : 출력함수
        System.out.println("자바안녕1"); // vs console.log()
        // [2] System.out.print(); : 자료 출력
        System.out.print("자바안녕2");
        // [3] System.out.printf(" "); 자료출력 + 형식문자
        System.out.printf(" %s" , "자바안녕3");
        /*
            prointf(format 형식)
                %s : 문자열, %d : 정수,  %c : 문자 ,  %f : 실수
                자릿수
                    %자릿수d : 자릿수만큼 자리 차지, 만일 비어있으면 공백, 오른쪽 정렬
                   %-자릿수d : 자릿수만큼 자리 차지, 만일 비어있으면 공백, 왼쪽 정렬
                   %0자릿수d : 자릿수만큼 자리 차지, 만일 비어있으면 0채움
                   전체자릿수, 소수점자릿수f

        */
        String name = "유재석"; int age = 10;
                // 문자열과 변수 연결할 떄 +더하기(연결) 연산자 연결한다.
        System.out.printf("저는" + name + "이고 나이는 : "+ age + "입니다.");
                // 변수 또는 수식이 들어가는 자리에 "형식문자"로 대체한다.
        System.out.printf("저는 %s이고 나이는 %d 입니다. \n", name, age);
        System.out.printf("저는 %s 이고 나이는 %6d 입니다.\n", name, age);
        System.out.printf("저는 %s 이고 나이는 %-6d 입니다.\n", name, age);
        System.out.printf("저는 %s 이고 나이는 %06d 입니다.\n", name, age);
        System.out.printf("저는 %s 이고 나이는 %3.2f 입니다.", name, 177.2345);

        // 이스케이프/제어 문자
        // "\n" : 줄바꿈, \t L 들여쓰기(tab), \" : 큰따옴표 출력, \': 작은따옴표 출력, \\ : 백슬래시 출력
        System.out.println("안녕1\n안녕2");
        System.out.println("안녕1\t안녕2");
        System.out.println("안녕1\"안녕2");
        System.out.println("안녕1\'안녕2");
        System.out.println("안녕1\\안녕2");

    }// main end
}// class end
