
public class PartTime extends Employee{
	private int[] workHour=new int[4];
	int i=0,result=0;
	String name1,surname1;
	 public void control(int work){
		 
		 workHour[i]=work;
		 i++;
	 }
	 /**
		 * this is part time constructor
		 * @param name
		 * @param registration_number
		 * @param position
		 * @param year
		 */ 
	public PartTime(String name,String registration_number,String position, int year)
	{
		super(name,registration_number,position,year);
	}
	public PartTime() {
		
	}
	/**
	 * calculate hour of work
	 */
	public double hourOfWork()
	{
		for(int j=0; j<workHour.length;j++)
		{
			if(workHour[j]<10)
				return 0;
			if(workHour[j]>=10 && workHour[j]<=20)
			{
				result+=workHour[j]*12;
			}
			else if(workHour[j]>20)
				result+=20*12;
		}
			return result;
	}
	/**
	 * calculate total salary
	 */
	public double calculateTotalSalary()
	{
		double total=hourOfWork();
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
