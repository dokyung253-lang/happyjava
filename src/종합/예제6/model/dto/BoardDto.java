package 종합.예제6.model.dto;

public class BoardDto {
    // 1. 멤버변수 = 속성 = 테이블(표)와 일치 권장*
    private int no;
    private String content;
    private String writer;

    // 2. 생성자 : 관례적으로 기본생성자+ 풀생성자
    public BoardDto( ){ }
    public BoardDto(int no, String content, String writer){
        this.no = no;
        this.writer = writer;
        this.content = content;
    }
// 3. 메소드 : 관례적으로 private 멤버변수에 대해 setter/getter
    public int getNo() {return no;}
    public void setNo(int no) {this.no = no;}
    public String getContent() {return content;}
    public void setContent(String content) {this.content = content;}
    public String getWriter() {return writer;}
    public void setWriter(String writer) {this.writer = writer;}
    // toString : 개발자를 위해
    @Override
    public String toString() {
        return "BoardDto{" +
                "no=" + no +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
