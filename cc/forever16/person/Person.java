package cc.forever16.person;
import java.util.*;
import java.time.*;
public class Person implements PersonBaseInfo
{
	/* 每个人都有名字、性别和出生日期 */
	protected String name;
	protected String tender;
	protected LocalDate birthday;
	
	public Person(String name,String tender,int year,int month,int day)
	{
		this.name=name;
		this.tender=tender;
		this.birthday=LocalDate.of(year,month,day);
	}
	/* 获取姓名 */
	public String getName()
	{
		return name;
	}
	
	/* 获取性别 */
	public String getTender()
	{
		return tender;
	}
	
	/* 获取出生日期 */
	public LocalDate getBirthday()
	{
		return birthday;
	}
	
	/* 转换为字符串 */
	public String toString()
	{
		return getClass() +" 名字："+ name + " 性别：" + tender + " 出生日期：" + birthday;
	}
	
	public static void main(String[] args)
	{
		Person p=new Person("Mike","male",1997,12,13);
		System.out.println(p.toString());
	}
}