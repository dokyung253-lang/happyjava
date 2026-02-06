package 종합.예제7.model.dao;


import 종합.예제7.model.dto.BoardDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDao {
    private BoardDao() {
        connect();
    } // 생성자 private

    private static final BoardDao instance = new BoardDao(); // 현재 객체를 new instance 생성

    public static BoardDao getInstance() {
        return instance;
    }

    // ==========데이터베이스 연동============//
    // 1) 연동할 DB 서버의 정보
    private String url = "jdbc:mysql://localhost:3306/boardservice7";
    private String user = "root";
    private String password = "1234";
    // 2) 연동 인터페이스 선언
    private Connection conn;

    // 3) 연동 함수 정의, dao에 생성자에서 함수 실행( dao 싱글톤이 생성되면서 db연동 실행 )
    private void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // mysql 라이브러리 객체 메모리 할당/ 불러오기
            conn = DriverManager.getConnection(url, user, password); // mysql 구현체로 db 연동 후 연동 인터페이스에 반환
            System.out.println("[시스템준비] 데이터베이스 연동 성공");
        } catch (Exception e) {
            System.out.println("[경고] 데이터베이스 연동 실패 : 관리자에게 문의");
        }
    }

    // [1] 게시물 등록 dao
    public boolean write(String bcontent, String bwriter) {
        try {// 1) SQL 작성한다. 저장 -> C -> INSERT ,   ?와일드카드 기호로 변수값이 들어갈 자리 뜻한다.
            String sql = "insert into board( bcontent, bwriter ) values(?, ?)";
            // 2) 연동된(Conn) 인터페이스에 SQL 기재한다. 반환 preparedStatement 준비된 *
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3) SQL이 기재된(ps) 인터페이스에 sql매개변수 대입,  ps.set타입명(?순서번호, 값);
            ps.setString(1, bcontent); // String 타입으로 SQL 내 첫번째 ?에 bcontent 값 대입한다.
            ps.setString(2, bwriter); // String 타입으로 SQL 내 두번째 ?에 bwriter 값 대입한다.
            // 4) 매개변수까지 대입하여 준비가 끝났으면 SQL 실행
            int count = ps.executeUpdate();
            // 5) SQL 실행 후 반영된 레코드 수에 따른 결과 제어
            if (count == 1) {
                return true;
            } // 등록한 레코드 수가 1이면 등록 성공
            else {
                return false;
            } // 아니면 실패
        } catch (SQLException e) {
            System.out.println("[시스템오류] SQL 문법 문제 발생 : " + e);
        }
        return false; // 아니면 실패
    } // f end

    // [4] 게시물 삭제 dao
    public boolean delete(int bno) {
        try {// 1] SQL 작성한다, ? 는 매개변수가 들어갈 자리
            String sql = "delete from board where bno = ?";
            // 2] 연동된(Conn) 인터페이스에 SQL 기재한다.
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3] ?와일드카드에 매개변수 대입, ps.setXXX( ? 순서번호, 값)
            ps.setInt(1, bno);
            // 4] SQL을 실행한다., 실행후 반영된 레코드 수
            int count = ps.executeUpdate();
            // 5] 결과
            if (count == 1) {
                return true;
            } // 삭제된 레코드수 1개이면 성공
            else {
                return false;
            } // 삭제
        } catch (SQLException e) {
            System.out.println("[시스템오류] SQL 문법 문제 발생 : " + e);
        }
        return false; // 실패
    }
}// class end
