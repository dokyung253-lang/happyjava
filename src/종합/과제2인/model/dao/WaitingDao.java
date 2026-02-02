package 종합.과제2인.model.dao;

import 종합.과제2.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingDao {
    private WaitingDao(){}
    private static final WaitingDao instance=new WaitingDao();
    public static WaitingDao getInstance(){
        return instance;
    }
    private final ArrayList<WaitingDto> waitings=new ArrayList<>();
    private static int currentNo=1;
    public boolean doPost(String phone, int people){
        WaitingDto waitingDto=new 종합.과제2인.model.dao.WaitingDto(currentNo, phone, people);
        boolean result=waitings.add(waitingDto);
        currentNo++;
        return result;
    }
    public ArrayList<WaitingDto> doGet(){
        return waitings;
    }
}