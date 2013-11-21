interface Lendable {
	/**
	 *
	 * 대출한다.
	 * @param borrower : 대출자 이름
	 * @param date : 대출 날짜
	 */
    abstract void checkOut(String borrower, String date); 
    /**
     * 반납한다.
     */
    abstract void checkIn(); 
}