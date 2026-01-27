package test;

public class BoardController {
    Board[]boards= new Board[100];
    boolean doPost(String content, String writer){
        Board board = new Board();
        board.content = content;
        board.writer = writer;
        for(boards index= 0; index <= boards.length-1; index++){
            if(boards[index] == null){
                Board boards = board;
                return true;
            }
        }// for end
        return false;
    }

}// class end
