package cc.forever16.person.student;

import cc.forever16.person.ChangePersonBaseInfo;

/* 继承改变人类信息的接口 */
public interface ChangeStudentBaseInfo extends ChangePersonBaseInfo
{
	void changeTel(String tel);
	void changeEmail(String email);
	void changeAddress(String address);
}