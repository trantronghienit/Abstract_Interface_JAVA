package Demo;

public class Apple {
	public static void main(String[] args) {
		// đa hình
		System.out.println("==========IPHONE==============");
		Info info_iphone = new iphone();
		info_iphone.ManHinh("4.5 in");
		
//=========thể hiện tính đa hình của interface =========		
		KhuonSanXuat CheTao_iphone = new iphone();  // đa hình
		CheTao_iphone.KhuonDienThoai();
		CheTao_iphone.SacPin(3.4f);
		CheTao_iphone.KhuonPin();
//======================================================
		
		System.out.println("==========IPAD==============");
		Info info_ipad = new ipad(); 
		info_ipad.ManHinh("9.8 in");
		
//=================Thể hiện tính khuôn mẫu của interface ==
		ipad ip = new ipad();
		/* KhuonDienThoai là khuôn chung khai báo đối tượng là KhungDienThoai 
		* nhưng truyền vào bất kì khuôn nào implements từ KhungDienThoai và truyền vào
		*/
		ip.SanXuatIpad(new KhungIpad());  
//========================================================
		
		System.out.println("==========IMAC==============");
		Info info_mac = new PcMac();   // đa hình
		info_mac.ManHinh("13 in");
		info_mac.TrinhDuyet();
		
	}
}
