package 종합.과제3.model.dao;

import 종합.과제3.model.dto.AdminDto;

import java.util.ArrayList;

public class AdminDao {
    private AdminDao(){}
    private static final AdminDao instance = new AdminDao();
    public static AdminDao getInstance(){ return instance; }
    private ArrayList<AdminDto> members = new ArrayList<>();
}
