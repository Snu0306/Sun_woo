import java.util.ArrayList;
import java.util.Iterator;
//account.iterator()
public class Bank {
	private ArrayList<Account> accounts;
	private int totalAccount;

	Bank() {
		accounts = new ArrayList<Account>();
	}

	// 계좌 생성
	public void addAccount(String accountNo, String name) {
		accounts.add(new Account(accountNo, name));
		totalAccount++;
	}

	// 이름으로 계좌들 찾기
	public ArrayList<Account> findAccounts(String name) {
		ArrayList<Account> acclist = new ArrayList<Account>();
		if (accounts.size() < 1) {
			System.out.println("현재 은행에 계좌가 없습니다.");
		} else {
			for (int i = 0; i < accounts.size(); i++) {
				if (accounts.get(i).getName().equals(name)) {
					Account acc = accounts.get(i);
					acclist.add(acc); // acclist에 acc를 추가한다
				}
			}
		}
		return acclist;
	}
	
	// Iterator 이용 
	public void findAccounts2(String name) {
		ArrayList<Account> namelist =new ArrayList<Account>();
		for(int i=0; i<accounts.size(); i++) {
			if(accounts.get(i).getName().equals(name)) {
			namelist.add(accounts.get(i));
			}
		}
		Iterator it = namelist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

	// 번호로 계좌 찾기
	public Account getAccount(String accountNo) {

		Account acc = null;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNo().equals(accountNo)) {
				acc = accounts.get(i);
			}
		}
		return acc;
	}

	// 모든 계좌정보
	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	// 총 계좌 개수
	public int getTotalAccount() {
		return totalAccount;
	}

}
