package cc.forever16.person.student;

import java.time.*;

import cc.forever16.person.PersonBaseInfo;

/* 继承人类基本信息接口 */
public interface StudentBaseInfo extends PersonBaseInfo
{
	String getTel();
	String getEmail();
	String getAddress();
}