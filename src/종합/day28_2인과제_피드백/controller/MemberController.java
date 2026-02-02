package 종합.day28_2인과제_피드백.controller;

import 종합.day28_2인과제_피드백.model.dao.MemberDao;

public class MemberController {
    private MemberController(){}
    private static final MemberController instance = new MemberController();
    public static MemberController getInstance(){ return instance; }
    private MemberDao md = MemberDao.getInstance();
    
    // [1] 회원가입 메소드
    public boolean signup( String mid, String mpw, String mname, String mphone) {
        System.out.println("MemberController.signip"); // sout+m : 중간 검사 (최종 완성 후 제거)
        System.out.println("mid = " + mid + ", mpw = " + mpw + ", mname = " + mname + ", mphone = " + mphone); // sout+ p

        // [*] 유효성검사 (중복검사, 데이터길이검사 등등)
        boolean result = md.signup( mid , mpw, mname, mphone ); // 임시
        return result;
    }

    //[2] 로그인 메소드
    public boolean login( String mid, String mpw ){
        System.out.println("MemberController.login");
        System.out.println("mid = " + mid + ", mpw : "+ mpw );
        boolean result = md.login( mid, mpw );
        return result;
    }
}
