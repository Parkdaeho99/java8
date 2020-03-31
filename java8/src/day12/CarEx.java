package day12;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car("쌍용","노랑",350);
		//Car클래스의 객체 생성(인스턴스화)해서 변수 mycar에 저장
		//클래스가 객체화할 때 가장 먼저+딱 한번만 실행되는 생성자()
		System.out.println(myCar.company);
		System.out.println(myCar.maxSpeed);
		
		myCar.company="현대";
		myCar.model="아반떼";
		myCar.color="은색";
		myCar.maxSpeed=300;
		myCar.speed=100;
		
		System.out.println(myCar.company);
		System.out.println(myCar.maxSpeed);
		
		Car yourCar = new Car();
		System.out.println(yourCar.company);
		System.out.println(yourCar.maxSpeed);
		
		System.out.println("생성자 예제");
		Car c1 = new Car();
		System.out.println(c1.company);
		System.out.println(c1.model);
		System.out.println(c1.color);
		System.out.println(c1.maxSpeed);
		System.out.println(c1.speed);
		
		Car c2 = new Car(250);
		System.out.println(c2.company);
		System.out.println(c2.model);
		System.out.println(c2.color);
		System.out.println(c2.maxSpeed);
		System.out.println(c2.speed);
		
		Car c3 = new Car("파랑", 350);
		System.out.println(c3.company);
		System.out.println(c3.model);
		System.out.println(c3.color);
		System.out.println(c3.maxSpeed);
		System.out.println(c3.speed);
		
		System.out.println("메소드 테스트");
		c3.accel();
		c3.speed = 325;
		c3.accel();
		c3.accel();
		c3.accel();
		c3.brake();
		
	}

}
