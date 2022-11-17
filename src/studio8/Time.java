package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Time {

	private int hour; //0-23
	private int minute; // 0-59
	boolean army;


	public Time(int hour, int minute, boolean army)
	{
		this.hour = hour;
		this.minute = minute;
		this.army = army;

	}


	public String toString()
	{
		if(army == true)
		{
			return hour + ":" + minute;
		}
		else if (army == false && hour>12)
		{
			return (hour-12) + ":" + minute;
		}
		else if(army == false && hour<=12)
		{

			return hour + ":" + minute;
		}
return "";

	}	


	public static void main(String[] args) {

		Time one = new Time(20, 56, true);
		Time two = new Time(22, 15, false);
		Time three = new Time(12, 23, false);
		Time four = new Time (3,30, true);		
		Time five = new Time(20, 56, true);

		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		
		
		System.out.println(one.equals(five));
		
		LinkedList<Time> list = new LinkedList<Time>();
		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
		
		System.out.println(list);
		

	}


	@Override
	public int hashCode() { //give an object and it returns something specific to that object - for a student class, hash code takes in all things specific to that object and makes it unique . if hash codes are the same then objects are equal. hash code gives distinct value for every distinct object
		return Objects.hash(army, hour, minute);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return army == other.army && hour == other.hour && minute == other.minute;
	}

}