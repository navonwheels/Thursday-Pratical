public class Holiday
{
	
	private String name;
	private int day;
	private String month;
		


	public Holiday()
{
		 this.name =name;
		 this.day =day;
		 this.month =month;
		
}

	public String getName() 
{
	return name;	
}

	public void setName(String name)
{
	this.name =name;
}

	public int getDay()
{
	return day;
}

	public void setDay(int day)
{
	this.day =day;
}
	public String getMonth() 
{
	return month;
}
	public void setMonth(String month)	
{
	this.month =month;
}
	public static void main(String args[])
{
	

	Holiday call = new Holiday();
	call.setName("Independance Day");
	call.setDay(15);
	call.setMonth("August");
	System.out.println(call.getName());
	System.out.println(call.getDay());
	System.out.println(call.getMonth());
}
}

