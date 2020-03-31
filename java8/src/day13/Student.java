package day13;

public class Student {
	private String name;
	//private은 다른 클래스에서 건들수없어서 get, set 함수를 만듬
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
		if(this.gender.equals("여성")) {
			sNo = sNo + 2000;
		} else {
			sNo = sNo + 1000;
		}
		this.sNo = sNo;
	}
	
	public void showinfo() {
		System.out.println("성명: "+this.name);
		System.out.println("성별: "+this.gender);
		System.out.println("나이: "+this.age);
		System.out.println("학번: "+this.sNo);
	}

}
