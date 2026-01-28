package 종합.예제5;

public class Board {
    // 1. 멤버변수
    private String content; // private 이란? 현재 클래스에서만 접근 허용
    private String writer;

    // 2. 생성자 : 클래스 내부 빈 공간을 우클릭 -> 생성 -> 생성자
    // 생성자1
    public Board(){}
    // 생성자2
    public Board(String content, String writer){
        this.content= content;
        this.writer = writer;
    }
    // 메소드
        // 1. getter and setter
    public String getContent() {return content;}
    public void setContent(String content) {this.content = content;}
    public String getWriter() {return writer;}
    public void setWriter(String writer) {this.writer = writer;}
        // 2. toString
    @Override
    public String toString() {
        return "Board{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
} // class end
