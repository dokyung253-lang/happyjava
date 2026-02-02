package 종합.day28_2인과제_피드백.controller;

import 종합.day28_2인과제_피드백.model.dao.ProductDao;

public class ProductController {
    private ProductController(){}
    private static final ProductController instance = new ProductController();
    public static ProductController getInstance(){ return instance; }
    private ProductDao pd = ProductDao.getInstance();

}