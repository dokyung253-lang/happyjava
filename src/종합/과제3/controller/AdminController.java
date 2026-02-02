package 종합.과제3.controller;

import 종합.과제3.model.dao.AdminDao;

public class AdminController {
    private AdminController() {}
    private static final AdminController instance = new AdminController();
    public static AdminController getInstance() {return instance;}
    private AdminDao md = AdminDao.getInstance();

    //[1] 회원가입 메소드
    public boolean signup( String aid, String apw, String aname, String aphone){
        System.out.println("AdminController.signup");
        System.out.println("aid = " + aid + ", apw = " + apw + ", aname = " + aname + ", aphone = " + aphone);

        // 유효성검사
        return true;
    }

}

