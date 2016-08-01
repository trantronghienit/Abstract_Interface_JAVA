package Demo;

/* + không được tạo đối tượng 
 * + class abstract có thể ko có hàm abstract(hàm ảo)
 * + có thể chứa hàm không phải là abstract 
 * */
public abstract class Info {
	private String Baomat;
	private String Os;
	private String Dungluongpin;
	
	
	public Info() {
		super();
	}
	
	public Info(String baomat, String os, String dungluongpin) {
		super();
		Baomat = baomat;
		Os = os;
		Dungluongpin = dungluongpin;
	}
	
	public String getBaomat() {
		return Baomat;
	}
	public void setBaomat(String baomat) {
		Baomat = baomat;
	}
	public String getOs() {
		return Os;
	}
	public void setOs(String os) {
		Os = os;
	}
	public String getDungluongpin() {
		return Dungluongpin;
	}
	public void setDungluongpin(String dungluongpin) {
		Dungluongpin = dungluongpin;
	}
	
	abstract void ManHinh(String screen);
	
	
	//it dùng
	public void TrinhDuyet(){
		System.out.println("trinh duyet info >>> chua co");
	}
}
