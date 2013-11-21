/**
 *  단행본 클래스
 *  @author 이우형
 *
 */

class SeparateVolume implements Lendable{
	String requestNo;//청구번호
	String bookTitle;//제목
	String Writer; //저자
	String borrower; //대출인
	String checkOutDate; //대출일
	byte state; //대출상태
	/**
	 * 단행본 클래스 생성자
	 * @param requestNo : 청구번호
	 * @param bookTitle : 제목
	 * @param writer : 저자
	 */
	public SeparateVolume(
		String requestNo, String bookTitle, String writer){
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.Writer = writer;
	}
	@Override
	public void checkOut(String borrower, String date) {
		if(state == 0){
			this.borrower = borrower;
			this.checkOutDate = date;
			this.state = 1;
			System.out.println("*" + bookTitle + "(이)가 대출되었습니다.");
			System.out.println("대출인:" + this.borrower);
			System.out.println("대출일:" + this.checkOutDate);
			
			
		}else {
			System.out.println("대출이 불가능 합니다.");
		}
	}                                                 //0:대출가능 1:대출불가
	
	
	@Override
	public void checkIn() {	
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*" + bookTitle + "(이)가 반납되었습니다.");
	}
}






