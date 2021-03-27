package exception.user.test;

class AmountInputException extends Exception{
	AmountInputException(){
		this("입금액은 1만원 이상부터 가능합니다.");
	}
	AmountInputException(String message){
		super(message);
	}
}

class InvalidAmountException extends Exception{
	InvalidAmountException(){
		this("잔액보다 출금하려는 금액이 너무 많습니다.");
	}
	InvalidAmountException(String message){
		super(message);
	}
}


class Account{
	int balance;
	
	public Account(int balance) {
		super();
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public void deposit(int amt) throws AmountInputException  {
		//입금하는 로직
		//입금액이 10000원이 안되면 AmountInputException 발생
		
		//정상적인 입금이면 잔액에 금액을 추가하고 얼마가 입금되었고 잔액은 얼마인지
		if(amt<10000) {
			throw new AmountInputException();
		}else {
			balance += amt;
			System.out.println(amt + "원 입금완료!");
			System.out.println("현재 잔액은 " + balance + "원 입니다.");
		}
	}
	public void withdraw(int amt) throws InvalidAmountException {
		//출금하는 로직
		//현재 잔액보다 더 많은 금액을 출금하려는 경우 InvalidAmountException 발생
		
		//출금액이 잔액보다 작거나 같다면 잔액에서 출금액을 빼고.. 얼마 출금했는지와 남아있는 잔액 출력
		if(amt>balance) {
			throw new InvalidAmountException();
		}else {
			balance -= amt;
			System.out.println(amt + "원 출금완료!!");
			System.out.println("현재 잔액은 " + balance + "원 입니다.");
		}
	}
}

public class BankAccountExceptionTest4 {

	public static void main(String[] args) {
		/*
		 * 객체 생성
		 * 메소드 각각 호출... 예외를 여기서 잡아준다
		 */
		Account acc = new Account(10000);
		try {
			acc.deposit(20000);
		}catch(AmountInputException e) {
			System.out.println(e.getMessage());
		}
		try {
			acc.deposit(200);
		}catch(AmountInputException e) {
			System.out.println(e.getMessage());
		}
		try {
			acc.withdraw(5000);
		}catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
		try {
			acc.withdraw(500000);
		}catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
	}
}