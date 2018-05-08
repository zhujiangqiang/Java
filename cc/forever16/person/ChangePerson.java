package cc.forever16.person;

import java.time.*;

public class ChangePerson implements ChangePersonBaseInfo
{
	Person person;
	
	public ChangePerson(Person person)
	{
		this.person=person;
	}
	
	public ChangePerson(){};
	
	public void changeName(String name)
	{
		this.person.name=name;
	}
	
	public void changeTender(String tender)
	{
		this.person.tender=tender;
	}
	
	public void changeBirthday(int year,int month,int day)
	{
		this.person.birthday=LocalDate.of(year,month,day);
	}
}