
public class main {

	public static void main(String[] args) {

		Bank bank = new Bank();
		bank.addAccount("12321", "박선우");
		bank.addAccount("67876", "박선우");
		bank.addAccount("23432", "박선우2");
		bank.addAccount("34543", "박선우3");
		bank.addAccount("45654", "박선우4");

		System.out.println("= 해당 계좌번호의 계좌정보 =");
		System.out.println(bank.getAccount("12321"));

		bank.getAccount("12321").deposit(99290000);
		bank.getAccount("12321").deposit(22222000);
		bank.getAccount("12321").withdraw(5000);

		System.out.println("= 해당 계좌번호의 계좌정보 =");
		System.out.println(bank.getAccount("12321"));

		System.out.println("= 해당 이름의 계좌정보 =");
		System.out.println(bank.findAccounts("박선우"));
		bank.findAccounts2("박선우");

		System.out.println("=== 거래내역 ===");
		System.out.println(bank.getAccount("12321").getTransactions());

		System.out.println("모든 계좌 정보 :" + bank.getAccounts());
		System.out.println("총 계좌의 개수는 " + bank.getTotalAccount() + "개");

	}

}
