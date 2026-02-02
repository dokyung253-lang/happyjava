package 종합.과제3.view;

import 종합.과제3.controller.AdminController;

public class AdminView {
    private AdminView(){}
    private static final AdminView instance = new AdminView();
    public static AdminView getInstance(){ return instance; }
    private AdminController mc = AdminController.getInstance();
}
