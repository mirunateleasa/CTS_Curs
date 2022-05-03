package creationals.builder.incomplete;

public class BankAccount {
	//class attributes
		private String owner;
		private double amount;
		private String currency;
		private boolean hasCard;
		private boolean hasInternetBanking;
		private boolean isSalaryAccount;
		
		
	//toString method
		@Override
		public String toString() {
			return "BankAccount [owner=" + owner + ", amount=" + amount + ", currency=" + currency + ", hasCard="
					+ hasCard + ", hasInternetBanking=" + hasInternetBanking + ", isSalaryAccount=" + isSalaryAccount
					+ "]";
		}
		
	//constructors
		//default constructor
			public BankAccount()
			{
				
			}
			
		//fields constructor
			public BankAccount(String owner, double amount, String currency, boolean hasCard, boolean hasInternetBanking,
					boolean isSalaryAccount) {
				super();
				this.owner = owner;
				this.amount = amount;
				this.currency = currency;
				this.hasCard = hasCard;
				this.hasInternetBanking = hasInternetBanking;
				this.isSalaryAccount = isSalaryAccount;
			}
			
	//getters and setters
			public String getOwner() {
				return owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public double getAmount() {
				return amount;
			}

			public void setAmount(double amount) {
				this.amount = amount;
			}

			public String getCurrency() {
				return currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public boolean isHasCard() {
				return hasCard;
			}

			public void setHasCard(boolean hasCard) {
				this.hasCard = hasCard;
			}

			public boolean isHasInternetBanking() {
				return hasInternetBanking;
			}

			public void setHasInternetBanking(boolean hasInternetBanking) {
				this.hasInternetBanking = hasInternetBanking;
			}

			public boolean isSalaryAccount() {
				return isSalaryAccount;
			}

			public void setSalaryAccount(boolean isSalaryAccount) {
				this.isSalaryAccount = isSalaryAccount;
			}
			

}
