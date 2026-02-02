package 종합.day28_2인과제_피드백.view;

import 종합.day28_2인과제_피드백.controller.ProductController;

public class ProductView {
    private ProductView(){}
    private static final ProductView instance = new ProductView();
    public static ProductView getInstance(){ return instance ; }
    private ProductController pc = ProductController.getInstance();

}
