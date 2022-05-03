package creationals.builder.incomplete;

public class Main {

	public static void main(String[] args) {
		//without builder
			BankAccount account = new BankAccount();
			account.setOwner("Miruna");
			account.setCurrency("RON");
			account.setHasCard(true);
			account.setSalaryAccount(false);
			account.setHasInternetBanking(false);
			
			System.out.println(account);
		
		//with builder
			BankAccount builtAccount = new BankAccountBuilder()
					.setOwner("Miruna2")
					.setCurrency("RON")
					.setHasCard(true)
					.setSalaryAccount(false)
					.setHasInternetBanking(false)
					.build();
			System.out.println(builtAccount);
	}

}
