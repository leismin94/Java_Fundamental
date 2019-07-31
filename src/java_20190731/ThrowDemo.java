package java_20190731;
// 사용자 정의를 만드는이유는 A라는 오류가 발생했을 때 오류가 난 클래스로 가서 바로 고치려고
public class ThrowDemo {
	public static double withdraw(String account, int amount) 
		throws IncorrectAccountException,InsufficientBalanceException { // 정확하게 이 에러가 발생함을 명시한다.
		double myBalance = 10000;
		String myAccount = "123-12-1231234";
		if (myAccount.equals(account)) {
			if(myBalance - amount>=0) {
				myBalance -= amount;
			}else {
				throw new InsufficientBalanceException("잔고가 부족합니다.");
			}
		} else {
			throw new IncorrectAccountException("잘못된 계정입니다.");
		}
		return myBalance;
	}

	public static void main(String[] args) {
		double balance = 0;
		try { 
			balance = withdraw("123-12-123123", 100000);
		} catch (IncorrectAccountException e) {
			System.out.println(e.getMessage());
		}catch(InsufficientBalanceException e1) {
			System.out.println(e1.getMessage());
		}
	}

}
