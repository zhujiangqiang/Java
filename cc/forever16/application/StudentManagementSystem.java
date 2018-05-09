package cc.forever16.student;

import java.util.*;

import cc.forever16.struct.*;
import cc.forever16.person.student.*;

public class StudentManagementSystem
{
}
	/*
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		StudentChainListImpl list = new StudentChainListImpl();
		int choose=1;
		System.out.println("欢迎使用学生信息管理系统\n添加学生信息请按1\n删除学生信息请按2\n获取所有学生的信息请按3\n修改学生信息请按4\n退出请按0");
		while((choose=scanner.nextInt())!=0)
		{
			switch(choose)
			{
				case 1:
					System.out.println("名字：");
					String name=scanner.next();
					System.out.println("性别：");
					String tender=scanner.next();
					System.out.println("电子邮箱：");
					String email=scanner.next();
					System.out.println("地址：");
					String address=scanner.next();
					System.out.println("出生年、月、日，手机号");
					int year=scanner.nextInt();
					int month=scanner.nextInt();
					int day=scanner.nextInt();
					String tel=scanner.next();
					Student new_student=new Student(name,tel,tender,email,address,year,month,day);// 新建一个对象
					StudentNode new_node=new StudentNode();// 新结点 
					new_node.item=new_student;
					list.listInsert(new_node);
					break;
				case 2:
					System.out.println("请输入学生的id或姓名：");
					String str=scanner.next();
					if(str.matches("[0-9]+"))
						list.listDelete(Integer.parseInt(str));
					else
						list.listDelete(str);
					break;
				case 3:
					list.traverseList();
					break;
				case 4:
					System.out.println("请输入学生的id或姓名(退出请按0)：");
					String _str=scanner.next();
					if(Integer.parseInt(_str)==0) break;
					Student per;
					if(_str.matches("[0-9]+"))
						per=list.getStudent(Integer.parseInt(_str));
					else
						per=list.getStudent(_str);
					ChangeStudent to_be_changed=new ChangeStudent(per);
					int choice;
					if(per==null){
						System.out.println("未找到该学生信息");
						break;
					}
					System.out.println("查找到该学生的信息\n"+per.toString());
					System.out.println("请输入您想修改的信息(名字:1,性别:2,手机号:3,电子邮箱:4,地址:5,出生日期:6,退出请按0)");
					int pchoose;
					while((pchoose=scanner.nextInt())!=0)
					{
						switch(pchoose)
						{
							case 1:
								System.out.println("新名字：");
								String aname=scanner.next();
								to_be_changed.changeName(aname);
								System.out.println("操作成功！请继续操作");
								break;
							case 2:
								System.out.println("新性别：");
								String atender=scanner.next();
								to_be_changed.changeTender(atender);
								System.out.println("操作成功！请继续操作");
								break;
							case 3:
								System.out.println("新手机号：");
								String atel=scanner.next();
								to_be_changed.changeTel(atel);
								System.out.println("操作成功！请继续操作");
								break;
							case 4:
								System.out.println("新地址：");
								String aaddress=scanner.next();
								to_be_changed.changeAddress(aaddress);
								System.out.println("操作成功！请继续操作");
								break;
							case 5:
								System.out.println("新电子邮箱：");
								String aemail=scanner.next();
								to_be_changed.changeEmail(aemail);
								System.out.println("操作成功！请继续操作");
								break;
							case 6:
								System.out.println("新出生日期(格式：年 月 日)：");
								int ayear=scanner.nextInt();
								int amonth=scanner.nextInt();
								int aday=scanner.nextInt();
								to_be_changed.changeBirthday(ayear,amonth,aday);
								System.out.println("操作成功！请继续操作");
								break;
						}
					}
					break;
				default:
					System.out.println("输入错误，请重新输入");
			}
		}
	}
}
*/

class StudentChainListImpl<Student,classType> extends ChainListImpl<classType> implements StudentChainList
{
	/* 根据学生id获取学生信息 */
	
	public Student getStudent(int studentId)
	{
		if(getLength()==0)
		{
			System.out.println("表为空");
			return null;
		}
		StudentNode temp=head;
		int i;
		for(i=1;i<getLength()+1;i++)
		{
			temp=temp.node;
			if(temp.item.getId()==studentId)
			{
				return temp.item;
			}
		}
		return null;
	}
	
	/* 根据学生姓名获取学生信息 */
	
	public Student getStudent(String name)
	{
		if(getLength()==0)
		{
			System.out.println("表为空");
			return null;
		}
		StudentNode temp=head;
		int i;
		for(i=1;i<getLength()+1;i++)// 获取前一个结点
		{
			temp=temp.node;
			if(temp.item.getName().equals(name))
			{
				return temp.item;
			}
		}
		return null;
	}
	
	/* 删除对应指定的id的学生 */
	
	/* 删除对应姓名的学生 */
	public void listDelete(String name)
	{
		if(getLength()==0)
		{
			System.out.println("表为空");
			return;
		}
		StudentNode temp=head;
		int i;
		if(temp.node.item.getName().equals(name))// 第一个结点就是要删除的结点
		{
			temp.node=temp.node.node;
			length--;
			System.out.println("删除成功！请继续操作！");
			return;
		}
		for(i=1;i<getLength();i++)// 获取前一个结点
		{
			if(i==getLength()&&!temp.item.getName().equals(name))
			{
				System.out.println("未找到该学生信息，删除失败！请继续操作！");
				return;
			}
			if(temp.node.item.getName().equals(name))
			{
				break;
			}
			temp=temp.node;
		}
		temp.node=temp.node.node;
		length--;
		System.out.println("删除成功！请继续操作！");
	}
}
/* 结点类 */
class StudentNode<Student,classType> extends Node<classType>
{
}