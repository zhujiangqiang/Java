package cc.forever16.person;

import java.time.*;

import cc.forever16.person.*;

public class ChangeStudent extends ChangePerson implements ChangePersonBaseInfo
{
	Person person;
	public ChangeStudent(Person person)
	{
		this.person=person;
	}
	
	public void changeTel(String tel)
	{
		this.person.tel=tel;
	}
	
	public void changeEmail(String email)
	{
		this.person.email=email;	
	}
	public void changeAddress(String address)
	{
		this.person.address=address;
	}
	
}