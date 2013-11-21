/**
 * 부록 CD 클래스
 * @author 이우형
 * 
 */
public class AppCDInfo extends CDInfo implements Lendable{
	String borrower;  		//대출인
	String checkOutDate; 	//대출일
	byte state;  			//대출상태
	/**
	 * 부록 CD 클래스 생성자
	 * @param registerNo : 관련번호
	 * @param title : 타이틀
	 */
	AppCDInfo(String registerNo, String title) {
		super(registerNo, title);
	}
	
	@Override
	public void checkOut(String borrower, String date) {
		if(state == 0){
			this.borrower = borrower;
			this.checkOutDate = date;
			this.state = 1;
			
			System.out.println("*" + this.title + "(이)가 대출되었습니다.");
			System.out.println("대출인:" + this.borrower);
			System.out.println("대출일:" + this.checkOutDate);
		}else{
			System.out.println("대출이 불가능 합니다.");
		}
	}
	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*" + this.title + "(이)가 반납되었습니다.");
	}
}
