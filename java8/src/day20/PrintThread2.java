package day20;

public class PrintThread2 extends Thread{
	@Override
	public void run() {
		//how1
		/*try {
			while(true) {
				System.out.println("���� ��");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {}*/ //���ͷ�Ʈ�� �߻��ϸ�
		
		//how2
		while(true) {
			System.out.println("���� ��");
			if(Thread.interrupted()) { //���ͷ�Ʈ�� �߻��ϸ�
				break; //�Ϻη� ���ͷ�Ʈ�� �߻����Ѽ� ������ ����
			}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
