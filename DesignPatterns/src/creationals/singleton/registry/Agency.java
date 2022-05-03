package creationals.singleton.registry;

import java.util.HashMap;

public class Agency {
	
	//make the registry:
	private static HashMap<String, Agency> agencies = new HashMap<>();
	
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
			
			public static void addToRegistry (Agency agency ) throws Exception
			{
				if (agencies.containsKey(agency.income))
					throw new Exception ("Income " + agency.income + " already here!");
				else
					agencies.put(String.valueOf(agency.income), agency);
			}
		
			public static  Agency getInstance(float income) {
				return agencies.get(income);
			}
}
