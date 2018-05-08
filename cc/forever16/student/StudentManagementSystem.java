package cc.forever16.student;

import cc.forever16.person.*;
import cc.forever16.struct.*;
import java.util.*;
public class StudentManagementSystem
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		Node chain_list=new Node();
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
					Person new_person=new Person(name,tel,tender,email,address,year,month,day);/* �½�һ������ */
					Node new_node=new Node();/* �½�� */ 
					new_node.person=new_person;
					listInsert(chain_list,new_node);
					break;
				case 2:
					System.out.println("������ѧ����id��������");
					String str=scanner.next();
					if(str.matches("[0-9]+"))
						listDelete(chain_list,Integer.parseInt(str));
					else
						listDelete(chain_list,str);
					break;
				case 3:
					traverseList(chain_list);
					break;
				case 4:
					System.out.println("������ѧ����id������(�˳��밴0)��");
					String _str=scanner.next();
					if(Integer.parseInt(_str)==0) break;
					Person per;
					if(_str.matches("[0-9]+"))
						per=getPerson(chain_list,Integer.parseInt(_str));
					else
						per=getPerson(chain_list,_str);
					ChangePerson to_be_changed=new ChangePerson(per);
					int choice;
					if(per==null)
						System.out.println("δ�ҵ���ѧ����Ϣ");
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