package 종합.과제3.controller;

import 종합.day28_2인과제_피드백.model.dao.MemberDao;

public class MemberController {
    private MemberController() {}
    private static final MemberController instance = new MemberController();
    public static MemberController getInstance() {return instance;}
    private MemberDao md = MemberDao.getInstance();

    // [1] 회원가입 메소드
    public boolean signup(String mid, String mpw, String mname, String mphone , boolean isAdmin) {
        System.out.println("MemberController.signup"); // sout + m 중간검사(최종완성 후 제거)
        System.out.println("mid = " + mid + ", mpw = " + mpw + ", mname = " + mname + ", mphone = " + mphone + ", isAdmin = " + isAdmin); // sout + p 중간검사(최종완성 후 제거)

        //[*] 유효성 검사 (중복검사, 데이터 길이 검사)
        boolean result = md.signup( mid, mpw, mname, mphone );
        return result;
    }
     // [2] 로그인 메소드
    public boolean login( String mid, String mpw ){
        System.out.println("MemberController.login");
        System.out.println("mid = "+ mid + "mpw = "+ mpw );
        boolean result = md.login( mid , mpw );;
        return result;
    }
}

