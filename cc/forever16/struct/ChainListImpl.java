package cc.forever16.struct;

import java.util.*;
import java.time.*;

import cc.forever16.person.*;


public class ChainListImpl<classType> implements ChainList
{
	protected int length=0;//链表的长度
	protected Node<classType> head = new Node<>();
	
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
		ChainListImpl<Person> list=new ChainListImpl<>();
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