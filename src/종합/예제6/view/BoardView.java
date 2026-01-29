package 종합.예제6.view;
import 종합.예제6.controller.BoardController;
import 종합.예제6.model.dao.BoardDao;

import java.util.Scanner;

public class BoardView {
    // [*] 싱글톤 생성
    private BoardView(){} // [1]
    private static final BoardView instance = new BoardView(); // [2]
    public static BoardView getInstance(){ // [3]
        return instance;
    }

    //[*] MVC패턴 흐름의 controller 싱글톤 호출
    private BoardController bc = BoardController.getInstance();
    // [*] 입력객체는 모든 메소드에서 사용할 예정이므로 지역변수 말고 메소드 밖에서 선언하자
    private Scanner scan = new Scanner(System.in);
    // 1) 등록 입출력 화면
    public void writeView( ){
        scan.nextLine();
        System.out.println("내용: ");     String content = scan.nextLine();
        System.out.println("작성자: ");    String writer = scan.nextLine();
        // 1. 컨트롤러에게 입력받은 content, writer 전달하여 결과 받아오기
        boolean result = bc.doPost( content, writer );
        // 2. 받은 결과에 따른 화면 출력해주기
        if (result) {System.out.println("[안내] 글쓰기 성공");}
        else {System.out.println("[안내] 글쓰기 실패");};
    }
}
