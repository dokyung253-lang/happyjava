package 종합.예제6.view;

import 종합.예제6.controller.BoardController;

public class BoardView {
    // [*] 싱글톤 생성
    private BoardView(){} // [1]
    private static final BoardView instance = new BoardView(); // [2]
    public static BoardView getInstance(){ // [3]
        return instance;
    }
    //[*] MVC패턴 흐름의 controller 싱글톤 호출
    private BoardController bc = BoardController.getInstance();
}
