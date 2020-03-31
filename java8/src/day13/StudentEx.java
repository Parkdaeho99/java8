package day13;

public class StudentEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Student s1 = new Student("홍길동", "남성", 30, 20200001);
		Student s2 = new Student();
		s2.setName("김을동");
		s2.setGender("여성");
		s2.setAge(40);
		s2.setsNo(20200002);
		s1.showinfo();
		s2.showinfo();
	}

}
