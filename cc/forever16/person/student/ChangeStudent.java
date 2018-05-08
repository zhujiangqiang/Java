package cc.forever16.person.student;

import java.time.*;

import cc.forever16.person.student.ChangeStudentBaseInfo;
import cc.forever16.person.ChangePerson;

/* �̳����ı�������Ϣ���࣬ʵ�ָı�ѧ����Ϣ�Ľӿ� */
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