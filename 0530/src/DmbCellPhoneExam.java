
public class DmbCellPhoneExam {
	public static void main(String[] args) {
		//DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���","����",10);
	
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " +dmbCellPhone.model);
		System.out.println("���� : " +dmbCellPhone.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä�� : "+dmbCellPhone.channel);
		
		//CellPhone���κ��� ��ӹ��� �޼ҵ� ȣǮ
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbCellPhone.receiveVoice("��~�� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		
		
		dmbCellPhone.turnOnDmb();		
		dmbCellPhone.changeChannelDmb(12);	
		dmbCellPhone.turnOffDmb();
	}

}
