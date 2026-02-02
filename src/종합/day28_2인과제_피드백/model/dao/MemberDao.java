package 종합.day28_2인과제_피드백.model.dao;

import 종합.day28_2인과제_피드백.model.dto.MemberDto;
import java.util.ArrayList;

public class MemberDao {
    private MemberDao(){}
    private static final MemberDao instance = new MemberDao();
    public static MemberDao getInstance(){return instance; }
    private ArrayList<MemberDto> members = new ArrayList<>();
    private int currentMno = 1; // 자동회원번호 부여하기 위한 최신 회원번호

    //[1] 회원가입
    public boolean signup ( String mid, String mpw, String mname, String mphone ){
        System.out.println("MemberDao.signup"); // sout+m
        System.out.println("mid = " + mid + ", mpw = " + mpw + ", mname = " + mname + ", mphone = " + mphone); // sout+ p
        MemberDto memberDto = new MemberDto(currentMno, mid, mpw, mname, mphone); // 1. 회원객체[dto] 생성한다.
        boolean result = members.add(memberDto);
        if(result){currentMno++;} // [*] 저장성공 시 회원번호 1 증가
    }

}

