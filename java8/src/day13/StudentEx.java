package day13;

public class StudentEx {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Student s1 = new Student("ȫ�浿", "����", 30, 20200001);
		Student s2 = new Student();
		s2.setName("������");
		s2.setGender("����");
		s2.setAge(40);
		s2.setsNo(20200002);
		s1.showinfo();
		s2.showinfo();
	}

}