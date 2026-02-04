package 종합.day28_2인과제_피드백.model.dao;

public class ProductDao {
    private ProductDao(){}
    private static final ProductDao instance = new ProductDao();
    public static ProductDao getInstance(){ return instance; }
}
