package day13;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Exam3 {
    public static void main(String[] args) {
        
        // [난수클래스]
        // [1] 랜덤객체 생성
        Random random = new Random();
        // 1) 0~9 사이의 난수 생성 , .nextXXX(개수)
        int val1 = random.nextInt();  // Int타입 허용 범위 내 난수 생성
        System.out.println("val1 = " + val1); // 1031141808
        int val2 = random.nextInt(10 );
        System.out.println("val2 = " + val2);
        // 2) 1~10 사이의 난수 생성, nextXXX(개수) + 시작값
        int val3 = random.nextInt(10) + 1;
        System.out.println("val3 = " + val3);
        // 3) 0~1 사이의 실수 난수 생성
        double val4 = random.nextDouble();  System.out.println("val4 = " + val4);
        // 4) true, false 난수 생성
        boolean val5 = random.nextBoolean();    System.out.println("val5 = " + val5);
        // 활용처1 : 특정한 목록에서 하나의 항목 랜덤 선택
        ArrayList<String>list = new ArrayList<>();
        list.add("유재석"); list.add("강호동"); list.add("신동엽");
        int index = random.nextInt(list.size()); // 리스트 내 항목개수 만큼 난수 생성
        System.out.println("list.get(index) = "+ list.get(index));
        // 활용처2 : 인증코드/ 임시비밀번호 생성
        String code = ""; // 인증코드/ 임시비밀번호 생성
        for( int i = 1; i <= 6; i++ ){
            int rand = random.nextInt(26) + 97; // 97~122 사이의 난수를 생성
            char ch =  (char)rand;  // 97~122 --> 문자 타입변환
            code += ch; // 인증코드에 연결
        }
        System.out.println("code = " + code);
        // 활용처3 : 주사위/ 로또번호
        
        // [2] UUID : 범용 고유 식별자,
        String uuid = UUID.randomUUID().toString();
        System.out.println("uuid = " + uuid);
        /*
             UUID
                - 중복될 확률 거의 없다
                - 랜덤기반 식별자
             사용처
                - 데이터베이스 Pk, 파일명, 로그인세션(Token) 등
                    - (mysql) auto_increment : 1 2 3 4 5 순으로 증가하면 가볍고 노출이 쉽다.
                    - UUID : 난수이므로 무겁고 노출이 어렵다. <보안>
        */
    }
}
