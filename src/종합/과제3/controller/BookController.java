package 종합.과제3.controller;

import 종합.과제3.model.dao.BookDao;

public class BookController {
    private BookController(){}
    private static final BookController instance = new BookController();
    public static BookController getInstance(){ return instance; }
    private BookDao md = BookDao.getInstance();

}
