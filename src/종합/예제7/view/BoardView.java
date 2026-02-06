package 종합.예제7.view;

import 종합.예제7.controller.BoardController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {
    private BoardView() {
    }

    private static final BoardView instance = new BoardView();

    public static BoardView getInstance() {
        return instance;
    }

    private BoardController bc = BoardController.getInstance();

    private Scanner scan = new Scanner(System.in);

    public void index() {
        for (; ; ) {
            try {
                System.out.println("==================My Community===================");
                System.out.println("1. 게시물쓰기 2. 게시물출력 3. 게시물수정 4. 게시물삭제");
                System.out.println("=================================================");
                System.out.println("선택 >");     int ch = scan.nextInt();
                if (ch == 1) {
                } else if (ch == 2) {
                } else if (ch == 3) {
                } else if (ch == 4) {
                } else {System.out.println("[경고] 없는기능 번호입니다.");}
            }catch ( InputMismatchException e ){
                System.out.println("[경고] 잘못된 입력 방식 입니다.[재입력]");
                scan = new Scanner( System.in ); // 입력객체 초기화 ( 잘못된 입력값 제거 )
            } catch (Exception e) { // Exception 예외 중 슈퍼클래스로 모든 예외 처리 가능
                System.out.println("[시스템오류] 관리자에게 문의");
            }
        }// for end
    }// m end

    // [1] 게시물 등록 view
    public void write() {
        System.out.println("내용: ");
        String bcontent = scan.nextLine();
        System.out.println("작성자: ");
        String bwriter = scan.nextLine();
        boolean result = bc.write(bcontent, bwriter);
        if (result) {
            System.out.println("[안내] 게시물 등록 완료");
        } else {
            System.out.println("[안내] 게시물 등록 실패");
        }
    }
        }// c end