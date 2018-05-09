package cc.forever16.application;

import cc.forever16.struct.ChainList;
import cc.forever16.person.student.Student;

public interface StudentChainList<Student,classType> extends ChainList<classType>
{
	/* ����ѧ��id��ȡѧ����Ϣ */
	public Student getStudent(int studentId);
	/* ����ѧ��������ȡѧ����Ϣ */
	public Student getStudent(String name);
	/* ɾ����Ӧָ����id��ѧ�� */
	public void listDelete(int studentId);
	/* ɾ����Ӧ������ѧ�� */
	public void listDelete(String name);
}