package Demo;

public class ipad extends Info{

	
	

	@Override
	void ManHinh(String screen) {
		System.out.println("Ipad co man hinh: " + screen);
		
	}

	public void SanXuatIpad(KhuonSanXuat khuon) {
		if(khuon != null ){
			khuon.KhuonDienThoai();
			khuon.SacPin(5.6f);
			khuon.KhuonPin();
		}
		
	}
}
