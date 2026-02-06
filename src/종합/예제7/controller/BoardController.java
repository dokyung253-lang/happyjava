package 종합.예제7.controller;

import 종합.예제7.model.dao.BoardDao;

public class BoardController {
    private BoardController(){} // 생성자 private
    private static final BoardController instance = new BoardController(); // 현재 객체를 new instance 생성
    public static BoardController getInstance(){return instance;}
    private BoardDao bd = BoardDao.getInstance();
}
