
public class FullTime extends Employee{
	
	/**
	 * this is full time class constructor
	 * @param name
	 * @param registration_number
	 * @param position
	 * @param year
	 */
	public FullTime(String name,String registration_number,String position, int year)
	{
		super(name,registration_number,position,year);
	}
	public FullTime() {
		
	}
	
	public int dayOfWork()
	{
		return -1;
	}

}
