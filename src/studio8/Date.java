package studio8;

public class Date { // mm-dd-yy

	private int month; //1-12
	private int day; // goes from 1 -31
	private int year;
	private boolean holiday;
	
	
	public Date(int month, int day, int year, boolean holiday)
	{
		this.month = month;
		this.day = day;
		this.year = year;
		holiday = false;
		
	}
	
	
	
	public String toString()
	{
		if(holiday)
		{
			return month + "/" + day + "/" + year + " Happy Holidays!";
		}
		if (holiday == false)
		{
			return month + "/" + day + "/" + year + " Boring day today";
		}
		
return "";

	}	


    public static void main(String[] args) {
    	

    	
    	
    }

}
