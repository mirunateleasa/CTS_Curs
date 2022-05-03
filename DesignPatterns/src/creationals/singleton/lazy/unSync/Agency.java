package creationals.singleton.lazy.unSync;

public class Agency {
		//specific attributes
			private String name;
			private float income;
			private int empNo;
			
		//instance
			private static  Agency instance = null;

		//constructor private
			private Agency(String name, float income, int empNo) {
				this.name = name;
				this.income = income;
				this.empNo = empNo;
			}
			
		//getters and setters
			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public float getIncome() {
				return income;
			}

			public void setIncome(float income) {
				this.income = income;
			}

			public int getEmpNo() {
				return empNo;
			}

			public void setEmpNo(int empNo) {
				this.empNo = empNo;
			}

			public static Agency getInstance(String name, float capital, int empNo) {
				if (instance == null)
				{
					instance = new Agency (name, capital, empNo);
				}
				return instance;
			}
}
