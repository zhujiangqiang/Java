package cc.forever16.struct;

public interface ChainList<classType>
{
	/* ������ĩβ������,headΪͷ��� */
	public void listInsert(Node newNode);
	/* ������ָ��λ�ò�����,headΪͷ��� */
	public void listInsert(Node newNode,int pos);
	/* ��������,headΪͷ��� */
	public void traverseList();
	/* ��ȡ������ */
	public int getLength();
	/* ɾ��ָ��λ�õĽ�� */
	public void listDelete(int pos);
	/* ��ȡָ��λ�õĶ��� */
	public classType getObject(int pos);
} 