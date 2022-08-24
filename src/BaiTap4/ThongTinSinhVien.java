package BaiTap4;

public class ThongTinSinhVien {
	private int maSv;
	private String hoTen;
	private double diemLT;
	private double diemTH;
	
	public ThongTinSinhVien() {
		maSv = 0;
		hoTen = "";
		diemLT = 0;
		diemTH = 0;
	}
	public ThongTinSinhVien(int maSv, String hoTen, double diemLT, double diemTH) {
		this.maSv = maSv<0?0:maSv;
		this.hoTen = hoTen.equals("")?"NAME ERROR":hoTen;
		this.diemLT = (diemLT<0 || diemLT>10)?0:diemLT;
		this.diemTH = (diemTH<0 || diemLT>10)?0:diemTH;
	}
	public int getMaSv() {
		return maSv;
	}
	public void setMaSv(int maSv) {
		this.maSv = maSv<0?0:maSv;

	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		
		this.hoTen = hoTen.equals("")?"NAME ERROR":hoTen;
		
	}
	
	public double getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(double diemLT) {
		this.diemLT = (diemLT<0 || diemLT>10)?0:diemLT;

	}
	public double getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(double diemTH) {
		this.diemTH = (diemTH<0 || diemLT>10)?0:diemTH;

	}
	public double tinhDiemTB() {
		
		return (this.diemLT+this.diemTH)/2;
		
	}
	@Override
	public String toString() {
		return String.format("%-15d %-30s %10.2f %10.2f %10.2f", maSv, hoTen, diemLT, diemTH, tinhDiemTB());
	}
	
	
}
