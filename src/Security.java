
public class Security extends Personnel {
	private int[] workHour=new int[4];
	int i=0,result=0;
	String name1,surname1;
	 public void control(int work){
		 
		 workHour[i]=work;
		 i++;
	 }
	
	/**
	 * this is security constructor
	 * @param name
	 * @param registration_number
	 * @param position
	 * @param year
	 */
	public Security(String name,String registration_number,String position, int year)
	{
		super(name,registration_number,position,year);
	}
	public 	Security() {
		
	}
	/**
	 * calculate severance pay
	 */
		public double severancePay()
		{
			return ((2016-this.getYear())*20*0.8);
		}
		
		/**
		 * calculate hour of work
		 */
		public double hourOfWork()
		{
			for(int j=0; j<workHour.length;j++)
			{
				if(workHour[j]>=30 && workHour[j]<=54)
				{
					result+=workHour[j]*6.5;
				}
			}
				return result;
		}
		
		/**
		 * calculate trans money
		 */
		public int transMoney()
		{
			int result2=24*4;
			return result2;
		}
		/**
		 * calculate food money
		 */
		public int foodMoney()
		{
			int result3=24*5;
			return result3;
		}
		
		/**
		 * calculate total salary
		 */
		public double calculateTotalSalary()
		{
			double total=hourOfWork()+severancePay()+transMoney()+foodMoney();
			return total;
		}
		
		/**
		 * split function split name and throw name1 and surname1 variables
		 */
		public void split()
		{
			String[] parts=this.getName().split(" ");
			name1=parts[0]+" ";
			for(int l=1;l<parts.length-1;l++){
			name1+=parts[l]+" ";
			}
			surname1=parts[parts.length-1];
		}

		@Override
		/**
		 * this to string return writing data
		 */
		public String toString() {
			String strDouble = String.format("%.2f",calculateTotalSalary()); 
			strDouble = strDouble.replace(",", ".");
			return "Name : " + name1 + "\r\n"+"\r\n"+"Surname : " + surname1+"\r\n"+"\r\n"
					+ "Registration Number : " + getRegistration_number()+ "\r\n"+"\r\n"
					+ "Position : " + getPosition() +"\r\n"+"\r\n"+ "Year of Start : "
					+ getYear()+"\r\n"+"\r\n"+ "Total Salary : " + strDouble+" TL";
		}
		
		
		
	

}
