package BaiTap3;

public class Main {
	public static void main(String[] args) {
		HinhTruCylinder ht = new HinhTruCylinder(2.5, 3.15);
		System.out.println("Dien tich xung quanh : "+ht.tinhDienTichXungQuanh());
		System.out.println("Dien tich toan phan : "+ht.tinhDienTichToanPhan());
		System.out.println("The tich : "+ht.tinhTheTich());
	}
}
