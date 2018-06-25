
public class Personnel {
	private String name;
	private String registration_number;
	private String position;
	private int year;
	
	/**
	 * this is personnel constructor
	 * @param name
	 * @param registration_number
	 * @param position
	 * @param year
	 */
	public Personnel(String name, String registration_number, String position,
			int year) {
		this.name = name;
		this.registration_number = registration_number;
		this.position = position;
		this.year = year;
	}
	
	public Personnel()
	{
		
	}

	/**
	 * this is getter and setter for each variable types
	 * @return
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegistration_number() {
		return registration_number;
	}
	public void setRegistration_number(String registration_number) {
		this.registration_number = registration_number;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public float ssBenefits()
	{
		return -1;
	}
	
	public double severancePay()
	{
		return -1;
	}
	
	public int overWorkSalary()
	{
		return -1;
	}
	public double hourOfWork()
	{
		return-1;
	}
	
	public double calculateTotalSalary()
	{
		return -1;
	}
	
	
	
	

}
