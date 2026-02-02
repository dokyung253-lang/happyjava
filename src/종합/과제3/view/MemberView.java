package 종합.과제3.view;

import 종합.과제3.controller.MemberController;

public class MemberView {
    private MemberView(){}
    private static final MemberView instance = new MemberView();
    public static MemberView getInstance(){ return instance; }
    private MemberController mc = MemberController.getInstance();
    }
