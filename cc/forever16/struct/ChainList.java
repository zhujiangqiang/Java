package cc.forever16.struct;

import java.util.*;
import java.time.*;

import cc.forever16.person.*;


public class ChainList<classType>
{
	private int length=0;//����ĳ���
	private Node<classType> head = new Node<>();
	

	/* ������ĩβ������,headΪͷ��� */
	public void listInsert(Node newNode)
	{
		/*
		*����ʾ��
		*temp=head.node;
		*for{.....}
		*temp=newNode;
		*/
		Node temp=head;// ��head����ͬһ������
		for(int i=0;i<getLength();i++)
			temp=temp.node;
		temp.node=newNode;// ���ܸı�������õĶ��󵫿��Ըı���������
		length++;// ����ɹ��򳤶ȼ�һ
		System.out.println("��ӳɹ��������������");
	}
	
	/* ������ָ��λ�ò�����,headΪͷ��� */
	public void listInsert(Node newNode,int pos)
	{
		if(pos>getLength()+1){
			System.out.println("ɾ��λ���������ʧ��!");
			return;
		}
		Node temp=head;// ��head����ͬһ������
		for(int i=0;i<pos-1;i++)// ��ȡǰһ�����
			temp=temp.node;
		temp.node=newNode;// ���ܸı�������õĶ��󵫿��Ըı���������
		length++;// ����ɹ��򳤶ȼ�һ
		System.out.println("��ӳɹ��������������");
	}
	
	/* ��������,headΪͷ��� */
	public void traverseList()
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
			System.out.println(temp.item.toString());
			temp=temp.node;
		}
	}
	
	/* ��ȡ������ */
	public int getLength()
	{
		return length;
	}
	
	/* ����ѧ��id��ȡѧ����Ϣ */
	/*
	public classType getPerson(Node head,int person_id)
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
				return temp.classType;
			}
		}
		return null;
	}
	*/
	
	/* ����ѧ��������ȡѧ����Ϣ */
	/*
	public classType getPerson(Node head,String name)
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
				return temp.item;
			}
		}
		return null;
	}
	*/
	
	/* ɾ����Ӧָ����id��ѧ�� */
	
	/* ɾ����Ӧָ����������ѧ�� */
	/*
	public void listDelete(String name)
	{
		if(ChainList.getLength()==0)
		{
			System.out.println("��Ϊ��");
			return;
		}
		Node temp=head;
		int i;
		if(temp.node.person.getName().equals(name))// ��һ��������Ҫɾ���Ľ��
		{
			temp.node=temp.node.node;
			length--;
			System.out.println("ɾ���ɹ��������������");
			return;
		}
		for(i=1;i<getLength();i++)// ��ȡǰһ�����
		{
			if(i==getLength()&&!temp.person.getName().equals(name))
			{
				System.out.println("δ�ҵ���ѧ����Ϣ��ɾ��ʧ�ܣ������������");
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
		System.out.println("ɾ���ɹ��������������");
	}
	*/
	
	/* ɾ��ָ��λ�õĽ�� */
	public void listDelete(int pos)
	{
		if(pos>getLength()){
			System.out.println("ɾ��λ�ó�������ɾ��ʧ��!");
			return;
		}
		Node temp=head;
		int i;
		for(i=0;i<pos-1;i++)// ��ȡǰһ�����
			temp=temp.node;
		temp.node=temp.node.node;
		System.out.println("ɾ���ɹ������������!");
		length--;
	}
	
	/* ��ȡָ��λ�õĶ��� */
	public classType getObject(int pos)
	{
		if(pos>getLength()){
			System.out.println("��ȡλ�ó���������ȡʧ��!");
			return null;
		}
		Node temp=head;
		int i;
		for(i=0;i<pos;i++)// ��ȡǰһ�����
			temp=temp.node;
		return (classType)temp.item;
	}
	
	/* ���� */
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
		System.out.println("��10��λ��  "+pd.toString());
		for(int i=10;i>0;i--){
			System.out.println(list.getLength());
			list.listDelete(i);
			list.traverseList();
			Person pde = list.getObject(i-1);
			System.out.println("��"+(i-1)+"��λ��  "+pde.toString());
		}
	}
}