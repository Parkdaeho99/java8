package day16;

public class Key {
	public int number;
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			//��ü obj�� Key������ ��ȯ�����Ѱ� -> true false
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return super.equals(obj);
	}
	
//	@Override
//	public int hashCode() {
//		return number;
//	}
	public String toString() {
		return "Key��ü�� ����� Number: " + this.number;
	}
	
	
}
