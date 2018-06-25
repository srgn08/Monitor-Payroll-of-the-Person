
public class Manager extends Personnel{
	/**
	 * define base salary
	 */
	private final int baseSalary=1800;
	String name1;
	String surname1;
	 int[] workHour=new int[4];
	 int i=0,result=0;
	 public void control(int work){
		
		 workHour[i]=work;
		 i++;
	 }
	
	/**
	 * this is manager constructor
	 * @param name
	 * @param registration_number
	 * @param position
	 * @param year
	 */
	public Manager(String name,String registration_number,String position, int year)
	{
		super(name,registration_number,position,year);
	}
	public Manager() {
		
	}

	
	/**
	 * calculate benefits
	 */
	public float ssBenefits()
	{
		return baseSalary*135/100;
	}
	
	/**
	 * calculate severance pay
	 */
	public double severancePay()
	{
		return ((2016-this.getYear())*20*0.8);
	}
	
	/**
	 * calculate over work salary
	 */
	public int overWorkSalary()
	{
		for(int j=0; j<workHour.length;j++)
		{
			if(workHour[j]>=40 && workHour[j]<=48)
			{
				result+=workHour[j]-40;
			}
			else 
				result+=8;
		}
		result*=5;
		return result;
	}
	
	/**
	 * calculate total salary
	 */
	public double calculateTotalSalary()
	{
		double total=overWorkSalary()+severancePay()+ssBenefits()+baseSalary;
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
