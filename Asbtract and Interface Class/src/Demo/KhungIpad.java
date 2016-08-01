package Demo;

public class KhungIpad implements KhuonSanXuat{

	 private String CHIEUDAI = "9,2 mm"; 
	 private String CHIEURONG = "8,8 mm"; 
	 
	@Override
	public void KhuonDienThoai() {
		System.out.println("chieu dai IPAD" + CHIEUDAI);
		System.out.println("chieu rong IPAD" + CHIEURONG);
		
	}

	@Override
	public void KhuonPin() {
		System.out.println("khung pin cho  IPAD 3 x 3" );
	}

	@Override
	public void SacPin(float dongdien) {
		System.out.println("Dong Điện Sạc Cho Ipab " + dongdien);
	}

	 

}
