package self.bank;

public class BankService {
	
	public static final int MAX_CUSTOMERS = 100;
	public Customer[] customers;
	public int numberOfCustomers;
	
	private static BankService bank = new BankService();
	private BankService() {
		customers =new Customer[MAX_CUSTOMERS];
		numberOfCustomers = 0;
	}
	
	public static BankService getInstance() {
		return bank;
	}
	
	public void addCustomer(Customer cust) {
		//구현..배열에 cust를 추가한다.
		if(numberOfCustomers==MAX_CUSTOMERS) {
			System.out.println("더 이상 회원을 받을 수 없습니다...");
			return;
		}
		customers[numberOfCustomers++] = cust;
	}
	
	public Customer getCustomer(int ssn) {
		Customer cust = null;
		//구현
		for(int i=0; i<numberOfCustomers; i++) {
			if(customers[i].getSsn()==ssn) cust = customers[i];	
		}
		return cust;
	}
	
	public void showAll() {
		if(numberOfCustomers == 0) {
			System.out.println("회원이 아무도 없습니다.");
			return;
		}
		//구현
		//여기서 출력되도록 합니다...return type이 void^^
		for(int i=0; i<numberOfCustomers; i++) {
			System.out.println(customers[i]);
		}
	}
}
