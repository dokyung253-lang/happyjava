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
        return result; // 3. 저장 성공 여부를 반환한다.
    }

    // [2] 로그인( 현재 정보와 기존 정보를 비교하는 작업 )
    public boolean login( String mid, String mpw ){
        System.out.println("MemberDao.login");
        System.out.println("mid = "+ mid +", mpw = " + mpw );
        for( int index=0; index <= members.size(); index++ ){ // 1. 리스트(배열) 0부터 마지막 인덱스까지 반복한다.
            MemberDto memberDto = members.get(index); // 2. index번째 회원객체를 꺼낸다.
            // 3. 만약에 index번째 회원객체 내 아이디와 비밀번호가 입력받은 아이디/비밀번호 같다면
            if( memberDto.getMid().equals(mid)&& memberDto.getMpw().equals(mpw)){
                return true; // 4. 로그인성공
            }
        }// for end
return false;  // 5. 반복문 중에 동일한 정보가 없다면 로그인 실패
    }


}

