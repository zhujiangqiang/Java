package cc.forever16.struct;

import java.util.*;
import java.time.*;

import cc.forever16.person.*;

public class ChainList
{
	private static int length=0;//����ĳ���
	
	/* ����� */
	private class Node
	{
	Person person;/* ������� */
	Node node;/* ��һ����� */
	}
	
	/* ������ĩβ������,headΪͷ��� */
	public void listInsert(Node head,Node newNode)
	{
		/*
		*����ʾ��
		*temp=head.node;
		*for{.....}
		*temp=newNode;
		*/
		Node temp=head;// ��head����ͬһ������
		for(int i=0;i<ChainList.getLength();i++)
			temp=temp.node;
		temp.node=newNode;// ���ܸı�������õĶ��󵫿��Ըı���������
		length++;// ����ɹ��򳤶ȼ�һ
		System.out.println("��ӳɹ��������������");
	}
	
	/* ��������,headΪͷ��� */
	public void traverseList(Node head)
	{
		Node temp=head.node;// ���õ�һ��������
		int i;
		if(temp==null)// ����Ϊ��
		{
			System.out.println("��Ϊ��");
			return;
		}
		while(temp!=null)
		{
			System.out.println(temp.person.toString());
			temp=temp.node;
		}
	}
	
	/* ��ȡ������ */
	public static int getLength()
	{
		return length;
	}
	
	/* ����ѧ��id��ȡѧ����Ϣ */
	public Person getPerson(Node head,int person_id)
	{
		if(ChainList.getLength()==0)
		{
			System.out.println("��Ϊ��");
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
	
	/* ����ѧ��������ȡѧ����Ϣ */
	public Person getPerson(Node head,String name)
	{
		if(ChainList.getLength()==0)
		{
			System.out.println("��Ϊ��");
			return null;
		}
		Node temp=head;
		int i;
		for(i=1;i<getLength()+1;i++)// ��ȡǰһ�����
		{
			temp=temp.node;
			if(temp.person.getName().equals(name))
			{
				return temp.person;
			}
		}
		return null;
	}
	
	/* ɾ����Ӧָ����id��ѧ�� */
	public void listDelete(Node head,int person_id)
	{
		if(ChainList.getLength()==0)
		{
			System.out.println("��Ϊ��");
			return;
		}
		Node temp=head;
		int i;
		if(temp.node.person.getId()==person_id)/* ��һ��������Ҫɾ���Ľ�� */
		{
			temp.node=temp.node.node;
			length--;
			System.out.println("ɾ���ɹ��������������");
			return;
		}
		for(i=1;i<getLength();i++)/* ��ȡǰһ����� */
		{
			if(i==getLength()&&temp.person.getId()!=person_id)
			{
				System.out.println("δ�ҵ���ѧ����Ϣ��ɾ��ʧ�ܣ������������");
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
		System.out.println("ɾ���ɹ��������������");
	}
	
	/* ɾ����Ӧָ����������ѧ�� */
	public void listDelete(Node head,String name)
	{
		if(ChainList.getLength()==0)
		{
			System.out.println("��Ϊ��");
			return;
		}
		Node temp=head;
		int i;
		if(temp.node.person.getName().equals(name))/* ��һ��������Ҫɾ���Ľ�� */
		{
			temp.node=temp.node.node;
			length--;
			System.out.println("ɾ���ɹ��������������");
			return;
		}
		for(i=1;i<getLength();i++)/* ��ȡǰһ����� */
		{
			if(i==getLength()&&!temp.person.getName().equals(name))
			{
				System.out.println("δ�ҵ���ѧ����Ϣ��ɾ��ʧ�ܣ������������");
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
		System.out.println("ɾ���ɹ��������������");
	}
	
}