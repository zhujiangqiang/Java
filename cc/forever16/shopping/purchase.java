package cc.forever16.shopping;
import java.time. *;
import java.util.*;
public class purchase implements BaseInfo,BaseInfoTest{
	//实例域
	private final String name;//不可变，必须在所有构造器执行完之前初始化
	private double price;
	private LocalDate boughtdate;
	private String Shopping_Address;
	private int id;
	
	public static void main(String[] args){
		purchase[] purchases=new purchase[3];
		purchases[0]=new purchase("鞋子",788.5,2018,12,12,"中国");
		purchases[1]=new purchase("衣服",188.5,2017,12,13,"美国");
		purchases[2]=new purchase("裤子",288.0,2007,5,12,"韩国");
		for(purchase e:purchases)
		{
			//System.out.println(purchase.nextid);/* 可以直接访问nextId，而不用创建一个purchase对象 */
			//System.out.println(purchase.num);/* 虽然num是公共的，但已把它声明为常量，就使得该常量只能读取不能修改 */
			//System.out.println(purchase.getNextId()); /* 不需要创建purchase对象，因为getNextId()是静态方法 */
			System.out.println(e.toString());
		}
		
		/*  继承		*/
		Order order1=new Order("戒指","Mike");
		System.out.println(order1.getPersonName()+"购买了"+order1.getName());
		/* Order继承至purchase，因此既可以使用purchase的方法，也可以使用自己的方法，但如果把order2声明为一个purchase变量不能使用Order的方法 */
		purchase order2=new Order("戒指");
		System.out.println(order2.getName());
		
		/* Object 类 */
		/*
		purchase purchase1=new purchase("裤子",288.0,2007,5,12,"韩国");
		purchase purchase2=new purchase("裤子",288.0,2007,5,12,"韩国");
		System.out.println(purchase1.equals(purchase2));
		*/
		
		/* 泛型 */
		ArrayList<purchase> staff=new ArrayList<>(3);
		staff.ensureCapacity(3);
		staff.add(purchases[0]);
		/* 错误staff.set(1,purchases[2]);*/
		//staff.add(purchases[1]);
		staff.add(purchases[2]);
		/* 只有i 小于或等于数组列表的大小时， 才能够调用list.set(i，x)。*/
		/*
		staff.set(1,purchases[2]);
		staff.add(purchases[1]);
		System.out.println(staff.size());
		purchase p1=staff.get(0);// 获取数组列表元素
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
	/* final 关键字只是表示存储在evaluations 变量中的对象引用不
	会再指示其他StringBuilder对象 */
	private static int nextid=1;/* 静态变量属于类不属于对象，所有对象共享一个nextid域 */
	
	/* 在接口中定义 public static final double num=1;*//* 静态常量 */
	
	//构造器
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
		evaluations.append(LocalDate.now() + ": Gold star!\n");/* 可以更改对象的属性 */
		/* evaluations=new StringBuilder();不可以更改引用的对象*/
	}
	public int setId()
	{
		id=nextid;
		nextid++;
		return id;
	}
	public static int getNextId()
	{
		return nextid;/* 可以访问静态域 */
		/* return id; 不能访问实例域*/
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
		return getClass().getName()+" 商品名："+name+" 商品价格："+price+" 购买日期："+boughtdate+"购买地区："+Shopping_Address+"商品id："+setId();
	}
	
	public String method()
	{
		return BaseInfoTest.super.method();/* 为了解决二义性，选择BaseInfoTest接口提供的method方法 */
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
