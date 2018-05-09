package cc.forever16.person.student;

import java.util.*;
import java.time.*;

import cc.forever16.person.Person;

/* ѧ����̳�������,��ʵ��ѧ��������Ϣ�ӿ� */
public class Student extends Person implements StudentBaseInfo,ChangeStudentBaseInfo
{
	protected String tel;
	protected String email;
	protected String address;
	protected static int nextid=1;/* ��һ��ѧ����id */
	protected int id=nextid++;/* ��ѧ����id */
	
	public Student(String name,String tel,String tender,String email,String address,int year,int month,int day)
	{
		super(name,tender,year,month,day);
		this.tel=tel;
		this.tender=tender;
		this.address=address;
		this.email=email;
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
	
	public void changeTel(String tel)
	{
		this.tel=tel;
	}
	public void changeEmail(String email)
	{
		this.email=email;
	}
	public void changeAddress(String address)
	{
		this.address=address;
	}
	
	public String toString()
	{
		return "| "+getId()+" "+"| "+getName()+" "+"| "+getTender()+" "+
			"| "+getTel()+" "+"| "+getEmail()+" "+"| "+getAddress()+" "
			+"| "+getBirthday();
	}
	
	public static void main(String[] args)
	{
		Student stu=new Student("zbf","��","tel","email","address",1999,10,20);
		System.out.println(stu.toString());
		stu.changeAddress("�㶫��ͷ");
		stu.changeBirthday(2000,11,11);
		System.out.println(stu.toString());
	}
}