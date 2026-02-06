package 종합.예제7.model.dao;


import 종합.예제7.model.dto.BoardDto;

import java.sql.Connection;
import java.sql.DriverManager;

public class BoardDao {
    private BoardDao(){ connect();} // 생성자 private
    private static final BoardDao instance = new BoardDao(); // 현재 객체를 new instance 생성
    public static BoardDao getInstance(){return instance;}

    // ==========데이터베이스 연동============//
        // 1) 연동할 DB 서버의 정보
    private String url = "jdbc:mysql://localhost:3306/boardservice7";
    private String user = "root"; private String password = "1234";
        // 2) 연동 인터페이스 선언
    private Connection conn;
        // 3) 연동 함수 정의, dao에 생성자에서 함수 실행( dao 싱글톤이 생성되면서 db연동 실행 )
    private void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // mysql 라이브러리 객체 메모리 할당/ 불러오기
            conn = DriverManager.getConnection( url, user, password ); // mysql 구현체로 db 연동 후 연동 인터페이스에 반환
            System.out.println("[시스템준비] 데이터베이스 연동 성공");
        }catch (Exception e){
            System.out.println("[경고] 데이터베이스 연동 실패 : 관리자에게 문의");
        }
    }

}
