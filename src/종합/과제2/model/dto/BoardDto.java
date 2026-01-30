package 종합.과제2.model.dto;

public class BoardDto {
    // 1. 멤버변수 = 속성 = 테이블(표) 일치 권장*
    private int no;
    private int tel;
    private int count;
    // 2. 생성자 : 관례적으로 기본생성자+풀생성자
    public BoardDto(int no, int tel, int count) {
        this.no = no;
        this.tel = tel;
        this.count = count;
    }
    // 3. 메소드 : 관례적으로 private 멤버변수에 대해 setter/getter 제공한다.
    public int getNo() {return no;}
    public void setNo(int no) {this.no = no;}
    public int getCount() {return count;}
    public void setCount(int count) {this.count = count;}
    public int getTel() {return tel;}
    public void setTel(int tel) {this.tel = tel;}
    @Override
    public String toString() {
        return "BoardDto{" +
                "no=" + no +
                ", tel=" + tel +
                ", count=" + count +
                '}';
    }
}