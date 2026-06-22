public class CreditCardPay extends PaymentMethod {
	private String cardnumber;
	private int installment;

    public CreditCardPay() {}
	public CreditCardPay(String payName, int payAmount, 
						String cardnumber, int installment) {
		// this.payName = payName; => PaymentMehtod 클래스에서 private으로 선언된 필드이기 때문에 접근 불가
		// [1] setter 메소드를 사용하여 부모 클래스로부터 물려받은 필드에 대입(저장)
		// setPayName(payName);
		// setPayAmount(payAmount);
		// [2] 부모 클래스의 생성자 사용(호출) **
		super(payName, payAmount);
		this.cardnumber = cardnumber;
		this.installment = installment;
	}
	
	public String getCardnumber() {return cardnumber;}
	public void setCardnumber(String cardnumber) {this.cardnumber = cardnumber;}
	public int getInstallment() {return installment;}
	public void setInstallment(int installment) {this.installment = installment;}
	public void processPay() {
		System.out.println(" === 카드 결제 정보 ===");
		// System.out.println("- 결제 금액 : " + payAmount);
		System.out.println("- 결제 금액 : " + getPayAmount());
		System.out.println("- 카드 번호 : " + cardnumber);
		// System.out.println("- 할부 개월 수 : " + installment);
		System.out.println("- 할부 개월 수 : " + 
						(installment == 0 ? "일시불" : installment + "개월"));
	}
}