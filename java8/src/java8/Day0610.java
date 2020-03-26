package java8;

public class Day0610 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int i;
		for(i=1;i<=10;i++) {
			if(i%2!=0) {
				continue; //현재 회차를 멈추고 반복문 시작지점으로 이동
			}
			System.out.println(i);
		}
	}
	}
