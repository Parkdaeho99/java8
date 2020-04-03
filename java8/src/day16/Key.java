package day16;

public class Key {
	public int number;
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			//객체 obj가 Key형으로 변환가능한가 -> true false
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
		return "Key객체에 저장된 Number: " + this.number;
	}
	
	
}
