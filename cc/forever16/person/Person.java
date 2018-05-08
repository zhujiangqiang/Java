package cc.forever16.person;
import java.util.*;
import java.time.*;
public class Person implements PersonBaseInfo
{
	
	protected String name;
	protected String tel;
	protected String tender;
	protected String email;
	protected String address;
	protected LocalDate birthday;
	protected static int nextid=1;/* 下一名学生的id */
	protected int id=nextid++;/* 该学生的id */
	
	public Person(String name,String tel,String tender,String email,String address,int year,int month,int day)
	{
		this.name=name;
		this.tel=tel;
		this.tender=tender;
		this.email=email;
		this.address=address;
		this.birthday=LocalDate.of(year,month,day);
	}
	public String getName()
	{
		return name;
	}
	public String getTel()
	{
		return tel;
	}
	public String getTender()
	{
		return tender;
	}
	public String getEmail()
	{
		return email;
	}
	public String getAddress()
	{
		return address;
	}
	public LocalDate getBirthday()
	{
		return birthday;
	}
	public int getId()
	{
		return id;
	}
	public static int getNextId()
	{
		return nextid;
	}
	public String toString()
	{
		return "| "+getId()+" "+"| "+getName()+" "+"| "+getTender()+" "+
			"| "+getTel()+" "+"| "+getEmail()+" "+"| "+getAddress()+" "
			+"| "+getBirthday();
	}
}