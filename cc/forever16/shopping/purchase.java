package cc.forever16.shopping;
import java.time. *;
import java.util.*;
public class purchase implements BaseInfo,BaseInfoTest{
	//ʵ����
	private final String name;//���ɱ䣬���������й�����ִ����֮ǰ��ʼ��
	private double price;
	private LocalDate boughtdate;
	private String Shopping_Address;
	private int id;
	
	public static void main(String[] args){
		purchase[] purchases=new purchase[3];
		purchases[0]=new purchase("Ь��",788.5,2018,12,12,"�й�");
		purchases[1]=new purchase("�·�",188.5,2017,12,13,"����");
		purchases[2]=new purchase("����",288.0,2007,5,12,"����");
		for(purchase e:purchases)
		{
			//System.out.println(purchase.nextid);/* ����ֱ�ӷ���nextId�������ô���һ��purchase���� */
			//System.out.println(purchase.num);/* ��Ȼnum�ǹ����ģ����Ѱ�������Ϊ��������ʹ�øó���ֻ�ܶ�ȡ�����޸� */
			//System.out.println(purchase.getNextId()); /* ����Ҫ����purchase������ΪgetNextId()�Ǿ�̬���� */
			System.out.println(e.toString());
		}
		
		/*  �̳�		*/
		Order order1=new Order("��ָ","Mike");
		System.out.println(order1.getPersonName()+"������"+order1.getName());
		/* Order�̳���purchase����˼ȿ���ʹ��purchase�ķ�����Ҳ����ʹ���Լ��ķ������������order2����Ϊһ��purchase��������ʹ��Order�ķ��� */
		purchase order2=new Order("��ָ");
		System.out.println(order2.getName());
		
		/* Object �� */
		/*
		purchase purchase1=new purchase("����",288.0,2007,5,12,"����");
		purchase purchase2=new purchase("����",288.0,2007,5,12,"����");
		System.out.println(purchase1.equals(purchase2));
		*/
		
		/* ���� */
		ArrayList<purchase> staff=new ArrayList<>(3);
		staff.ensureCapacity(3);
		staff.add(purchases[0]);
		/* ����staff.set(1,purchases[2]);*/
		//staff.add(purchases[1]);
		staff.add(purchases[2]);
		/* ֻ��i С�ڻ���������б�Ĵ�Сʱ�� ���ܹ�����list.set(i��x)��*/
		/*
		staff.set(1,purchases[2]);
		staff.add(purchases[1]);
		System.out.println(staff.size());
		purchase p1=staff.get(0);// ��ȡ�����б�Ԫ��
		purchase p2=staff.get(1);
		purchase p3=staff.get(2);
		System.out.println(p1.toString()+"\n"+p2.toString()+"\n"+p3.toString());
		System.out.println(staff.size());
		staff.remove(2);
		System.out.println(staff.size());
		*/
		purchase test=new purchase();
		System.out.println(test.method());
		
	}
	private final StringBuilder evaluations=new StringBuilder();
	/* final �ؼ���ֻ�Ǳ�ʾ�洢��evaluations �����еĶ������ò�
	����ָʾ����StringBuilder���� */
	private static int nextid=1;/* ��̬���������಻���ڶ������ж�����һ��nextid�� */
	
	/* �ڽӿ��ж��� public static final double num=1;*//* ��̬���� */
	
	//������
	public purchase(String name,double price,int year,int month,int day,String Shopping_Address){
		this.name=name;
		this.price=price;
		this.Shopping_Address=Shopping_Address;
		boughtdate=LocalDate.of(year,month,day);
	}
	public purchase(String name){
		this.name=name;
	}
	public purchase()
	{
		this.name="None";
	}
	public String getName(){
		return name;
	}

	public double getPrice(){
		return price;
	}

	public LocalDate getBoughtDay(){
		return boughtdate;
	}
	public String getShoppingAddress(){
		return Shopping_Address;
	}
	public void giveGoldSta()
	{
		evaluations.append(LocalDate.now() + ": Gold star!\n");/* ���Ը��Ķ�������� */
		/* evaluations=new StringBuilder();�����Ը������õĶ���*/
	}
	public int setId()
	{
		id=nextid;
		nextid++;
		return id;
	}
	public static int getNextId()
	{
		return nextid;/* ���Է��ʾ�̬�� */
		/* return id; ���ܷ���ʵ����*/
	}
	public boolean equals(Object otherobject)
	{
		if(this==otherobject) return true;
		if(otherobject==null) return false;
		if(getClass()!=otherobject.getClass()) return false;
		purchase other=(purchase)otherobject;
		/*
		return name.equals(other.getName())
		&&price==other.price
		&&boughtdate.equals(other.boughtdate)
		&&Shopping_Address.equals(other.Shopping_Address);
		*/
		
		return Objects.equals(name,other.name)
		&&price==other.price
		&&Objects.equals(boughtdate,other.boughtdate)
		&&Objects.equals(Shopping_Address,other.Shopping_Address);
		
	}
	public String toString()
	{
		return getClass().getName()+" ��Ʒ����"+name+" ��Ʒ�۸�"+price+" �������ڣ�"+boughtdate+"���������"+Shopping_Address+"��Ʒid��"+setId();
	}
	
	public String method()
	{
		return BaseInfoTest.super.method();/* Ϊ�˽�������ԣ�ѡ��BaseInfoTest�ӿ��ṩ��method���� */
	}
}

class Order extends purchase{
	
	private String person_name;
	
	public Order(String name,String person_name)
	{
		super(name);
		this.person_name=person_name;
	}
	public Order(String name)
	{
		super(name);
	}
	public String add()
	{
		return super.getName();
	}
	public String getPersonName()
	{
		return person_name;
	}
}
class Payment{
		;
}
class Account{
		;
}
