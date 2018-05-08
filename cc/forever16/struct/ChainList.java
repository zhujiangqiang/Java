package cc.forever16.struct;

import java.util.*;
import java.time.*;

import cc.forever16.person.*;

public class ChainList
{
	private static int length=0;//链表的长度
	
	/* 结点类 */
	private class Node
	{
	Person person;/* 储存对象 */
	Node node;/* 下一个结点 */
	}
	
	/* 在链表末尾插入结点,head为头结点 */
	public void listInsert(Node head,Node newNode)
	{
		/*
		*错误示例
		*temp=head.node;
		*for{.....}
		*temp=newNode;
		*/
		Node temp=head;// 与head引用同一个对象
		for(int i=0;i<ChainList.getLength();i++)
			temp=temp.node;
		temp.node=newNode;// 不能改变变量引用的对象但可以改变对象的属性
		length++;// 插入成功则长度加一
		System.out.println("添加成功！请继续操作！");
	}
	
	/* 遍历链表,head为头结点 */
	public void traverseList(Node head)
	{
		Node temp=head.node;// 引用第一个结点对象
		int i;
		if(temp==null)// 链表为空
		{
			System.out.println("表为空");
			return;
		}
		while(temp!=null)
		{
			System.out.println(temp.person.toString());
			temp=temp.node;
		}
	}
	
	/* 获取链表长度 */
	public static int getLength()
	{
		return length;
	}
	
	/* 根据学生id获取学生信息 */
	public Person getPerson(Node head,int person_id)
	{
		if(ChainList.getLength()==0)
		{
			System.out.println("表为空");
			return null;
		}
		Node temp=head;
		int i;
		for(i=1;i<getLength()+1;i++)
		{
			temp=temp.node;
			if(temp.person.getId()==person_id)
			{
				return temp.person;
			}
		}
		return null;
	}
	
	/* 根据学生姓名获取学生信息 */
	public Person getPerson(Node head,String name)
	{
		if(ChainList.getLength()==0)
		{
			System.out.println("表为空");
			return null;
		}
		Node temp=head;
		int i;
		for(i=1;i<getLength()+1;i++)// 获取前一个结点
		{
			temp=temp.node;
			if(temp.person.getName().equals(name))
			{
				return temp.person;
			}
		}
		return null;
	}
	
	/* 删除对应指定的id的学生 */
	public void listDelete(Node head,int person_id)
	{
		if(ChainList.getLength()==0)
		{
			System.out.println("表为空");
			return;
		}
		Node temp=head;
		int i;
		if(temp.node.person.getId()==person_id)/* 第一个结点就是要删除的结点 */
		{
			temp.node=temp.node.node;
			length--;
			System.out.println("删除成功！请继续操作！");
			return;
		}
		for(i=1;i<getLength();i++)/* 获取前一个结点 */
		{
			if(i==getLength()&&temp.person.getId()!=person_id)
			{
				System.out.println("未找到该学生信息，删除失败！请继续操作！");
				return;
			}
			if(temp.node.person.getId()==person_id)
			{
				break;
			}
			temp=temp.node;
		}
		temp.node=temp.node.node;
		length--;
		System.out.println("删除成功！请继续操作！");
	}
	
	/* 删除对应指定的姓名的学生 */
	public void listDelete(Node head,String name)
	{
		if(ChainList.getLength()==0)
		{
			System.out.println("表为空");
			return;
		}
		Node temp=head;
		int i;
		if(temp.node.person.getName().equals(name))/* 第一个结点就是要删除的结点 */
		{
			temp.node=temp.node.node;
			length--;
			System.out.println("删除成功！请继续操作！");
			return;
		}
		for(i=1;i<getLength();i++)/* 获取前一个结点 */
		{
			if(i==getLength()&&!temp.person.getName().equals(name))
			{
				System.out.println("未找到该学生信息，删除失败！请继续操作！");
				return;
			}
			if(temp.node.person.getName().equals(name))
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