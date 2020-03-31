package day12;

public class Car {
	//Car() {} //디폴트생성자 생성(굳이 안적어도 알아서 추가 됨)
	String company = "기아";
	String model = "쏘울";
	String color = "파랑";
	int maxSpeed = 250;
	int speed = 0;
	
	Car() {
		//오버로딩(중복정의)
		//매개변수가 하나도 없는 생성자와 아래에 있는 생성자
		//필요한만큼 생성할 수 있다.
		//단, 매개변수 순서가 같으면 안된다.
		//Car(String a, String b, int c) Car(String d, String e, int f)
		//위 처럼 만들면 생성자 호출할 때 넘어오는 매개변수 순서가 같아서
		//뭘 호출해야할지 몰라서 오류
		this("기아","검정",300);
//		this.company = "기아";
//		this.color = "검정";
//		this.maxSpeed = 300;
	}
	
	Car(String company, String col, int maxSpeed) {
		this.company = company;
		//this는 생성자(Car)가 속한 클래스(Class Car)
		//변수명을 달리하는 것보다 this를 더 선호
		color = col;
		//color와 col은 구분되므로  this 안써도 됨
		this.maxSpeed = maxSpeed;
	} //생성자 생성(굳이 안적어도 알아서 추가 됨)
	
	Car(String color, int maxSpeed){
		this("기아", color, maxSpeed);
		//아래처럼 계속 써주면 힘드니까 this로 나 자신의 생성자를 호출
//		this.company = "기아";
//		this.color = color;
//		this.maxSpeed = maxSpeed;
	}
	
	Car(int maxSpeed){
		this("기아","검정",maxSpeed);
//		this.company = "기아";
//		this.color = "검정";
//		this.maxSpeed = maxSpeed;
	}
	
//	Car(String company, int maxSpeed, String color){
//		
//	}
//	
//	Car(String col, int speed, int maxSpeed){
//		
//	}
	
	/*메소드를 생성하자*/
	void accel() {
		speed += 10;
		if(speed > maxSpeed) {
			speed = maxSpeed;
		}
		System.out.println("현재 속도"+speed);
	}
	
	void brake() {
		speed = 0;
		System.out.println("현재 속도"+speed);
	}
}
