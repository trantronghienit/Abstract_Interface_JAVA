package Demo;

// hàm nào kế thừa Abstract đều phải viết lại

public class iphone extends Info implements KhuonSanXuat{

	@Override
	void ManHinh(String screen) {
		System.out.println("iphone co man hinh: " + screen);
	}

	
	// TODO: hàm của Interface 
	
	
	@Override
	public void KhuonDienThoai() {
		System.out.println("chieu dai cua ịphone " + KhuonSanXuat.CHIEUDAI_IPHONE);
		System.out.println("chieu rong cua ịphone " + KhuonSanXuat.CHIEURONG_IPHONE);
	}

	@Override
	public void KhuonPin() {
		System.out.println(" khung pin IPHONE ");	
	}

	@Override
	public void SacPin(float dongdien) {
		System.out.println("dong dien sac cho iphone " + dongdien);
	}

}
