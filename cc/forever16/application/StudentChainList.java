package cc.forever16.application;

import cc.forever16.struct.ChainList;
import cc.forever16.person.student.Student;

public interface StudentChainList<Student,classType> extends ChainList<classType>
{
	/* 根据学生id获取学生信息 */
	public Student getStudent(int studentId);
	/* 根据学生姓名获取学生信息 */
	public Student getStudent(String name);
	/* 删除对应指定的id的学生 */
	public void listDelete(int studentId);
	/* 删除对应姓名的学生 */
	public void listDelete(String name);
}