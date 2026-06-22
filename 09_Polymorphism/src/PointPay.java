//[1] 공통 부분 제거
//[2] 상속 관계 적용
//[3] getter, setter, 생성자 등을 활용해서 원래 기능이 동작되도록 처리
public class PointPay extends PaymentMethod {
	private int myPoint;
	public PointPay() {}
	public PointPay(String payName, int payAmount, int myPoint) {
		super(payName, payAmount);
		this.myPoint = myPoint;
	}
	public int getMyPoint() {return myPoint;}
	public void setMyPoint(int myPoint) {this.myPoint = myPoint;}
	public void processPay() {
		System.out.println(" === 포인트 결제 방식 === ");
		System.out.println("- 결제 금액 : " + getPayAmount());
		System.out.println("- 내 포인트 잔액 : " + myPoint);
		System.out.println(getPayAmount() < myPoint ? "결제 성공" : "결제 실패(잔액 부족)");
	}
}