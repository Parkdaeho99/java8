package day14;

public class CellPhoneEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		DmbCellPhone dcp = new DmbCellPhone("갤럭시s20", "레드", 10);
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("여보세요.");
		dcp.receiveVoice("택배입니다.");
		dcp.sendVoice("집 앞에 놓아주세요.");
		dcp.receiveVoice("알겠습니다.");
		dcp.hangUp();
		dcp.turnOnDmb();
		dcp.setChannel(100);
		dcp.turnOffDmb();
		dcp.powerOff();
		
		
	}

}
