package java8;

public class Day1008 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int ary1[][] = new int[][] { { 10, 20 }, { 30, 40 }, { 50, 60 } };

		System.out.println(ary1.length); // 3
		System.out.println(ary1[0].length); // 2
		System.out.println(ary1[1].length); // 2
		System.out.println(ary1[2].length); // 2

		int ary2[][] = new int[3][2];
		// (0,0) (0,1) (1,0) (1,1) (2,0) (2,1)
		System.out.println(ary2.length); // 3
		System.out.println(ary2[0].length); // 2
		System.out.println(ary2[1].length); // 2
		System.out.println(ary2[2].length); // 2
		System.out.println();
		int ary3[][] = new int[3][];
		// (0,0) (0,1) (0,2) (0,3) ...
		ary3[0] = new int[5];
		ary3[1] = new int[3];
		ary3[2] = new int[10];
		System.out.println(ary3.length); // 3
		System.out.println(ary3[0].length); //
		System.out.println(ary3[1].length); //
		System.out.println(ary3[2].length); //

	}

}
