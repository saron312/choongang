package interf;

public interface TestInter {
	int i = 100;
	public static final int AAA_BBB = 400; // interface �ȿ� ���� �� ������ public��. �׷��� public �Ⱥٿ�����
//	int y;
//	void aaa(){} // �������̽� �ȿ��� {}�߰�ȣ �ȵ����� 8�������ʹ� ��, ���帶�� ���� �ڹٹ����� �ٸ��� ������ ��
	default void aaa(){};
	public abstract boolean bbb();
	
	
	static int kkk(){
		return 0;
	}; //static �޼ҵ�
}

