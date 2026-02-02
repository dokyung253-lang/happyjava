package 종합.과제3.model.dao;

public class AdminDao {
    private AdminDao(){}
    private static final AdminDao instance = new AdminDao();
    public static AdminDao getInstance(){ return instance; }

}
