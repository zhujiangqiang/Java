package cc.forever16.shopping;

public interface BaseInfo
{
	int num=1;
	String getName();/* ��ȡ��Ʒ���� */
	double getPrice();/* ��ȡ�۸� */
	String getShoppingAddress();/* ���� */
	default String method()
	{
		return "I'm BaseInfo interface";/* ���Ե����������� */
	};/* ��������Բ�ʵ��Ĭ�Ϸ��� */
}
