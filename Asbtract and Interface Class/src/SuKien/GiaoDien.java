package SuKien;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GiaoDien {
	public static void main(String[] args) {
		NutBam button = new NutBam("Login");
		
		AnNutLogin PhanHoiLogin = new AnNutLogin();
		button.setSuKienannut(PhanHoiLogin);  // yều cầu truyền vào cha nhưng lại truyền vào thằng con 
		// set ấn nút
		button.Annut();
		
		
		// button thực
		AnNutLogin bt = new AnNutLogin();
		JButton jbuton = new JButton("Nut Bam");
		jbuton.addActionListener(bt);
	}

}
// kế thừa Button Thực luôn 
class AnNutLogin implements IPhanHoi , ActionListener {

	@Override
	public void nguoiDungAnNut(String tenNutBam) {
		System.out.println("Login di .........");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("dang nhan nut "+ e.getActionCommand());
		
	}
	
}