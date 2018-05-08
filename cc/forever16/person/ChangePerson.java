package cc.forever16.person;

import java.time.*;

public class ChangePerson implements ChangePersonBaseInfo
{
	Person person;
	public ChangePerson(Person person)
	{
		this.person=person;
	}
	public void changeName(String name)
	{
		this.person.name=name;
	}
	public void changeTel(String tel)
	{
		this.person.tel=tel;
	}
	public void changeTender(String tender)
	{
		this.person.tender=tender;
	}
	public void changeEmail(String email)
	{
		this.person.email=email;	
	}
	public void changeAddress(String address)
	{
		this.person.address=address;
	}
	public void changeBirthday(int year,int month,int day)
	{
		this.person.birthday=LocalDate.of(year,month,day);
	}
}