package creationals.singleton.eager;

public class Agency {
	//specific attributes
		private String name;
		private float income;
		private int empNo;
		
	//instance (final)
		private static final Agency instance = new Agency();

	//constructor private
		private Agency() {
			this.name = "NAME";
			this.income = 1000;
			this.empNo = 5;
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
			return instance;
		}
}
