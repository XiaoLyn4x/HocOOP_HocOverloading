package buiphuongnga.com.test;

import buiphuongnga.com.module.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien teo=new SinhVien(1,"Nguyễn Văn Tèo",9);
		teo.xetTotNghiep();
		teo.xetTotnghiep(4);
		teo.xetTotNghiep(9, 1);

	}

}
