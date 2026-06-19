package com.kh.ex1.run;
import com.kh.ex1.model.vo.Product;
public class Run {

	public static void main(String[] args) {
		Product c1 = new Product();
		Product c2 = new Product();
		c1.setProductName("아이폰16");
		c1.setPrice(1000000);
		c1.setBrand("애플");
		c2.setProductName("갤럭시 S25");
		c2.setPrice(1350000);
		c2.setBrand("삼성");
		
		c1.information();
		c2.information();
	}

}
