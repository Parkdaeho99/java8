package day12;

public class Grade {
	int kor = 0;
	int eng = 0;
	int mat = 0;
	
	Grade(int kor, int eng, int mat){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	int avg() {
		return (kor+eng+mat)/3;
	}
}
