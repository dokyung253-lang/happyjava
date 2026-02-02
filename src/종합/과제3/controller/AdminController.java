package 종합.과제3.controller;

import 종합.과제3.model.dao.AdminDao;

public class AdminController {
    private AdminController() {}
    private static final AdminController instance = new AdminController();
    public static AdminController getInstance() {return instance;}
    private AdminDao md = AdminDao.getInstance();
}

