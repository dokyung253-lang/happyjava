package 종합.예제4;
// - 게시물기능 설계 클래스
public class BoardController {
    // 속성: 멤버변수
    Board[] boards = new Board[100];
    // 기능 1 : 게시물 저장
    boolean doPost( String content, String writer ){
        Board board = new Board();  // 1. 객체 생성
        board.content = content;   // 2. 매개변수로 받은 값을 객체에 대입
        board.writer = writer;
        for(int index = 0;  index <= boards.length -1 ; index++){
            if(boards[index] == null){// 3. 만약에 index번쨰 요소가 비어있으면
                boards[index] = board; // 배열에 새로운 객체 저장
                return true; // 함수종료 뜻, true 반환 했으므로 리턴타입은 boolean
            }
        } //for end
        return false; // for문 끝났음에도 저장 못했으면 false 반환
    }// method end
    // 기능 2 : 게시물 조회
    Board[ ]doget( ){
        return boards; // boards 반환했으므로 리턴타입은 boards 변수의 타입은 Board[ ] 배열이다.
    }
}// class end
