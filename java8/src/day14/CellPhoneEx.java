package day14;

public class CellPhoneEx {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		DmbCellPhone dcp = new DmbCellPhone("������s20", "����", 10);
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("��������.");
		dcp.receiveVoice("�ù��Դϴ�.");
		dcp.sendVoice("�� �տ� �����ּ���.");
		dcp.receiveVoice("�˰ڽ��ϴ�.");
		dcp.hangUp();
		dcp.turnOnDmb();
		dcp.setChannel(100);
		dcp.turnOffDmb();
		dcp.powerOff();
		
		
	}

}
