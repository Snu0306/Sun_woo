import java.util.Calendar;

public class Transaction {
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;
	private long balance;

	public Transaction(String kind, long amount, long balance) {
		Calendar cla = Calendar.getInstance();
		this.transactionDate = cla.get(Calendar.YEAR) + "년 " + cla.get(Calendar.MONTH) + "월 " + cla.get(Calendar.DATE)
				+ "일";
		this.transactionTime = cla.get(Calendar.HOUR) + "시 " + cla.get(Calendar.MINUTE) + "분";
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "[" + transactionDate + transactionTime + ", kind=" + kind + ", 거래금액 =" + amount + ", 잔액 =" + balance
				+ "]";
	}

}
