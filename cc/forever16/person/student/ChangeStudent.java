package cc.forever16.person.student;

import java.time.*;

import cc.forever16.person.student.ChangeStudentBaseInfo;
import cc.forever16.person.ChangePerson;

/* 继承至改变人类信息的类，实现改变学生信息的接口 */
public class ChangeStudent extends ChangePerson implements ChangeStudentBaseInfo
{
	Student student;
	public ChangeStudent(Student student)
	{
		this.student=student;
	}
	
	public void changeTel(String tel)
	{
		this.student.tel=tel;
	}
	
	public void changeEmail(String email)
	{
		this.student.email=email;	
	}
	public void changeAddress(String address)
	{
		this.student.address=address;
	}
	
}