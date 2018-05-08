package cc.forever16.person.student;

import java.util.*;
import java.time.*;

import cc.forever16.person.Person;

public class Person extends Person implements StudentBaseInfo
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
		super(name,tender,year,month,day);
		this.tel=tel;
		this.tender=tender;
		this.birthday=LocalDate.of(year,month,day);
	}
	
	public String getTel()
	{
		return tel;
	}
	
	
	public String getEmail()
	{
		return email;
	}
	
	public String getAddress()
	{
		return address;
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