package day12;

public class MemberServiceEx {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		MemberService ms = new MemberService();
		Member hong = new Member("ȫ�浿", "hong");
		hong.password = "12345";
		hong.age = 30;
		if (ms.login(hong.id, hong.password) == true) {
			System.out.println("�α��� �Ͽ����ϴ�.");
			ms.logout(hong.id);
		} else
			System.out.println("�α��� ����");

		System.out.println();
		
		Member lee = new Member("�̿���", "lee");
		hong.password = "12345";
		hong.age = 20;
		if (ms.login(lee.id, lee.password) == true) {
			System.out.println("�α��� �Ͽ����ϴ�.");
			ms.logout(lee.id);
		} else
			System.out.println("�α��� ����");
	}

}
