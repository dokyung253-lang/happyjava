package 종합.예제4;

import java.util.Scanner;

// - 실행클래스 : 입출력담당
public class BoardService {
    // -- 최초 실행 함수 = main
    public static void main(String[] args) {
    BoardController bc = new BoardController(); // static 은 객체없이 가능해서 static 쓰면 안 써도 됨
        for( ; ; ){ // 반복문
            System.out.println("==================My Community===================");
            System.out.println("1. 게시물쓰기 2. 게시물출력");
            System.out.println("=================================================");
            System.out.println("선택 >");Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            if(ch == 1) {
                scan.nextLine();
                System.out.print("내용: ");   String content = scan.nextLine();
                System.out.print("작성자: ");    String writer = scan.nextLine();
        // BoardController 의 저장기능 호출하여 저장결과 받기
                boolean result = bc.doPost(content, writer);
                if( result == true){System.out.println("[안내]저장 성공");}
                else{System.out.println("[경고] 저장 실패");}
            }else if( ch ==2 ) {
                // BoardController 의 조회기능 호출하여 조회결과 받기
                Board[] boards = bc.doGet();
                for (int index = 0; index <= boards.length - 1; index++) {
                    if (boards[index] != null) {
                        System.out.println("작성자: " + boards[index].writer);
                        System.out.println("내용: " + boards[index].content);
                        System.out.println("-------------------------------");
                    }
                }
            }
        }
    }
} // class end