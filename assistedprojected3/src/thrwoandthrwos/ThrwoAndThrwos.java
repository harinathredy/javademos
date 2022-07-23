package thrwoandthrwos;

public class ThrwoAndThrwos {
	public static void main(String[] args) throws RuntimeException {
		ThrwoAndThrwos tat = new ThrwoAndThrwos();
		try {
			int WithdrawAmount = 1000;
			System.out.println("withdrawing: " + WithdrawAmount);
			tat.WithdrawnFromATM(WithdrawAmount, 1111111);
			System.out.println("Amount Withdrawn");
		} catch (RuntimeException ex) {
			System.out.println("Error occured:" + ex.getMessage());

		} finally {
			System.out.println("current balance is: " + tat.getBalanceFromAccount(1111111));
		}
	}

	void WithdrawnFromATM(int WithdrawAmount, int AccountNumber) {
		int balance = getBalanceFromAccount(AccountNumber);
		if (WithdrawAmount > balance) {
			throw new RuntimeException("Insufficient funds");
		}

	}

	int getBalanceFromAccount(int accountNumber) {

		return 500;
	}

}
