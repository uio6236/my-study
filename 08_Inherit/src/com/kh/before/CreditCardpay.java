package com.kh.before;

public class CreditCardpay {
	private String payName;
	private int payAmount;
	private String cardnumber;
	private int installment;
	
	public CreditCardpay(String payName, int payAmount, String cardnumber, int installment) {
		this.payName = payName;
		this.payAmount = payAmount;
		this.cardnumber = cardnumber;
		this.installment = installment;
	}
	public String getPayName() {return payName;}
	public void setPayName(String payName) {this.payName = payName;}
	public int getPayAmount() {return payAmount;}
	public void setPayAmount(int payAmount) {this.payAmount = payAmount;}
	public String getCardnumber() {return cardnumber;}
	public void setCardnumber(String cardnumber) {this.cardnumber = cardnumber;}
	public int getInstallment() {return installment;}
	public void setInstallment(int installment) {this.installment = installment;}
	public void processPay() {
		System.out.println(" === 카드 결제 정보 ===");
		System.out.println("- 결제 금액 : " + payAmount);
		System.out.println("- 카드 번호 : " + cardnumber);
		// System.out.println("- 할부 개월 수 : " + installment);
		System.out.println("- 할부 개월 수 : " + 
						(installment == 0 ? "일시불" : installment + "개월"));
	}
}
