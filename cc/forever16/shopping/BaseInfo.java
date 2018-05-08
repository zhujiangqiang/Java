package cc.forever16.shopping;

public interface BaseInfo
{
	int num=1;
	String getName();/* 获取商品名称 */
	double getPrice();/* 获取价格 */
	String getShoppingAddress();/* 产地 */
	default String method()
	{
		return "I'm BaseInfo interface";/* 可以调用其他方法 */
	};/* 伴随类可以不实现默认方法 */
}
