package 종합.과제2인.model.dao;
import 종합.과제2인.model.dto.WaitingDto;
import java.util.ArrayList;
public class WaitingDao {
    private WaitingDao(){}
    private static final WaitingDao instance=new WaitingDao();
    public static WaitingDao getInstance(){
        return instance;
    }
    private final ArrayList<WaitingDto> waitings=new ArrayList<>();
    private static int currentNo=1; // [*] 자동회원번호 부여하기 위한 최신 회원번호
    // [1] 회원가입
    public boolean doPost(String phone, int people){
        System.out.println("WaitingDao.doPost"); // sout + m (필수는 아니지만 중간중간 찍어놓으면 편함 = console.log)
        System.out.println("phone = " + phone + ", people = " + people); // sout + p (= console.log)
        WaitingDto waitingDto=new WaitingDto(currentNo, phone, people); // 1. 회원 객체(dto) 생성한다.
        boolean result=waitings.add(waitingDto); // 2. 회원객체를 리스트에 저장한다.
        currentNo++;
        return result;
    }
    public ArrayList<WaitingDto> doGet(){
        return waitings;
    }
}