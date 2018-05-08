package cc.forever16.person;

import java.time.*;

import cc.forever16.person.PersonBaseInfo;

public interface StudentBaseInfo extends PersonBaseInfo
{
	String getTel();
	String getEmail();
	String getAddress();
}