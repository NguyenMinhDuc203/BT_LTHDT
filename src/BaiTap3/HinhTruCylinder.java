package BaiTap3;

public class HinhTruCylinder {
	private double r, h;

	public HinhTruCylinder() {
		
	}

	public HinhTruCylinder(double r, double h) {
		this.r = r;
		this.h = h;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}
	public double tinhDienTichXungQuanh() {
		return Math.PI*2*r*h;
	}
	public double tinhDienTichToanPhan() {
		return Math.PI*r*r*2 +(2*Math.PI*r*h);
	}
	public double tinhTheTich() {
		return Math.PI*r*r*h;
	}
	
}
