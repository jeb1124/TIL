package self.bank;

public class Account {
	private int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amt) {
		if(amt<1000) {
			System.out.println("�Աݾ��� 1õ�� �̻��̾�� �մϴ�!!");
			return;
		}else {
			balance += amt;
		}
	}
	
	public void withdraw(int amt) {
		if(amt<=balance) {
			System.out.println("��ݾ��� �ʹ� �����ϴ�.");
			return;
		}else {
			balance -= amt;
		}
	}	//

	@Override
	public String toString() {
		return "���� �ܾ���"+balance+" �� �Դϴ�.";
	}
	
	
	
}//class

