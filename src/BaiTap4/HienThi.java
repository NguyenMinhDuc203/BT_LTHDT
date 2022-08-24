package BaiTap4;
import java.util.Scanner;

public class HienThi {
	public static void main(String[] args) {
		ThongTinSinhVien sv1 = new ThongTinSinhVien(21123231, "Nguyen Minh Duc", 9.5, 8.75);
		ThongTinSinhVien sv2 = new ThongTinSinhVien(12345678, "Le Van Truong", 10.0, 7.5);
		System.out.println("Nhap ma so sinh vien cua sinh vien 3 : ");
		Scanner sc = new Scanner(System.in);
		int maSV = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ho va ten cua sinh vien 3 : ");
		String hoTen = sc.nextLine();
		System.out.println("Nhap diem ly thuyet cua sinh vien 3 : ");
		float diemLT = sc.nextFloat();
		System.out.println("Nhap diem thuc hanh cua sinh vien 3 : ");
		float diemTH = sc.nextFloat();
		ThongTinSinhVien sv3 = new ThongTinSinhVien(maSV, hoTen,diemLT, diemTH);
		
		System.out.println(String.format("%-15s %-30s %10s %10s %10s", "maSv", "hoTen", "diemLT", "diemTH", "diemTB"));
		System.out.println(sv1.toString());
		System.out.println(sv2.toString());
		System.out.println(sv3.toString());
		
		sc.close();
	}
}
