package 종합.과제2.model.dao;

import 종합.과제2.model.dto.BoardDto;
import java.util.ArrayList;

import static 종합.예제5.BoardController.boards;

public class BoardDao {
    private BoardDao(){}
    private static  final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){
        return instance;
    }
    private final ArrayList<BoardDto> boards = new ArrayList<>();
    // [*] 전역변수 최신 게시물번호 저장 < 식별키 생성 목적 : 추후에 삭제 예정 >
    private static int currentNo = 1; // 초기값 1

    public boolean doPost( int tel, int count ){
        BoardDto boardDto = new BoardDto( currentNo , tel , count );
        boolean result = boards.add( boardDto );
        currentNo++;
        return result;
    }
    // 2) 전체 조회 처리 : controller 가 dao 에게 모든 게시물들을 요청한다.
    public ArrayList<BoardDto> doGet( ){
        return boards; // 개별 조회 1개 반환타입 : BoardDto    vs   전체 조회 N개 반환타입 ArrayList<BoardDto>
    }
}// class end



