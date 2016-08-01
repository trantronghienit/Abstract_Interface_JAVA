package Demo;

public class PcMac extends Info{

	@Override
	void ManHinh(String screen) {
		System.out.println("PcMac co man hinh: " + screen);
		
	}

	@Override
	public void TrinhDuyet() {
		System.out.println("Trình Duyệt Trên MAC");
//		super.TrinhDuyet();
	}
}
