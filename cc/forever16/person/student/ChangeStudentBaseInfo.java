package cc.forever16.person.student;

import cc.forever16.person.ChangePersonBaseInfo;

/* �̳иı�������Ϣ�Ľӿ� */
public interface ChangeStudentBaseInfo extends ChangePersonBaseInfo
{
	void changeTel(String tel);
	void changeEmail(String email);
	void changeAddress(String address);
}