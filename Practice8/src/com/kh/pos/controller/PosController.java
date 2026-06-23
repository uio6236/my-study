package com.kh.pos.controller;
import com.kh.pos.model.*;

public class PosController {
    private Customer customer;
    private PaymentMethod[] paymentList;
    public PosController() {
    	paymentList = new PaymentMethod[4];
        paymentList[0] = new MobilePay("네이버페이", 12, 1000000, "NAVER");
        paymentList[1] = new MobilePay("토스페이", 14, 2000000, "토스");
        paymentList[2] = new CardPayment("국민 나라사랑카드", 12, 500000, true);
        paymentList[3] = new CardPayment("신한 체크카드", 8, 300000, false);
    }
    		
    public void insertCustomer(Customer c){
    	customer = c;
    }
    public Customer getCustomerInfo(){
    	return customer;
    }
    public PaymentMethod[] selectAllMethods(){
    	return paymentList;
    }
    public PaymentMethod[] searchMethod(String keyword) {
    	PaymentMethod[] result = new PaymentMethod[paymentList.length];
    	int index = 0;
    	for(PaymentMethod method : paymentList) {
    		String methodName = method.getName();
    		// * 문자열.contains(키워드) : 문자열 내에 키워드가 포함되어 있으면 t, 그렇지 않으면 f
    		// ex) "application.contains("cat") => true
    		if (methodName.contains(keyword)) {
    			// 결제명 내에 keyword가 포함된 경우
    			result[index] = method;
    			index++;
    			// result[index++] = method;
    		}
    	}
    	return result;
    }
    public int proceessPayment(int index){
    	PaymentMethod method = paymentList[index];
    	// 1) 기본 연령 미달 또는 모바일 페이 보안 기준 미달 1 리턴
    	//		+ 해당 결제 수단이 모바일 페이인 경우 나이가 제한연령+3세에 해당하는지?
    	int customerAge = customer.getAge();
    	int methodMinAge = method.getMinAge();
    	if (method instanceof MobilePay && customerAge <= methodMinAge + 3) {
    		return 1;
    	}
    	if (customerAge <= methodMinAge) {
    		return 1;
    	}
    	if (method instanceof CardPayment && ((CardPayment) method).isHasCashback()) {
    		int currPoint = customer.getPoints();
    		customer.setPoints(currPoint + 500); 
    		return 2;
    	}
    	return 0;
    }
}

