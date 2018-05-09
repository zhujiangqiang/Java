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
		System.out.println("��ӭʹ��ѧ����Ϣ����ϵͳ\n���ѧ����Ϣ�밴1\nɾ��ѧ����Ϣ�밴2\n��ȡ����ѧ������Ϣ�밴3\n�޸�ѧ����Ϣ�밴4\n�˳��밴0");
		while((choose=scanner.nextInt())!=0)
		{
			switch(choose)
			{
				case 1:
					System.out.println("���֣�");
					String name=scanner.next();
					System.out.println("�Ա�");
					String tender=scanner.next();
					System.out.println("�������䣺");
					String email=scanner.next();
					System.out.println("��ַ��");
					String address=scanner.next();
					System.out.println("�����ꡢ�¡��գ��ֻ���");
					int year=scanner.nextInt();
					int month=scanner.nextInt();
					int day=scanner.nextInt();
					String tel=scanner.next();
					Student new_student=new Student(name,tel,tender,email,address,year,month,day);// �½�һ������
					StudentNode new_node=new StudentNode();// �½�� 
					new_node.item=new_student;
					list.listInsert(new_node);
					break;
				case 2:
					System.out.println("������ѧ����id��������");
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
					System.out.println("������ѧ����id������(�˳��밴0)��");
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
						System.out.println("δ�ҵ���ѧ����Ϣ");
						break;
					}
					System.out.println("���ҵ���ѧ������Ϣ\n"+per.toString());
					System.out.println("�����������޸ĵ���Ϣ(����:1,�Ա�:2,�ֻ���:3,��������:4,��ַ:5,��������:6,�˳��밴0)");
					int pchoose;
					while((pchoose=scanner.nextInt())!=0)
					{
						switch(pchoose)
						{
							case 1:
								System.out.println("�����֣�");
								String aname=scanner.next();
								to_be_changed.changeName(aname);
								System.out.println("�����ɹ������������");
								break;
							case 2:
								System.out.println("���Ա�");
								String atender=scanner.next();
								to_be_changed.changeTender(atender);
								System.out.println("�����ɹ������������");
								break;
							case 3:
								System.out.println("���ֻ��ţ�");
								String atel=scanner.next();
								to_be_changed.changeTel(atel);
								System.out.println("�����ɹ������������");
								break;
							case 4:
								System.out.println("�µ�ַ��");
								String aaddress=scanner.next();
								to_be_changed.changeAddress(aaddress);
								System.out.println("�����ɹ������������");
								break;
							case 5:
								System.out.println("�µ������䣺");
								String aemail=scanner.next();
								to_be_changed.changeEmail(aemail);
								System.out.println("�����ɹ������������");
								break;
							case 6:
								System.out.println("�³�������(��ʽ���� �� ��)��");
								int ayear=scanner.nextInt();
								int amonth=scanner.nextInt();
								int aday=scanner.nextInt();
								to_be_changed.changeBirthday(ayear,amonth,aday);
								System.out.println("�����ɹ������������");
								break;
						}
					}
					break;
				default:
					System.out.println("�����������������");
			}
		}
	}
}
*/

class StudentChainListImpl<Student,classType> extends ChainListImpl<classType> implements StudentChainList
{
	/* ����ѧ��id��ȡѧ����Ϣ */
	
	public Student getStudent(int studentId)
	{
		if(getLength()==0)
		{
			System.out.println("��Ϊ��");
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
	
	/* ����ѧ��������ȡѧ����Ϣ */
	
	public Student getStudent(String name)
	{
		if(getLength()==0)
		{
			System.out.println("��Ϊ��");
			return null;
		}
		StudentNode temp=head;
		int i;
		for(i=1;i<getLength()+1;i++)// ��ȡǰһ�����
		{
			temp=temp.node;
			if(temp.item.getName().equals(name))
			{
				return temp.item;
			}
		}
		return null;
	}
	
	/* ɾ����Ӧָ����id��ѧ�� */
	
	/* ɾ����Ӧ������ѧ�� */
	public void listDelete(String name)
	{
		if(getLength()==0)
		{
			System.out.println("��Ϊ��");
			return;
		}
		StudentNode temp=head;
		int i;
		if(temp.node.item.getName().equals(name))// ��һ��������Ҫɾ���Ľ��
		{
			temp.node=temp.node.node;
			length--;
			System.out.println("ɾ���ɹ��������������");
			return;
		}
		for(i=1;i<getLength();i++)// ��ȡǰһ�����
		{
			if(i==getLength()&&!temp.item.getName().equals(name))
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
}
/* ����� */
class StudentNode<Student,classType> extends Node<classType>
{
}