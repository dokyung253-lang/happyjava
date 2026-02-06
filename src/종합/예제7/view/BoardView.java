package 종합.예제7.view;

import 종합.예제7.controller.BoardController;

public class BoardView {
    private BoardView(){}
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance(){ return instance;}
    private BoardController bc = BoardController.getInstance();


}


