package day23;

import java.util.Date;

public class PrintFormatEx {
	public static void main(String[] args) {
		int num = 10;
		double log = Math.log(num);
		System.out.println(Math.log(10));
		System.out.format("log(%d):%+10.6f %n", num, log);
		// %+ 양수
		// %+10.6 -> 총 10자리이고, +가 한자리, 소수점이 한자리, 소수점 밑이 6자리, 남은 2자리가 정수
		Date today = new Date();
		
		System.out.printf("오늘 날짜 : %tY년 %tm월 %td일 \n", today,today,today);
		//%tY 투데이year
		System.out.printf("오늘 날짜 : %1$tY년 %1$tm월 %1$td일 \n", today);
		System.out.printf("오늘 날짜 : %1$tY년 %1$tm월 %1$td일 \n");
	}
}
