package day20;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); //���󾲷���� �����.
		autoSaveThread.start(); //�۾� ������ �������� ��� ����ϴٰ�

		try {
			Thread.sleep(3000); //���� �����尡 3�ʰ� ����ٰ� ���α׷� ���� 
		} catch (InterruptedException e) {	}
		System.out.println("���� ������ ����");
		/*���� ���󽺷��尡 �ƴϸ� autoSaveThread�� ����Thread�� ���ε��� ��������
		 * ����Thread�� ����ŵ� autoSaveThread�� ��� ���� ���¶� "�۾� ������ ������"�� ��� ��µ�*/
	}
}
