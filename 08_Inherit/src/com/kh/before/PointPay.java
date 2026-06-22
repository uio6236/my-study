package com.kh.before;
public class PointPay {
	private String payName;
	private int payAmount;
	private int myPoint;
	
	public PointPay(String payName, int payAmount, int myPoint) {
		this.payName = payName;
		this.payAmount = payAmount;
		this.myPoint = myPoint;
	}
	public String getPayName() {return payName;}
	public void setPayName(String payName) {this.payName = payName;}
	public int getPayAmount() {return payAmount;}
	public void setPayAmount(int payAmount) {this.payAmount = payAmount;}
	public int getMyPoint() {return myPoint;}
	public void setMyPoint(int myPoint) {this.myPoint = myPoint;}
	public void processPay() {
		System.out.println(" === 포인트 결제 방식 === ");
		System.out.println("- 결제 금액 : " + payAmount);
		System.out.println("- 내 포인트 잔액 : " + myPoint);
		System.out.println(payAmount < myPoint ? "결제 성공" : "결제 실패(잔액 부족)");
	}
}
