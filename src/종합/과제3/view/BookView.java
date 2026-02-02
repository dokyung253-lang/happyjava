package 종합.과제3.view;

import 종합.과제3.controller.BookController;

public class BookView {
    private BookView(){}
    private static final BookView instance = new BookView();
    public static BookView getInstance(){return instance; }
    private BookController mc = BookController.getInstance();
}
