package cc.forever16.struct;

import java.util.*;
import java.time.*;

import cc.forever16.person.*;


public class ChainList<classType>
{
	private int length=0;//链表的长度
	private Node<classType> head = new Node<>();
	

	/* 在链表末尾插入结点,head为头结点 */
	public void listInsert(Node newNode)
	{
		/*
		*错误示例
		*temp=head.node;
		*for{.....}
		*temp=newNode;
		*/
		Node temp=head;// 与head引用同一个对象
		for(int i=0;i<getLength();i++)
			temp=temp.node;
		temp.node=newNode;// 不能改变变量引用的对象但可以改变对象的属性
		length++;// 插入成功则长度加一
		System.out.println("添加成功！请继续操作！");
	}
	
	/* 在链表指定位置插入结点,head为头结点 */
	public void listInsert(Node newNode,int pos)
	{
		if(pos>getLength()+1){
			System.out.println("删除位置有误，添加失败!");
			return;
		}
		Node temp=head;// 与head引用同一个对象
		for(int i=0;i<pos-1;i++)// 获取前一个结点
			temp=temp.node;
		temp.node=newNode;// 不能改变变量引用的对象但可以改变对象的属性
		length++;// 插入成功则长度加一
		System.out.println("添加成功！请继续操作！");
	}
	
	/* 遍历链表,head为头结点 */
	public void traverseList()
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
			System.out.println(temp.item.toString());
			temp=temp.node;
		}
	}
	
	/* 获取链表长度 */
	public int getLength()
	{
		return length;
	}
	
	/* 根据学生id获取学生信息 */
	/*
	public classType getPerson(Node head,int person_id)
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
				return temp.classType;
			}
		}
		return null;
	}
	*/
	
	/* 根据学生姓名获取学生信息 */
	/*
	public classType getPerson(Node head,String name)
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
				return temp.item;
			}
		}
		return null;
	}
	*/
	
	/* 删除对应指定的id的学生 */
	
	/* 删除对应指定的姓名的学生 */
	/*
	public void listDelete(String name)
	{
		if(ChainList.getLength()==0)
		{
			System.out.println("表为空");
			return;
		}
		Node temp=head;
		int i;
		if(temp.node.person.getName().equals(name))// 第一个结点就是要删除的结点
		{
			temp.node=temp.node.node;
			length--;
			System.out.println("删除成功！请继续操作！");
			return;
		}
		for(i=1;i<getLength();i++)// 获取前一个结点
		{
			if(i==getLength()&&!temp.person.getName().equals(name))
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
	*/
	
	/* 删除指定位置的结点 */
	public void listDelete(int pos)
	{
		if(pos>getLength()){
			System.out.println("删除位置超过表长，删除失败!");
			return;
		}
		Node temp=head;
		int i;
		for(i=0;i<pos-1;i++)// 获取前一个结点
			temp=temp.node;
		temp.node=temp.node.node;
		System.out.println("删除成功！请继续操作!");
		length--;
	}
	
	/* 获取指定位置的对象 */
	public classType getObject(int pos)
	{
		if(pos>getLength()){
			System.out.println("获取位置超过表长，获取失败!");
			return null;
		}
		Node temp=head;
		int i;
		for(i=0;i<pos;i++)// 获取前一个结点
			temp=temp.node;
		return (classType)temp.item;
	}
	
	/* 测试 */
	public static void main(String[] args)
	{
		Person p;
		ChainList<Person> list=new ChainList<>();
		Node<Person> newNode=null;
		for(int i=0;i<10;i++){
			p=new Person("Mike","male",1990+i,12,13);
			newNode=new Node<Person>();
			newNode.item=p;
			list.listInsert(newNode,list.getLength()+1);
		}
		list.traverseList();
		Person pd = list.getObject(10);
		System.out.println("第10个位置  "+pd.toString());
		for(int i=10;i>0;i--){
			System.out.println(list.getLength());
			list.listDelete(i);
			list.traverseList();
			Person pde = list.getObject(i-1);
			System.out.println("第"+(i-1)+"个位置  "+pde.toString());
		}
	}
}