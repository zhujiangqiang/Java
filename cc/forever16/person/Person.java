package cc.forever16.person;
import java.util.*;
import java.time.*;
public class Person implements PersonBaseInfo
{
	/* ÿ���˶������֡��Ա�ͳ������� */
	protected String name;
	protected String tender;
	protected LocalDate birthday;
	
	public Person(String name,String tender,int year,int month,int day)
	{
		this.name=name;
		this.tender=tender;
		this.birthday=LocalDate.of(year,month,day);
	}
	/* ��ȡ���� */
	public String getName()
	{
		return name;
	}
	
	/* ��ȡ�Ա� */
	public String getTender()
	{
		return tender;
	}
	
	/* ��ȡ�������� */
	public LocalDate getBirthday()
	{
		return birthday;
	}
}