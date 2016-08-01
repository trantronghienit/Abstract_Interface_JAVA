package SuKien;


// tạo nut bấm
public class NutBam {
	private int dai;
	private int rong ;
	private String TenNutBam;
	
	
	public NutBam() {
		super();
	}
	
	public NutBam(String tenNutBam) {
		super();
		TenNutBam = tenNutBam;
	}

	public NutBam(int dai, int rong, String tenNutBam, IPhanHoi suKienannut) {
		super();
		this.dai = dai;
		this.rong = rong;
		TenNutBam = tenNutBam;
		SuKienannut = suKienannut;
	}


	public String getTenNutBam() {
		return TenNutBam;
	}


	public void setTenNutBam(String tenNutBam) {
		TenNutBam = tenNutBam;
	}


	public int getDai() {
		return dai;
	}


	public void setDai(int dai) {
		this.dai = dai;
	}


	public int getRong() {
		return rong;
	}


	public void setRong(int rong) {
		this.rong = rong;
	}
	// đối tượng Interface phản hồi ấn nút
	private IPhanHoi SuKienannut;
	
	public IPhanHoi getSuKienannut() {
		return SuKienannut;
	}
	
	public void setSuKienannut(IPhanHoi suKienannut) {
		SuKienannut = suKienannut;
	}

	public void Annut(){
		// giảm chiều rộng 
		rong--;
		// phản hồi  lại việc người dùng ấn nút
		if(SuKienannut != null){
			SuKienannut.nguoiDungAnNut(TenNutBam);
		}
		
	}
}
