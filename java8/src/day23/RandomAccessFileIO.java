package day23;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileIO {
	public static void main(String[] args) throws IOException {
		byte[] data = {21,1,43,12,76,34,54,29,66,99};
		RandomAccessFile rac = new RandomAccessFile("temp.txt", "rw");
		rac.write(data);
		System.out.println("파일출력 : temp.txt");
		System.out.println("-------------------------");
		for(int i=0; i<data.length; i++) {
			int accpoint = (int) ((Math.random()*100)%10); //포인터 지점을 지정하고
			rac.seek(accpoint); //지정했던 지점으로 포인터를 옮기고
			System.out.print("현재 파일 포인터 :"+rac.getFilePointer()); //그 포인터의 위치를 뽑아내고
			System.out.println(", 데이터 : "+rac.read()); //그 위치의 포인터가 가리키는 값을 빼온다.
		}
	}
}
