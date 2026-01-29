package 종합.예제6.controller;

import 종합.예제6.model.dao.BoardDao;

public class BoardController {
    private BoardController(){};
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){
        return instance;
    }
    //[*] MVC패턴 흐름의 dao 싱글톤 호출
    private BoardDao bd = BoardDao.getInstance();

// 1) 등록 제어 : view 에게 입력받은 content,writer 받아서 dao에게 요청후 결과를 view 에게 전달
public boolean doPost( String content , String writer ){
    // 1. DAO에게 content 와 writer 전달하고 결과 받기
    boolean result = bd.doPost( content , writer );
    // 2. DAO에게 받은 결과를 VIEW 에게 전달
    return result;

}
} // class end