package cc.forever16.struct;

public interface ChainList<classType>
{
	/* 在链表末尾插入结点,head为头结点 */
	public void listInsert(Node newNode);
	/* 在链表指定位置插入结点,head为头结点 */
	public void listInsert(Node newNode,int pos);
	/* 遍历链表,head为头结点 */
	public void traverseList();
	/* 获取链表长度 */
	public int getLength();
	/* 删除指定位置的结点 */
	public void listDelete(int pos);
	/* 获取指定位置的对象 */
	public classType getObject(int pos);
} 