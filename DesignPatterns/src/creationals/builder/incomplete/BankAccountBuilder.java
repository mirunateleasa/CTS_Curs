package creationals.builder.incomplete;

public class BankAccountBuilder implements iBuilder{
	
	//class to build private
		private BankAccount bankAccount;
		
	//constructor
		public BankAccountBuilder ()
		{
			bankAccount = new BankAccount();
		}
		
	//builders (setters + getters)
		public BankAccountBuilder setOwner (String owner)
		{
			bankAccount.setOwner(owner);
			return this;
		}
		
		public BankAccountBuilder setAmount (double amount)
		{
			bankAccount.setAmount(amount);
			return this;
		}
		
		public BankAccountBuilder setCurrency (String currency)
		{
			bankAccount.setCurrency(currency);
			return this;
		}
		
		public BankAccountBuilder setHasCard (boolean hasCard)
		{
			bankAccount.setHasCard(hasCard);
			return this;
		}
		
		public BankAccountBuilder setHasInternetBanking (boolean hasInternetBanking)
		{
			bankAccount.setHasInternetBanking(hasInternetBanking);
			return this;
		}
		
		public BankAccountBuilder setSalaryAccount (boolean isSalaryAccount)
		{
			bankAccount.setSalaryAccount(isSalaryAccount);
			return this;
		}
		

	//method got from interface
		@Override
		public BankAccount build() {
			return bankAccount;
		}

}
