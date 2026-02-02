package 종합.과제2인.controller;
import 종합.과제2인.model.dao.WaitingDao;
import 종합.과제2인.model.dto.WaitingDto;
import java.util.ArrayList;
import java.util.List;

public class WaitingController {
    private List<Object> members;

    private WaitingController(){};
    private static final WaitingController instance=new WaitingController();
    public static WaitingController getInstance(){
        return instance;
    }
    private WaitingDao wd=WaitingDao.getInstance();
    // [1] 회원가입메소드
    public boolean doPost(String phone, int people){
        boolean result=wd.doPost(phone, people);
        return result;
    }

    public ArrayList<WaitingDto> doGet(){
        ArrayList<WaitingDto> result=wd.doGet();
        return result;
    }
}

