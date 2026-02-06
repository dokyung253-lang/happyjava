package 종합.예제7.controller;

import 종합.예제7.model.dao.BoardDao;

public class BoardController {
    private BoardController(){} // 생성자 private
    private static final BoardController instance = new BoardController(); // 현재 객체를 new instance 생성
    public static BoardController getInstance(){return instance;}
    private BoardDao bd = BoardDao.getInstance();

    // [1] 게시물 등록 controller
    public boolean write( String bcontent, String bwriter ) {
        boolean result = bd.write(bcontent, bwriter);
        return result;
    }

    // [3] 게시물 수정 controller
    public boolean update(int bno, String bcontent){
        boolean result = bd.update(bno, bcontent);
        return result;
    }

    // [4] 게시물 삭제 controller
    public boolean delete( int bno ){
        boolean result = bd.delete( bno);
        return result;
    }
} // class end
