package 종합.과제3.controller;

import 종합.day28_2인과제_피드백.model.dao.MemberDao;

public class MemberController {
    private MemberController(){}
    private static final MemberController instance = new MemberController();
    public static MemberController getInstance(){ return instance; }
    private MemberDao md = MemberDao.getInstance();
}
