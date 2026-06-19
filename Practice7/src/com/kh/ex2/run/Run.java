package com.kh.ex2.run;
import com.kh.ex2.model.vo.Book;
public class Run {

	public static void main(String[] args) {
		Book A = new Book("객체지향의 사실과 오해", "조영호", "위키북스", 25000, 0.1);
		Book B = new Book("클린 코드", "로버트 C. 마틴", "인사이트", 38000, 0.15);
		Book C = new Book("실용주의 프로그래머", "앤드류 헌트, 데이비드 토마스", "인사이트", 35000, 0.15);
		
		A.inform();
		B.inform();
		C.inform();
	}

}
