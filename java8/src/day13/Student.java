package day13;

public class Student {
	private String name;
	//private�� �ٸ� Ŭ�������� �ǵ����� get, set �Լ��� ����
	private String gender;
	private int age;
	private int sNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name, String gender, int age, int sNo) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.sNo = sNo;
	}

	public Student() {

	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		if(this.gender.equals("����")) {
			sNo = sNo + 2000;
		} else {
			sNo = sNo + 1000;
		}
		this.sNo = sNo;
	}
	
	public void showinfo() {
		System.out.println("����: "+this.name);
		System.out.println("����: "+this.gender);
		System.out.println("����: "+this.age);
		System.out.println("�й�: "+this.sNo);
	}

}
