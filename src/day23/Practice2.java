package day23;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // [1] 메모리 설계 , 1) 2개 정보를 가진 게시물이 3개 이면 변수는 총 6개를 갖는다.
        // 2) 2개 정보를 가진 게시물이 100개이면 변수는 총 200개 갖는다. --> 배열 사용 Why? 관리 어렵기 때문
        String[] contents = new String[100]; // 제목 100개, 각 요소는 객체타입이므로 null 초기값을 갖는다.
        String[] writers = new String[100]; // 작성자 100개 , { null, null, null ,~~ }
        // [2] 무한 루프
        for (; ; ) {
            System.out.println("==========My Community============");
            System.out.println("1. 게시물쓰기 2. 게시물출력");
            System.out.println("==================================");
            System.out.print("선택>");
            Scanner scan = new Scanner(System.in); // [4] 입력객체 , Scanner 변수명 = new Scanner(System.in);
            int ch = scan.nextInt(); // int 정수형 타입, .nextInt() 키보드로부터 입력받은 값 정수로 가져오기
            // [5] 제어문, 코드 흐름 제어( 논리적인 사고, 경우의 수 등)
            if (ch == 1) {  // 제어문 . 코드의 흐름(경우의 수) 판단한다.
                System.out.print("내용: ");
                String content = scan.nextLine(); // 입력
                System.out.print("작성자: ");
                String writer = scan.nextLine();
                boolean save = false; // 저장했다 true, 저장못했다 false.
                for (int index = 0; index <= contents.length - 1; index++) { // index번쨰 요소값이 비어있으면
                    if (contents[index] == null && writers[index] == null) { // 입력받은 값들을 index버째에 대입한다.
                        contents[index] = content;
                        writers[index] = writer; // 입력
                        save = true;
                        break; // 저장 성공시 save에 true 대입 후 반복문 종료
                    }
                }// for end
                if (save == true) {
                    System.out.println("안내] 글쓰기 성공");
                } else {
                    System.out.println("경고] 게시물을 등록할 공간이 부족합니다.");
                }

            } else if (ch == 2) {
                for (int index = 0; index <= contents.length - 1; index++) {
                    if (contents[index] != null && writers[index] != null) {
                        System.out.printf("작성자 : %s, 내용: %s \n", contents[index], writers[index]);
                    }// if end
                }//for end
            }// else if end
        } //for end
    }// main end
}// class end
