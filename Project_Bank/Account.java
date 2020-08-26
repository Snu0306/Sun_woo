import java.util.ArrayList;

public class Account {
	private String accountNo;
	private String name;
	private long balance;
	private ArrayList<Transaction> transactions;

	public Account(String accountNo, String name) {
		transactions = new ArrayList<Transaction>();
		this.accountNo = accountNo;
		this.name = name;
	}

	public void deposit(long amount) {
		this.balance += amount;
		transactions.add(new Transaction("입금", amount, balance));
		System.out.println(amount + "원 입금 하셨습니다.");
		System.out.println("현재 잔액은 " + balance + "원 입니다.");

	}

	public void withdraw(long amount) {
		this.balance -= amount;
		transactions.add(new Transaction("출금", amount, balance));
		System.out.println(amount + "원 출금 하셨습니다.");
		System.out.println("현재 잔액은 " + balance + "원 입니다.");
	}

	@Override
	public String toString() {
		return "[계좌번호 =" + accountNo + ", 이름 =" + name + ", 잔액 =" + balance + "]";
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTrasactions(ArrayList<Transaction> trasactions) {
		this.transactions = trasactions;
	}

}
