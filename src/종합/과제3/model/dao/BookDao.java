package 종합.과제3.model.dao;

import 종합.과제3.model.dto.BookDto;
import 종합.과제3.model.dto.MemberDto;

import java.util.ArrayList;

public class BookDao {
    private BookDao(){}
    private static final BookDao instance = new BookDao();
    public static BookDao getInstance(){ return instance; }
    private ArrayList<BookDto> members = new ArrayList<>();
}
