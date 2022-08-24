package BaiTap2;

public class Point {
	private int x, y, z;
	private String ten;
	public Point() {
	
	}
	public Point(int x, int y, int z, String ten) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.ten = ten;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Point negate() {
		Point p = new Point(-x, -y, -z, ten);
		return p;
	}
	public double getDistance() {
		return Math.sqrt(x*x+y*y+z*z);
	}
	@Override
	public String toString() {
		return String.format("~%s(%d, %d, %d), Distance = %.2f", ten, x, y, z, getDistance());
	}
	
	
	
	
}
